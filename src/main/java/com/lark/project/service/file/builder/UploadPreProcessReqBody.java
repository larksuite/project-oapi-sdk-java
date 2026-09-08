package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;

public class UploadPreProcessReqBody {
    @SerializedName("size")
    private Long size;
    @SerializedName("file_name")
    private String fileName;
    @SerializedName("field_map")
    private Object fieldMap; // Can be a JSON string or Map
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("resource_id")
    private String resourceId;

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
}
