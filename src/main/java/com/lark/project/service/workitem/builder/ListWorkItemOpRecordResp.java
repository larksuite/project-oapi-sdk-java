package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.ListWorkItemOpRecordRespData;

public class ListWorkItemOpRecordResp extends BaseResponse {
    @SerializedName("data")
    private ListWorkItemOpRecordRespData data;

    public ListWorkItemOpRecordRespData getData() {
        return data;
    }

    public void setData(ListWorkItemOpRecordRespData data) {
        this.data = data;
    }
}
