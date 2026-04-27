package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.TransRequiredInfo;

public class GetTransitionRequiredInfoResp extends BaseResponse {
    @SerializedName("data")
    private TransRequiredInfo data;

    public TransRequiredInfo getData() {
        return data;
    }

    public void setData(TransRequiredInfo data) {
        this.data = data;
    }
}
