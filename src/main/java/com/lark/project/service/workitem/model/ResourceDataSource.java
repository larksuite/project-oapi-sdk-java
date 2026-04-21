package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class ResourceDataSource {
    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("work_item_type_keys")
    private String workItemTypeKeys;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKeys() {
        return workItemTypeKeys;
    }

    public void setWorkItemTypeKeys(String workItemTypeKeys) {
        this.workItemTypeKeys = workItemTypeKeys;
    }
}