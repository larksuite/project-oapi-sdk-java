package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.file.model.UploadPreProcessResult;

public class UploadPreProcessResp extends BaseResponse {
    @SerializedName("data")
    private UploadPreProcessResult data;

    public UploadPreProcessResult getData() {
        return data;
    }

    public void setData(UploadPreProcessResult data) {
        this.data = data;
    }
}
