package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;

import java.io.File;

public class UploadAttachmentReqBody {

    @SerializedName("file")
    private File file;

    private String mimeType;

    @SerializedName("field_key")
    private String fieldKey;

    @SerializedName("field_alias")
    private String fieldAlias;

    @SerializedName("index")
    private Integer index;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldAlias() {
        return fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }
}
