package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class CreateWorkItemResourceReq {
    @Body
    private CreateWorkItemResourceReqBody body;

    public CreateWorkItemResourceReq() {
    }

    public CreateWorkItemResourceReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CreateWorkItemResourceReqBody getCreateWorkItemResourceReqBody() {
        return this.body;
    }

    public void setCreateWorkItemResourceReqBody(CreateWorkItemResourceReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private CreateWorkItemResourceReqBody body;

        public Builder() {
            body = new CreateWorkItemResourceReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
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

        public Builder fieldValuePairs(List<FieldValuePair> fieldValuePairs) {
            this.body.setFieldValuePairs(fieldValuePairs);
            return this;
        }

        public CreateWorkItemResourceReq build() {
            return new CreateWorkItemResourceReq(this);
        }
    }
}