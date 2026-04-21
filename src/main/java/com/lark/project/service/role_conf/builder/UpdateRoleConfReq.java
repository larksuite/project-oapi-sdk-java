package com.lark.project.service.role_conf.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.role_conf.model.RoleConfUpdate;

public class UpdateRoleConfReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private UpdateRoleConfReqBody body;

    public UpdateRoleConfReq() {
    }

    public UpdateRoleConfReq(Builder builder) {
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

    public UpdateRoleConfReqBody getUpdateRoleConfReqBody() {
        return this.body;
    }

    public void setUpdateRoleConfReqBody(UpdateRoleConfReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private UpdateRoleConfReqBody body;

        public Builder() {
            body = new UpdateRoleConfReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder roleId(String roleId) {
            this.body.setRoleId(roleId);
            return this;
        }

        public Builder roleAlias(String roleAlias) {
            this.body.setRoleAlias(roleAlias);
            return this;
        }

        public Builder role(RoleConfUpdate role) {
            this.body.setRole(role);
            return this;
        }

        public UpdateRoleConfReq build() {
            return new UpdateRoleConfReq(this);
        }
    }
}
