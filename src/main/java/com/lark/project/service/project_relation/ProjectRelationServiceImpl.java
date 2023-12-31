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

package com.lark.project.service.project_relation;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.project_relation.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectRelationServiceImpl implements ProjectRelationService {

    private static final Logger log = LoggerFactory.getLogger(ProjectRelationServiceImpl.class);

    private Config config;

    public ProjectRelationServiceImpl(Config config) {
        this.config = config;
    }

    // 通过空间关联绑定关联工作项
    public CreateProjectRelationInstancesResp createProjectRelationInstances(CreateProjectRelationInstancesReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/relation/:work_item_type_key/:work_item_id/batch_bind"
                , false
                , req);

        CreateProjectRelationInstancesResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateProjectRelationInstancesResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/relation/:work_item_type_key/:work_item_id/batch_bind"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 通过空间关联解绑关联工作项
    public DeleteProjectRelationInstanceResp deleteProjectRelationInstance(DeleteProjectRelationInstanceReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "DELETE"
                , "/open_api/:project_key/relation/:work_item_type_key/:work_item_id"
                , false
                , req);

        DeleteProjectRelationInstanceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteProjectRelationInstanceResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/relation/:work_item_type_key/:work_item_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取空间关联规则列表
    public QueryProjectRelationResp queryProjectRelation(QueryProjectRelationReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/relation/rules"
                , false
                , req);

        QueryProjectRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryProjectRelationResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/relation/rules"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取空间关联下的关联工作项列表
    public QueryProjectRelationInstanceResp queryProjectRelationInstance(QueryProjectRelationInstanceReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/relation/:work_item_type_key/:work_item_id/work_item_list"
                , false
                , req);

        QueryProjectRelationInstanceResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryProjectRelationInstanceResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/relation/:work_item_type_key/:work_item_id/work_item_list"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}