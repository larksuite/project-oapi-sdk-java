package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.core.annotation.Query;
import java.io.InputStream;

public class UploadPartReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Path
    @SerializedName("resource_id")
    private String resourceId;

    @Path
    @SerializedName("part_number")
    private Integer partNumber;

    @Query
    @SerializedName("md5")
    private String md5;

    @Body
    private InputStream file;
    private Long fileSize;

    public UploadPartReq() {}

    public UploadPartReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.resourceId = builder.resourceId;
        this.partNumber = builder.partNumber;
        this.md5 = builder.md5;
        this.file = builder.file;
        this.fileSize = builder.fileSize;
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

    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public InputStream getFile() {
        return file;
    }

    public void setFile(InputStream file) {
        this.file = file;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String projectKey;
        private String resourceId;
        private Integer partNumber;
        private String md5;
        private InputStream file;
        private Long fileSize;

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder partNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        public Builder md5(String md5) {
            this.md5 = md5;
            return this;
        }

        public Builder file(InputStream file) {
            this.file = file;
            return this;
        }

        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public UploadPartReq build() {
            return new UploadPartReq(this);
        }
    }
}
