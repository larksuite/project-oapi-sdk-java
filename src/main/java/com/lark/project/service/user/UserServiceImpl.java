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

package com.lark.project.service.user;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.user.builder.QueryUserDetailReq;
import com.lark.project.service.user.builder.QueryUserDetailResp;
import com.lark.project.service.user.builder.SearchUserReq;
import com.lark.project.service.user.builder.SearchUserResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    private Config config;

    public UserServiceImpl(Config config) {
        this.config = config;
    }

    // 获取用户详情
    public QueryUserDetailResp queryUserDetail(QueryUserDetailReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/user/query"
                , false
                , req);

        QueryUserDetailResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryUserDetailResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/user/query"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 模糊查询指定空间的用户列表
    public SearchUserResp searchUser(SearchUserReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/user/search"
                , false
                , req);

        SearchUserResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchUserResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/user/search"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}