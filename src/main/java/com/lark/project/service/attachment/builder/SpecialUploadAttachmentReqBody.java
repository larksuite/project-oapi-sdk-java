package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;

import java.io.File;

public class SpecialUploadAttachmentReqBody {

    @SerializedName("file")
    private java.io.File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
