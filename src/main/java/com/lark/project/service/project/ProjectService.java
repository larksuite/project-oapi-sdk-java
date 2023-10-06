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

package com.lark.project.service.project;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.project.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectService {

    private static final Logger log = LoggerFactory.getLogger(ProjectService.class);

    private Config config;

    public ProjectService(Config config) {
        this.config = config;
    }

    // 获取空间详情
    public GetProjectDetailResp getProjectDetail(GetProjectDetailReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/projects/detail"
                , false
                , req);

        GetProjectDetailResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetProjectDetailResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取空间列表
    public ListProjectResp listProject(ListProjectReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/projects"
                , false
                , req);

        ListProjectResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListProjectResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取空间下业务线详情
    public ListProjectBusinessResp listProjectBusiness(ListProjectBusinessReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/business/all"
                , false
                , req);

        ListProjectBusinessResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListProjectBusinessResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取空间下团队人员
    public ListProjectTeamResp listProjectTeam(ListProjectTeamReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/teams/all"
                , false
                , req);

        ListProjectTeamResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListProjectTeamResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取空间下工作项类型
    public ListProjectWorkItemTypeResp listProjectWorkItemType(ListProjectWorkItemTypeReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/all-types"
                , false
                , req);

        ListProjectWorkItemTypeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ListProjectWorkItemTypeResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}