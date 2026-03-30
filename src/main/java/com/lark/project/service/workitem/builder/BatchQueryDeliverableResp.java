package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.Deliverable;
import java.util.List;

public class BatchQueryDeliverableResp extends BaseResponse {
    @SerializedName("data")
    private List<Deliverable> data;

    public List<Deliverable> getData() {
        return data;
    }

    public void setData(List<Deliverable> data) {
        this.data = data;
    }
}
