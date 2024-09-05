package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

import java.util.List;

public class SpecialUploadAttachmentResp extends BaseResponse {
    @SerializedName("data")
    private List<String> data;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}
