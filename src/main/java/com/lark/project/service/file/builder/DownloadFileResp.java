package com.lark.project.service.file.builder;

import com.lark.project.core.response.BaseResponse;
import java.io.InputStream;

public class DownloadFileResp extends BaseResponse {
    private InputStream data;
    private String fileName;
    private String mimeType;

    public InputStream getData() {
        return data;
    }

    public void setData(InputStream data) {
        this.data = data;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
