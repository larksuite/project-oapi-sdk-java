package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class BatchUpdateWorkItemResult {
    @SerializedName("task_id")
    private String taskId;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
