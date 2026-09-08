package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.file.model.UploadPartFinishResult;

public class UploadPartFinishResp extends BaseResponse {
    @SerializedName("data")
    private UploadPartFinishResult data;

    public UploadPartFinishResult getData() {
        return data;
    }

    public void setData(UploadPartFinishResult data) {
        this.data = data;
    }
}
