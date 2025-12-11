package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class UpdateCompoundFieldValueReqBody {

    @SerializedName("work_item_id")
    private Long WorkItemID;

    @SerializedName("project_key")
    private String ProjectKey;

    @SerializedName("field_key")
    private String FieldKey;

    @SerializedName("field_alias")
    private String FieldAlias;

    @SerializedName("group_uuid")
    private String GroupUUID;

    @SerializedName("action")
    private String Action;

    @SerializedName("fields")
    private List<List<FieldValuePair>> Fields;

    public Long getWorkItemID() {
        return WorkItemID;
    }

    public void setWorkItemID(Long workItemID) {
        WorkItemID = workItemID;
    }

    public String getProjectKey() {
        return ProjectKey;
    }

    public void setProjectKey(String projectKey) {
        ProjectKey = projectKey;
    }

    public String getFieldKey() {
        return FieldKey;
    }

    public void setFieldKey(String fieldKey) {
        FieldKey = fieldKey;
    }

    public String getFieldAlias() {
        return FieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        FieldAlias = fieldAlias;
    }

    public String getGroupUUID() {
        return GroupUUID;
    }

    public void setGroupUUID(String groupUUID) {
        GroupUUID = groupUUID;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }

    public List<List<FieldValuePair>> getFields() {
        return Fields;
    }

    public void setFields(List<List<FieldValuePair>> fields) {
        Fields = fields;
    }
}
