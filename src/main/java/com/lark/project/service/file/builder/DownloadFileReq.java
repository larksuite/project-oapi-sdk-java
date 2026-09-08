package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Path;

public class DownloadFileReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Path
    @SerializedName("file_token")
    private String fileToken;

    public DownloadFileReq() {}

    public DownloadFileReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.fileToken = builder.fileToken;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getFileToken() {
        return fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String projectKey;
        private String fileToken;

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder fileToken(String fileToken) {
            this.fileToken = fileToken;
            return this;
        }

        public DownloadFileReq build() {
            return new DownloadFileReq(this);
        }
    }
}
