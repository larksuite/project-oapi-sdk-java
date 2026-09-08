package com.lark.project.service.file.builder;

import java.io.File;

public class MultipartUploadReq {
    private String projectKey;
    private String resourceType;
    private File file;
    private String fileName;
    private long fileSize;
    private Object fieldMap;
    private String mimeType;
    private String resourceId;
    private int concurrency;

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

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public Object getFieldMap() {
        return fieldMap;
    }

    public void setFieldMap(Object fieldMap) {
        this.fieldMap = fieldMap;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public int getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(int concurrency) {
        this.concurrency = concurrency;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String projectKey;
        private String resourceType;
        private File file;
        private String fileName;
        private long fileSize;
        private Object fieldMap;
        private String mimeType;
        private String resourceId;
        private int concurrency;

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder file(File file) {
            this.file = file;
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileSize(long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public Builder fieldMap(Object fieldMap) {
            this.fieldMap = fieldMap;
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder concurrency(int concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        public MultipartUploadReq build() {
            MultipartUploadReq req = new MultipartUploadReq();
            req.setProjectKey(this.projectKey);
            req.setResourceType(this.resourceType);
            req.setFile(this.file);
            req.setFileName(this.fileName);
            req.setFileSize(this.fileSize);
            req.setFieldMap(this.fieldMap);
            req.setMimeType(this.mimeType);
            req.setResourceId(this.resourceId);
            req.setConcurrency(this.concurrency);
            return req;
        }
    }
}
