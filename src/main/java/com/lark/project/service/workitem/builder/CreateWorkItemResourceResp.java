package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

public class CreateWorkItemResourceResp extends BaseResponse {
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        @SerializedName("work_item_id")
        private Long workItemID;

        public Long getWorkItemID() {
            return workItemID;
        }

        public void setWorkItemID(Long workItemID) {
            this.workItemID = workItemID;
        }
    }
}