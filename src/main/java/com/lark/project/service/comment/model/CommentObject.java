package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;

public class CommentObject {
    @SerializedName("type")
    private String type;
    @SerializedName("field_key")
    private String fieldKey;
    @SerializedName("parent_id")
    private String parentId;
    @SerializedName("work_item_id")
    private String workItemId;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getFieldKey() { return fieldKey; }
    public void setFieldKey(String fieldKey) { this.fieldKey = fieldKey; }
    public String getParentId() { return parentId; }
    public void setParentId(String parentId) { this.parentId = parentId; }
    public String getWorkItemId() { return workItemId; }
    public void setWorkItemId(String workItemId) { this.workItemId = workItemId; }
    public String getWorkItemTypeKey() { return workItemTypeKey; }
    public void setWorkItemTypeKey(String workItemTypeKey) { this.workItemTypeKey = workItemTypeKey; }
}
