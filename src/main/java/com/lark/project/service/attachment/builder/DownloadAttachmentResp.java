package com.lark.project.service.attachment.builder;

import com.lark.project.core.response.BaseResponse;

import java.io.ByteArrayOutputStream;

public class DownloadAttachmentResp extends BaseResponse {

    private ByteArrayOutputStream data;

    private String fileName;

    public ByteArrayOutputStream getData() {
        return data;
    }

    public void setData(ByteArrayOutputStream data) {
        this.data = data;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
