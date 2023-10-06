package com.lark.project.core.httpclient;

import com.lark.project.core.request.FormData;
import com.lark.project.core.request.FormDataFile;
import com.lark.project.core.request.RawRequest;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.IOs;
import com.lark.project.core.utils.Jsons;
import com.lark.project.core.utils.Strings;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class HttpTransport implements IHttpTransport {

    private HttpClient httpClient;

    public HttpTransport(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    private HttpEntity buildHttpEntity(RawRequest request) throws UnsupportedEncodingException {
        if (request == null || request.getBody() == null) {
            return null;
        }

        Object body = request.getBody();
        if (body instanceof FormData) {
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            for (Map.Entry<String, Object> entry : ((FormData) body).getParams().entrySet()) {
                builder.addTextBody(entry.getKey(), entry.getValue().toString());
            }
            for (FormDataFile file : ((FormData) body).getFiles()) {
                final File uploadFile = file.getFile();
                builder.addBinaryBody(file.getFieldName(), uploadFile, ContentType.APPLICATION_OCTET_STREAM, Strings.isEmpty(file.getFileName()) ? "unknown" : file.getFileName());
            }
            return builder.build();
        }
        return new StringEntity(Jsons.DEFAULT.toJson(request.getBody()));
    }

    private Map<String,List<String>> convertRespHeader(Header[] allHeaders){
        Map<String,List<String>> respHeaders=new HashMap<>();
        for (int i = 0; i < allHeaders.length; i++) {
            String name = allHeaders[i].getName();
            String value = allHeaders[i].getValue();
            List<String> values=respHeaders.get(name);
            if(values==null){
                values=new ArrayList<>();
                respHeaders.put(name,values);
            }
            values.add(value);
        }
        return respHeaders;
    }

    @Override
    public RawResponse execute(RawRequest request) throws Exception {
        RequestBuilder requestBuilder=RequestBuilder.create(request.getHttpMethod()).setUri(request.getReqUrl()).
                setEntity(buildHttpEntity(request));
        // 设置请求header
        for (Map.Entry<String, List<String>> entry : request.getHeaders().entrySet()) {
            for (String value : entry.getValue()) {
                requestBuilder.setHeader(entry.getKey(), value);
            }
        }

        if (!(request.getBody() instanceof FormData)) {
            requestBuilder.setHeader("content-type", "application/json; charset=utf-8");
        }
        HttpResponse httpResponse=httpClient.execute(requestBuilder.build());
        RawResponse rawResponse = new RawResponse();
        rawResponse.setStatusCode(httpResponse.getStatusLine().getStatusCode());
        rawResponse.setHeaders(convertRespHeader(httpResponse.getAllHeaders()));
        if (request.isSupportDownLoad()) {
            HttpEntity entity=httpResponse.getEntity();
            if(entity!=null){
                rawResponse.setBody(IOs.readAll(entity.getContent()));
            }
        } else {
            HttpEntity entity=httpResponse.getEntity();
            if(entity!=null){
                rawResponse.setBody(EntityUtils.toByteArray(entity));
            }
        }
        return rawResponse;
    }
}
