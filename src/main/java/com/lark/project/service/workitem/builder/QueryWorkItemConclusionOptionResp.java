package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.FinishedInfo;

import java.util.List;

public class QueryWorkItemConclusionOptionResp extends BaseResponse {
    @SerializedName("data")
    private List<FinishedInfo> data;

    public List<FinishedInfo> getData() {
        return data;
    }

    public void setData(List<FinishedInfo> data) {
        this.data = data;
    }
}
