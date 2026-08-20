package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import java.io.InputStream;

public class UploadFileReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Path
    @SerializedName("resource_type")
    private String resourceType;

    @Body
    private UploadFileReqBody body;

    public UploadFileReq() {}

    public UploadFileReq(Builder builder) {
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

    public UploadFileReqBody getUploadFileReqBody() {
        return body;
    }

    public void setUploadFileReqBody(UploadFileReqBody body) {
        this.body = body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String projectKey;
        private String resourceType;
        private UploadFileReqBody body;

        public Builder() {
            body = new UploadFileReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder file(InputStream file) {
            this.body.setFile(file);
            return this;
        }

        public Builder fileName(String fileName) {
            this.body.setFileName(fileName);
            return this;
        }

        public Builder fileSize(long fileSize) {
            this.body.setFileSize(fileSize);
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

        public UploadFileReq build() {
            return new UploadFileReq(this);
        }
    }
}
