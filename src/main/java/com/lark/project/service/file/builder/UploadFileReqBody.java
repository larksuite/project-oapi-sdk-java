package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import java.io.InputStream;

public class UploadFileReqBody {
    private InputStream file;
    private String fileName;
    private long fileSize;
    @SerializedName("field_map")
    private Object fieldMap;
    private String mimeType;

    public InputStream getFile() {
        return file;
    }

    public void setFile(InputStream file) {
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
}
