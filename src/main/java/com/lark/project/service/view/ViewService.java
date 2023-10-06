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

package com.lark.project.service.view;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.view.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ViewService {

    private static final Logger log = LoggerFactory.getLogger(ViewService.class);

    private Config config;

    public ViewService(Config config) {
        this.config = config;
    }

    // 创建固定视图
    public CreateFixViewResp createFixView(CreateFixViewReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/:work_item_type_key/fix_view"
                , false
                , req);

        CreateFixViewResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateFixViewResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 删除固定视图
    public DeleteFixViewResp deleteFixView(DeleteFixViewReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "DELETE"
                , "/open_api/:project_key/fix_view/:view_id"
                , false
                , req);

        DeleteFixViewResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteFixViewResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取视图下工作项列表（全景视图）
    public QueryWorkItemDetailsByViewIDResp queryWorkItemDetailsByViewID(QueryWorkItemDetailsByViewIDReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/view/:view_id"
                , false
                , req);

        QueryWorkItemDetailsByViewIDResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryWorkItemDetailsByViewIDResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新固定视图
    public UpdateFixViewResp updateFixView(UpdateFixViewReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/:work_item_type_key/fix_view/:view_id"
                , false
                , req);

        UpdateFixViewResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateFixViewResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取视图列表
    public ViewListResp viewList(ViewListReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/view_conf/list"
                , false
                , req);

        ViewListResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ViewListResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取视图下工作项列表
    public WorkItemListResp workItemList(WorkItemListReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/fix_view/:view_id"
                , false
                , req);

        WorkItemListResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, WorkItemListResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}