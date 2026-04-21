package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class UpdateWorkItemResourceReq {
    @Body
    private UpdateWorkItemResourceReqBody body;

    public UpdateWorkItemResourceReq() {
    }

    public UpdateWorkItemResourceReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UpdateWorkItemResourceReqBody getUpdateWorkItemResourceReqBody() {
        return this.body;
    }

    public void setUpdateWorkItemResourceReqBody(UpdateWorkItemResourceReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private UpdateWorkItemResourceReqBody body;

        public Builder() {
            body = new UpdateWorkItemResourceReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.body.setWorkItemID(workItemID);
            return this;
        }

        public Builder updateFields(List<FieldValuePair> updateFields) {
            this.body.setUpdateFields(updateFields);
            return this;
        }

        public UpdateWorkItemResourceReq build() {
            return new UpdateWorkItemResourceReq(this);
        }
    }
}