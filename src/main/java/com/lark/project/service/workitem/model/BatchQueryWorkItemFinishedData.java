package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class BatchQueryWorkItemFinishedData {
    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("work_item_id")
    private Long workItemId;

    @SerializedName("finished_infos")
    private List<FinishedInfoItem> finishedInfos;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(Long workItemId) {
        this.workItemId = workItemId;
    }

    public List<FinishedInfoItem> getFinishedInfos() {
        return finishedInfos;
    }

    public void setFinishedInfos(List<FinishedInfoItem> finishedInfos) {
        this.finishedInfos = finishedInfos;
    }
}
