package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;

public class DownloadAttachmentReqBody {

    @SerializedName("uuid")
    private String UUID;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
