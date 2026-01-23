package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetTaskResult {
    @SerializedName("task_id")
    private String taskId;

    @SerializedName("task_status")
    private String taskStatus;

    @SerializedName("total")
    private Long total;

    @SerializedName("success_total")
    private Long successTotal;

    @SerializedName("error_total")
    private Long errorTotal;

    @SerializedName("success_sub_task_list")
    private List<String> successSubTaskList;

    @SerializedName("fail_sub_task_list")
    private List<String> failSubTaskList;

    @SerializedName("error_scenes")
    private List<String> errorScenes;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getSuccessTotal() {
        return successTotal;
    }

    public void setSuccessTotal(Long successTotal) {
        this.successTotal = successTotal;
    }

    public Long getErrorTotal() {
        return errorTotal;
    }

    public void setErrorTotal(Long errorTotal) {
        this.errorTotal = errorTotal;
    }

    public List<String> getSuccessSubTaskList() {
        return successSubTaskList;
    }

    public void setSuccessSubTaskList(List<String> successSubTaskList) {
        this.successSubTaskList = successSubTaskList;
    }

    public List<String> getFailSubTaskList() {
        return failSubTaskList;
    }

    public void setFailSubTaskList(List<String> failSubTaskList) {
        this.failSubTaskList = failSubTaskList;
    }

    public List<String> getErrorScenes() {
        return errorScenes;
    }

    public void setErrorScenes(List<String> errorScenes) {
        this.errorScenes = errorScenes;
    }
}
