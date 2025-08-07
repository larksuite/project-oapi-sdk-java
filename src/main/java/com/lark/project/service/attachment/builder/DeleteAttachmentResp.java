package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.measure.model.MeasureData;

public class DeleteAttachmentResp extends BaseResponse {
    @SerializedName("data")
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
