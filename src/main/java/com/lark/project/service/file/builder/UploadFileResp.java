package com.lark.project.service.file.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.file.model.UploadFileResult;

public class UploadFileResp extends BaseResponse {
    @SerializedName("data")
    private UploadFileResult data;

    public UploadFileResult getData() {
        return data;
    }

    public void setData(UploadFileResult data) {
        this.data = data;
    }
}
