package com.lark.project.service.file.model;

import com.google.gson.annotations.SerializedName;

public class UploadPartFinishResult {
    @SerializedName("file_token")
    private String fileToken;

    public String getFileToken() {
        return fileToken;
    }

    public void setFileToken(String fileToken) {
        this.fileToken = fileToken;
    }
}
