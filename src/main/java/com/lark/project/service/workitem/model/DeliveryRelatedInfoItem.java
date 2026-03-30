package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class DeliveryRelatedInfoItem {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_id")
    private Long workItemID;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("name")
    private String name;

    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }

    public Long getWorkItemID() { return workItemID; }
    public void setWorkItemID(Long workItemID) { this.workItemID = workItemID; }

    public String getWorkItemTypeKey() { return workItemTypeKey; }
    public void setWorkItemTypeKey(String workItemTypeKey) { this.workItemTypeKey = workItemTypeKey; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
