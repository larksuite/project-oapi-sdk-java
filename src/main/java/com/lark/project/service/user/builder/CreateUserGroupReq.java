package com.lark.project.service.user.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import java.util.List;

public class CreateUserGroupReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Body
    private CreateUserGroupReqBody body;

    public CreateUserGroupReq() {}
    public CreateUserGroupReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.body = builder.body;
    }
    public static Builder newBuilder() { return new Builder(); }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
    public CreateUserGroupReqBody getCreateUserGroupReqBody() { return body; }
    public void setCreateUserGroupReqBody(CreateUserGroupReqBody body) { this.body = body; }

    public static class Builder {
        private String projectKey;
        private CreateUserGroupReqBody body;

        public Builder() { body = new CreateUserGroupReqBody(); }
        public Builder projectKey(String projectKey) { this.projectKey = projectKey; return this; }
        public Builder name(String name) { this.body.setName(name); return this; }
        public Builder users(List<String> users) { this.body.setUsers(users); return this; }
        public CreateUserGroupReq build() { return new CreateUserGroupReq(this); }
    }
}
