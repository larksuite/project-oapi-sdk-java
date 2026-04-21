package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class CreateWorkItemResourceInstanceReqBody {
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("template_id")
    private Long templateID;
    @SerializedName("name")
    private String name;
    @SerializedName("field_value_pairs")
    private List<FieldValuePair> fieldValuePairs;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FieldValuePair> getFieldValuePairs() {
        return fieldValuePairs;
    }

    public void setFieldValuePairs(List<FieldValuePair> fieldValuePairs) {
        this.fieldValuePairs = fieldValuePairs;
    }
}