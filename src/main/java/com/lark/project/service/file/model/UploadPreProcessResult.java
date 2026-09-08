package com.lark.project.service.file.model;

import com.google.gson.annotations.SerializedName;

public class UploadPreProcessResult {
    @SerializedName("is_multipart")
    private Boolean isMultipart;
    @SerializedName("multipart")
    private MultipartInfo multipart;
    @SerializedName("resource_id")
    private String resourceId;

    public Boolean getIsMultipart() {
        return isMultipart;
    }

    public void setIsMultipart(Boolean isMultipart) {
        this.isMultipart = isMultipart;
    }

    public MultipartInfo getMultipart() {
        return multipart;
    }

    public void setMultipart(MultipartInfo multipart) {
        this.multipart = multipart;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
