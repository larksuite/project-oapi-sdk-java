package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;

import java.io.File;

public class UploadAttachmentReqBody {

    @SerializedName("file")
    private File file;

    @SerializedName("field_key")
    private String fieldKey;

    @SerializedName("field_alias")
    private String fieldAlias;

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
}
