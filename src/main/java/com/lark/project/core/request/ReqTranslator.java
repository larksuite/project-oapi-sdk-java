/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.project.core.request;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.Config;
import com.lark.project.core.Constants;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.core.annotation.Query;
import com.lark.project.core.token.GlobalTokenManager;
import com.lark.project.core.utils.Lists;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ReqTranslator {

    private static String encode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            // won't happen
        }
        return "";
    }

    public RawRequest translate(Object req
            , Config config, String httpMethod, String httpPath
            , boolean skipAuth, RequestOptions requestOptions) throws Exception {

        // 解析path,query,body 参数
        ParsedReq parsedReq = parseInput(req, requestOptions);

        // 拼接URL
        String reqUrl = getFullReqUrl(config.getBaseUrl(), httpPath, parsedReq.pathMap,
                parsedReq.queryMap);

        // headers
        Map<String, List<String>> headers = requestOptions.getHeaders();
        if (headers == null) {
            headers = new HashMap<>();
        }

        headers.put("User-Agent", Lists.newArrayList("oapi-sdk-java/" + Constants.VERSION));


        // 获取并缓存token
        if (!skipAuth) {
            List<String> values = headers.get(Constants.HTTP_HEADER_ACCESS_TOKEN);
            if (!config.isDisableTokenCache() && values == null) {
                headers.put("X-PLUGIN-TOKEN", Lists.newArrayList(GlobalTokenManager.getTokenManager()
                        .getAccessTokenThenCache(config)));
            }
        }

        RawRequest rawRequest = new RawRequest();
        rawRequest.setBody(parsedReq.body);
        rawRequest.setReqUrl(reqUrl);
        rawRequest.setHeaders(headers);
        rawRequest.setHttpMethod(httpMethod);
        rawRequest.setConfig(config);
        rawRequest.setSupportDownLoad(requestOptions.isSupportUpload());
        return rawRequest;
    }

    private ParsedReq parseInput(Object req, RequestOptions requestOptions)
            throws IllegalAccessException {
        // 解析 path,body,query注解
        ParsedReq parsedReq = new ParsedReq();
        if (req == null) {
            return parsedReq;
        }
        Field[] fields = req.getClass().getDeclaredFields();
        boolean hasHttpAnnotation = false;
        if (fields != null) {
            for (Field field : fields) {
                // 解析body注解
                field.setAccessible(true);
                Body body = field.getAnnotation(Body.class);
                if (body != null) {
                    hasHttpAnnotation = true;
                    parsedReq.body = field.get(req);
                }

                // 解析Path注解
                Path path = field.getAnnotation(Path.class);
                if (path != null) {
                    hasHttpAnnotation = true;
                    SerializedName serializedName = field.getAnnotation(SerializedName.class);
                    if (null != field.get(req)) {
                        parsedReq.pathMap.put(serializedName.value(), field.get(req));
                    }
                }

                // 解析Query注解
                Query query = field.getAnnotation(Query.class);
                if (query != null) {
                    hasHttpAnnotation = true;
                    SerializedName serializedName = field.getAnnotation(SerializedName.class);
                    if (null != field.get(req)) {
                        parsedReq.queryMap.put(serializedName.value(), field.get(req));
                    }
                }
            }
        }

        if (!hasHttpAnnotation) {
            parsedReq.body = req;
        }

        if (parsedReq.body != null) {
            if (requestOptions.isSupportUpload()) {
                parsedReq.body = buildFormData(parsedReq.body);
            }
        }

        return parsedReq;
    }

    private FormData buildFormData(Object body) throws IllegalAccessException {
        // 构建form-data格式的数据
        FormData formData = new FormData();
        Field[] fields = body.getClass().getDeclaredFields();
        if (fields != null) {
            String mimeType = "application/octet-stream";
            try {
                Field fieldMimeType = body.getClass().getDeclaredField("mimeType");
                if (fieldMimeType != null) {
                    fieldMimeType.setAccessible(true);
                    String mimeTypeField = (String) fieldMimeType.get(body);
                    if (mimeTypeField != null && !mimeTypeField.isEmpty()) {
                        mimeType = mimeTypeField;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.getType() == File.class) {
                    SerializedName serializedName = field.getAnnotation(SerializedName.class);
                    File file = (File) field.get(body);
                    FormDataFile formDataFile = new FormDataFile();
                    formDataFile.setFile(file);
                    formDataFile.setFieldName(serializedName.value().trim());
                    formDataFile.setFileName(file.getName());
                    formDataFile.setMimetype(mimeType);
                    formData.addFile(serializedName.value().trim(), formDataFile);
                } else {
                    SerializedName serializedName = field.getAnnotation(SerializedName.class);
                    if (serializedName != null && field.get(body) != null) {
                        formData.addField(serializedName.value().trim(), field.get(body));
                    }
                }
            }
        }

        return formData;
    }

    private String getFullReqUrl(String domain, String httpPath, Map<String, Object> pathMap,
                                 Map<String, Object> queryMap) {
        String reqUrl = joinPathParam(httpPath, pathMap);
        if (!reqUrl.startsWith("http")) {
            reqUrl = domain + reqUrl;
        }

        if (queryMap.size() > 0) {
            reqUrl += "?" + this.buildQuery(queryMap);
        }

        return reqUrl;
    }

    private String joinPathParam(String path, Map<String, Object> pathMap) {
        if (pathMap.size() == 0) {
            return path;
        }
        String tmpPath = path;
        StringBuilder newPath = new StringBuilder();
        for (; true; ) {
            int i = tmpPath.indexOf(":");
            if (i == -1) {
                newPath.append(tmpPath);
                break;
            }
            newPath.append(tmpPath, 0, i);
            String subPath = tmpPath.substring(i);
            int j = subPath.indexOf("/");
            if (j == -1) {
                j = subPath.length();
            }
            String varName = subPath.substring(1, j);
            if (varName.equals("")) {
                newPath.append(subPath.substring(0, j));
            } else {
                Object v = pathMap.get(varName);
                if (v == null) {
                    throw new IllegalArgumentException(
                            "path:" + path + ", param name:" + varName + " not found value");
                }
                newPath.append(v.toString());
            }
            if (j == subPath.length()) {
                break;
            }
            tmpPath = subPath.substring(j);
        }
        return newPath.toString();
    }

    private String buildQuery(Map<String, Object> params) {
        if (params == null || params.isEmpty()) {
            return "";
        }
        Set<Map.Entry<String, Object>> entries = params.entrySet();
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Object> entry : entries) {
            String name = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                continue;
            }
            if (value instanceof List) {
                for (Object o : (List) value) {
                    list.add(name + "=" + encode(o.toString()));
                }
            } else if (value.getClass().isArray()) {
                int len = Array.getLength(value);
                for (int i = 0; i < len; i++) {
                    list.add(name + "=" + encode(Array.get(value, i).toString()));
                }
            } else {
                list.add(name + "=" + encode(value.toString()));
            }
        }
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder query = new StringBuilder();
        for (String s : list) {
            query.append(s).append("&");
        }
        return query.deleteCharAt(query.length() - 1).toString();
    }

    private class ParsedReq {
        private HashMap<String, Object> pathMap = new HashMap<>();
        private HashMap<String, Object> queryMap = new HashMap<>();
        private Object body;
    }

}
