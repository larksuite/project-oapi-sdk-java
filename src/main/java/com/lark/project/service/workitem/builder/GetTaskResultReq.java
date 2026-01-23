package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Query;

public class GetTaskResultReq {
    @Query
    @SerializedName("task_id")
    private String taskId;

    public GetTaskResultReq() {
    }

    public GetTaskResultReq(Builder builder) {
        this.taskId = builder.taskId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public static class Builder {
        private String taskId;

        public Builder() {
        }

        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public GetTaskResultReq build() {
            return new GetTaskResultReq(this);
        }
    }

}
