package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class CreateWorkItemResourceInstanceReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Path
    @SerializedName("work_item_id")
    private Long workItemID;

    @Body
    private CreateWorkItemResourceInstanceReqBody body;

    public CreateWorkItemResourceInstanceReq() {
    }

    public CreateWorkItemResourceInstanceReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public CreateWorkItemResourceInstanceReqBody getCreateWorkItemResourceInstanceReqBody() {
        return this.body;
    }

    public void setCreateWorkItemResourceInstanceReqBody(CreateWorkItemResourceInstanceReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private Long workItemID;
        private CreateWorkItemResourceInstanceReqBody body;

        public Builder() {
            body = new CreateWorkItemResourceInstanceReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder templateID(Long templateID) {
            this.body.setTemplateID(templateID);
            return this;
        }

        public Builder name(String name) {
            this.body.setName(name);
            return this;
        }

        public Builder fieldValuePairs(List<FieldValuePair> fieldValuePairs) {
            this.body.setFieldValuePairs(fieldValuePairs);
            return this;
        }

        public CreateWorkItemResourceInstanceReq build() {
            return new CreateWorkItemResourceInstanceReq(this);
        }
    }
}