package com.lark.project.service.user_group.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import java.util.List;

public class QueryUserGroupMembersReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Body
    private QueryUserGroupMembersReqBody body;

    public QueryUserGroupMembersReq() {}
    public QueryUserGroupMembersReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.body = builder.body;
    }
    public static Builder newBuilder() { return new Builder(); }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
    public QueryUserGroupMembersReqBody getQueryUserGroupMembersReqBody() { return body; }
    public void setQueryUserGroupMembersReqBody(QueryUserGroupMembersReqBody body) { this.body = body; }

    public static class Builder {
        private String projectKey;
        private QueryUserGroupMembersReqBody body;

        public Builder() { body = new QueryUserGroupMembersReqBody(); }
        public Builder projectKey(String projectKey) { this.projectKey = projectKey; return this; }
        public Builder userGroupType(String userGroupType) { this.body.setUserGroupType(userGroupType); return this; }
        public Builder userGroupIds(List<String> userGroupIds) { this.body.setUserGroupIds(userGroupIds); return this; }
        public Builder pageNum(Long pageNum) { this.body.setPageNum(pageNum); return this; }
        public Builder pageSize(Long pageSize) { this.body.setPageSize(pageSize); return this; }
        public QueryUserGroupMembersReq build() { return new QueryUserGroupMembersReq(this); }
    }
}
