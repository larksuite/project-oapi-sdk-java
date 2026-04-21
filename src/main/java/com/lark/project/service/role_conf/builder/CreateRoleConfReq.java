package com.lark.project.service.role_conf.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.role_conf.model.RoleConfCreate;

public class CreateRoleConfReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private CreateRoleConfReqBody body;

    public CreateRoleConfReq() {
    }

    public CreateRoleConfReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public CreateRoleConfReqBody getCreateRoleConfReqBody() {
        return this.body;
    }

    public void setCreateRoleConfReqBody(CreateRoleConfReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private CreateRoleConfReqBody body;

        public Builder() {
            body = new CreateRoleConfReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder role(RoleConfCreate role) {
            this.body.setRole(role);
            return this;
        }

        public CreateRoleConfReq build() {
            return new CreateRoleConfReq(this);
        }
    }
}
