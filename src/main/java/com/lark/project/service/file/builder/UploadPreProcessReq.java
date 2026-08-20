package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

public class UploadPreProcessReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Path
    @SerializedName("resource_type")
    private String resourceType;

    @Body
    private UploadPreProcessReqBody body;

    public UploadPreProcessReq() {}

    public UploadPreProcessReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.resourceType = builder.resourceType;
        this.body = builder.body;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UploadPreProcessReqBody getUploadPreProcessReqBody() {
        return body;
    }

    public void setUploadPreProcessReqBody(UploadPreProcessReqBody body) {
        this.body = body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String projectKey;
        private String resourceType;
        private UploadPreProcessReqBody body;

        public Builder() {
            body = new UploadPreProcessReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder size(Long size) {
            this.body.setSize(size);
            return this;
        }

        public Builder fileName(String fileName) {
            this.body.setFileName(fileName);
            return this;
        }

        public Builder fieldMap(Object fieldMap) {
            this.body.setFieldMap(fieldMap);
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.body.setMimeType(mimeType);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.body.setResourceId(resourceId);
            return this;
        }

        public UploadPreProcessReq build() {
            return new UploadPreProcessReq(this);
        }
    }
}
