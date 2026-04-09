package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class CreateWorkItemResourceReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("template_id")
    private Long templateID;
    @SerializedName("field_value_pairs")
    private List<FieldValuePair> fieldValuePairs;

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

    public Long getTemplateID() {
        return templateID;
    }

    public void setTemplateID(Long templateID) {
        this.templateID = templateID;
    }

    public List<FieldValuePair> getFieldValuePairs() {
        return fieldValuePairs;
    }

    public void setFieldValuePairs(List<FieldValuePair> fieldValuePairs) {
        this.fieldValuePairs = fieldValuePairs;
    }
}