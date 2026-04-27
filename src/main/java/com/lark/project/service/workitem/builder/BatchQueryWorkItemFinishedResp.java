package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.BatchQueryWorkItemFinishedData;

public class BatchQueryWorkItemFinishedResp extends BaseResponse {
    @SerializedName("data")
    private BatchQueryWorkItemFinishedData data;

    public BatchQueryWorkItemFinishedData getData() {
        return data;
    }

    public void setData(BatchQueryWorkItemFinishedData data) {
        this.data = data;
    }
}
