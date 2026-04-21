package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.Expand;

import java.util.List;

public class QueryWorkItemResourceReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_ids")
    private List<Long> workItemIDs;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("fields")
    private List<String> fields;
    @SerializedName("expand")
    private Expand expand;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public List<Long> getWorkItemIDs() {
        return workItemIDs;
    }

    public void setWorkItemIDs(List<Long> workItemIDs) {
        this.workItemIDs = workItemIDs;
    }

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public Expand getExpand() {
        return expand;
    }

    public void setExpand(Expand expand) {
        this.expand = expand;
    }
}