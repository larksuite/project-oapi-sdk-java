package com.lark.project.service.user_group;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.user_group.builder.CreateUserGroupReq;
import com.lark.project.service.user_group.builder.CreateUserGroupResp;
import com.lark.project.service.user_group.builder.QueryUserGroupMembersReq;
import com.lark.project.service.user_group.builder.QueryUserGroupMembersResp;
import com.lark.project.service.user_group.builder.UpdateUserGroupMembersReq;
import com.lark.project.service.user_group.builder.UpdateUserGroupMembersResp;

public interface UserGroupService {
    public CreateUserGroupResp createUserGroup(CreateUserGroupReq req, RequestOptions reqOptions) throws Exception;
    public QueryUserGroupMembersResp queryUserGroupMembers(QueryUserGroupMembersReq req, RequestOptions reqOptions) throws Exception;
    public UpdateUserGroupMembersResp updateUserGroupMembers(UpdateUserGroupMembersReq req, RequestOptions reqOptions) throws Exception;
}
