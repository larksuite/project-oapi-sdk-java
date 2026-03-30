package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;

public class FreezeWorkItemReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_id")
    private Long workItemID;
    @SerializedName("is_frozen")
    private Boolean isFrozen;

    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }

    public Long getWorkItemID() { return workItemID; }
    public void setWorkItemID(Long workItemID) { this.workItemID = workItemID; }

    public Boolean getIsFrozen() { return isFrozen; }
    public void setIsFrozen(Boolean isFrozen) { this.isFrozen = isFrozen; }
}
