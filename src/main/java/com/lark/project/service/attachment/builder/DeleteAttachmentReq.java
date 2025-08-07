package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

import java.io.File;
import java.util.List;

public class DeleteAttachmentReq {
    @Body
    private DeleteAttachmentReqBody body;

    public DeleteAttachmentReq() {
    }

    public DeleteAttachmentReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public DeleteAttachmentReqBody getDeleteAttachmentReqBody() {
        return this.body;
    }

    public void setDeleteAttachmentReqBody(DeleteAttachmentReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private DeleteAttachmentReqBody body;

        public Builder() {
            body = new DeleteAttachmentReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workitemID(String workitemID) {
            this.body.setWorkitemID(workitemID);
            return this;
        }

        public Builder fieldKey(String fieldKey) {
            this.body.setFieldKey(fieldKey);
            return this;
        }

        public Builder fieldAlias(String fieldAlias) {
            this.body.setFieldAlias(fieldAlias);
            return this;
        }

        public Builder uuids(List<String> uuids) {
            this.body.setUuids(uuids);
            return this;
        }

        public DeleteAttachmentReq build() {
            return new DeleteAttachmentReq(this);
        }

    }

}
