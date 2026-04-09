package com.lark.project.service.role_conf.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

public class DeleteRoleConfReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private DeleteRoleConfReqBody body;

    public DeleteRoleConfReq() {
    }

    public DeleteRoleConfReq(Builder builder) {
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

    public DeleteRoleConfReqBody getDeleteRoleConfReqBody() {
        return this.body;
    }

    public void setDeleteRoleConfReqBody(DeleteRoleConfReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private DeleteRoleConfReqBody body;

        public Builder() {
            body = new DeleteRoleConfReqBody();
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

        public DeleteRoleConfReq build() {
            return new DeleteRoleConfReq(this);
        }
    }
}
