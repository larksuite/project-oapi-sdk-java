package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class BatchQueryDeliverableReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_ids")
    private List<Long> workItemIds;

    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }

    public List<Long> getWorkItemIds() { return workItemIds; }
    public void setWorkItemIds(List<Long> workItemIds) { this.workItemIds = workItemIds; }
}
