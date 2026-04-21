package com.lark.project.service.user_group.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import java.util.List;

public class UpdateUserGroupMembersReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Body
    private UpdateUserGroupMembersReqBody body;

    public UpdateUserGroupMembersReq() {}
    public UpdateUserGroupMembersReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.body = builder.body;
    }
    public static Builder newBuilder() { return new Builder(); }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
    public UpdateUserGroupMembersReqBody getUpdateUserGroupMembersReqBody() { return body; }
    public void setUpdateUserGroupMembersReqBody(UpdateUserGroupMembersReqBody body) { this.body = body; }

    public static class Builder {
        private String projectKey;
        private UpdateUserGroupMembersReqBody body;

        public Builder() { body = new UpdateUserGroupMembersReqBody(); }
        public Builder projectKey(String projectKey) { this.projectKey = projectKey; return this; }
        public Builder userGroupType(String userGroupType) { this.body.setUserGroupType(userGroupType); return this; }
        public Builder userGroupId(String userGroupId) { this.body.setUserGroupId(userGroupId); return this; }
        public Builder addUsers(List<String> addUsers) { this.body.setAddUsers(addUsers); return this; }
        public Builder deleteUsers(List<String> deleteUsers) { this.body.setDeleteUsers(deleteUsers); return this; }
        public Builder replaceUsers(List<String> replaceUsers) { this.body.setReplaceUsers(replaceUsers); return this; }
        public UpdateUserGroupMembersReq build() { return new UpdateUserGroupMembersReq(this); }
    }
}
