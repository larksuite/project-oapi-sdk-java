package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

import java.util.List;

public class QueryWorkItemResourceResp extends BaseResponse {
    @SerializedName("data")
    private List<QueryWorkItemResourceData> data;

    public List<QueryWorkItemResourceData> getData() {
        return this.data;
    }

    public void setData(List<QueryWorkItemResourceData> data) {
        this.data = data;
    }
}