/*
 * Copyright (c) 2023 Lark Technologies Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lark.meegooapi.service.field;

import com.lark.meegooapi.core.Config;
import com.lark.meegooapi.core.Transport;
import com.lark.meegooapi.core.request.RequestOptions;
import com.lark.meegooapi.core.response.RawResponse;
import com.lark.meegooapi.core.utils.Jsons;
import com.lark.meegooapi.core.utils.UnmarshalRespUtil;
import com.lark.meegooapi.service.field.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class FieldService {

    private static final Logger log = LoggerFactory.getLogger(FieldService.class);

    private Config config;

    public FieldService(Config config) {
        this.config = config;
    }

    /*
     *
     */
    public CreateFieldResp createField(CreateFieldReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/field/:work_item_type_key/create"
                , false
                , req);

        // 反序列化
        CreateFieldResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateFieldResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/field/:work_item_type_key/create"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public QueryProjectFieldsResp queryProjectFields(QueryProjectFieldsReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/field/all"
                , false
                , req);

        // 反序列化
        QueryProjectFieldsResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryProjectFieldsResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/field/all"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public UpdateFieldResp updateField(UpdateFieldReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
                , "/open_api/:project_key/field/:work_item_type_key"
                , false
                , req);

        // 反序列化
        UpdateFieldResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateFieldResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/field/:work_item_type_key"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}