package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;

public class GetTransitionRequiredInfoReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("work_item_id")
    private Long workItemId;
    @SerializedName("state_key")
    private String stateKey;
    @SerializedName("mode")
    private String mode;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public Long getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(Long workItemId) {
        this.workItemId = workItemId;
    }

    public String getStateKey() {
        return stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
