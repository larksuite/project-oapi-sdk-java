package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class UpdateWorkItemResourceReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("work_item_id")
    private Long workItemID;
    @SerializedName("update_fields")
    private List<FieldValuePair> updateFields;

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

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public List<FieldValuePair> getUpdateFields() {
        return updateFields;
    }

    public void setUpdateFields(List<FieldValuePair> updateFields) {
        this.updateFields = updateFields;
    }
}