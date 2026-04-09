package com.lark.project.service.user_group;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.user_group.builder.CreateUserGroupReq;
import com.lark.project.service.user_group.builder.CreateUserGroupResp;
import com.lark.project.service.user_group.builder.QueryUserGroupMembersReq;
import com.lark.project.service.user_group.builder.QueryUserGroupMembersResp;
import com.lark.project.service.user_group.builder.UpdateUserGroupMembersReq;
import com.lark.project.service.user_group.builder.UpdateUserGroupMembersResp;

public class UserGroupServiceImpl implements UserGroupService {
    private Config config;

    public UserGroupServiceImpl(Config config) {
        this.config = config;
    }

    @Override
    public CreateUserGroupResp createUserGroup(CreateUserGroupReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST", "/open_api/:project_key/user_group", false, req);
        CreateUserGroupResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateUserGroupResp.class);
        if (resp == null) {
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }
        resp.setRawResponse(httpResponse);
        resp.setRequest(req);
        return resp;
    }

    @Override
    public QueryUserGroupMembersResp queryUserGroupMembers(QueryUserGroupMembersReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST", "/open_api/:project_key/user_groups/members/page", false, req);
        QueryUserGroupMembersResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryUserGroupMembersResp.class);
        if (resp == null) {
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }
        resp.setRawResponse(httpResponse);
        resp.setRequest(req);
        return resp;
    }

    @Override
    public UpdateUserGroupMembersResp updateUserGroupMembers(UpdateUserGroupMembersReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }
        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PATCH", "/open_api/:project_key/user_group/members", false, req);
        UpdateUserGroupMembersResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateUserGroupMembersResp.class);
        if (resp == null) {
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }
        resp.setRawResponse(httpResponse);
        resp.setRequest(req);
        return resp;
    }
}
