package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class RequiredTask {
    @SerializedName("task_id")
    private Long taskId;
    @SerializedName("finished")
    private Boolean finished;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }
}
