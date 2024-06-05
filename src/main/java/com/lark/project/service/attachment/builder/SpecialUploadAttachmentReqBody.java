package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;

import java.io.File;

public class SpecialUploadAttachmentReqBody {

    @SerializedName("file")
    private File file;

    private String mimeType;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
