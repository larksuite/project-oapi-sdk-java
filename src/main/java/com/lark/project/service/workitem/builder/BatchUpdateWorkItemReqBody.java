package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class BatchUpdateWorkItemReqBody {
    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("work_item_ids")
    private List<Long> workItemIds;

    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    @SerializedName("update_mode")
    private String updateMode;

    @SerializedName("field_key")
    private String fieldKey;

    @SerializedName("before_field_value")
    private Object beforeFieldValue;

    @SerializedName("after_field_value")
    private Object afterFieldValue;


    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public List<Long> getWorkItemIds() {
        return workItemIds;
    }

    public void setWorkItemIds(List<Long> workItemIds) {
        this.workItemIds = workItemIds;
    }

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public String getUpdateMode() {
        return updateMode;
    }

    public void setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
    }

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public Object getBeforeFieldValue() {
        return beforeFieldValue;
    }

    public void setBeforeFieldValue(Object beforeFieldValue) {
        this.beforeFieldValue = beforeFieldValue;
    }

    public Object getAfterFieldValue() {
        return afterFieldValue;
    }

    public void setAfterFieldValue(Object afterFieldValue) {
        this.afterFieldValue = afterFieldValue;
    }
}
