package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.GetTaskResult;

import java.util.List;

public class GetTaskResultResp extends BaseResponse {

    @SerializedName("data")
    private GetTaskResult data;

    public GetTaskResult getData() {
        return data;
    }

    public void setData(GetTaskResult data) {
        this.data = data;
    }
}
