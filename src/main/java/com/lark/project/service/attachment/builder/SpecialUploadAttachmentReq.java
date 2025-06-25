package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

import java.io.File;

public class SpecialUploadAttachmentReq {

    @Path
    @SerializedName("project_key")
    private String projectKey;


    @Body
    private SpecialUploadAttachmentReqBody body;

    public SpecialUploadAttachmentReq() {
    }

    public SpecialUploadAttachmentReq(Builder builder) {
        this.projectKey = builder.projectKey;
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

    public SpecialUploadAttachmentReqBody getSpecialUploadAttachmentReqBody() {
        return this.body;
    }

    public void setSpecialUploadAttachmentReqBody(SpecialUploadAttachmentReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private SpecialUploadAttachmentReqBody body;

        public Builder() {
            body = new SpecialUploadAttachmentReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder file(File file) {
            this.body.setFile(file);
            return this;
        }

        public Builder fileMimeType(String mimeType) {
            this.body.setMimeType(mimeType);
            return this;
        }
        public SpecialUploadAttachmentReq build() {
            return new SpecialUploadAttachmentReq(this);
        }

    }
}
