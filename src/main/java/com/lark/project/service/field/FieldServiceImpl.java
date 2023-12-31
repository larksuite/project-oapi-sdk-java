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

package com.lark.project.service.field;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.field.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FieldServiceImpl implements FieldService {

    private static final Logger log = LoggerFactory.getLogger(FieldServiceImpl.class);

    private Config config;

    public FieldServiceImpl(Config config) {
        this.config = config;
    }

    // 创建自定义字段
    public CreateFieldResp createField(CreateFieldReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/field/:work_item_type_key/create"
                , false
                , req);

        CreateFieldResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateFieldResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/field/:work_item_type_key/create"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取空间字段
    public QueryProjectFieldsResp queryProjectFields(QueryProjectFieldsReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/field/all"
                , false
                , req);

        QueryProjectFieldsResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryProjectFieldsResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/field/all"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新自定义字段
    public UpdateFieldResp updateField(UpdateFieldReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PUT"
                , "/open_api/:project_key/field/:work_item_type_key"
                , false
                , req);

        UpdateFieldResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateFieldResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/field/:work_item_type_key"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}