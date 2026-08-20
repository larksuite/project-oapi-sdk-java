package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Path;

public class UploadPartFinishReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Path
    @SerializedName("resource_id")
    private String resourceId;

    public UploadPartFinishReq() {}

    public UploadPartFinishReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.resourceId = builder.resourceId;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String projectKey;
        private String resourceId;

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public UploadPartFinishReq build() {
            return new UploadPartFinishReq(this);
        }
    }
}
