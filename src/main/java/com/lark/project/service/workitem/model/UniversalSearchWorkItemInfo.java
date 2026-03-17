package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UniversalSearchWorkItemInfo {
    @SerializedName("id")
    private Long id;

    @SerializedName("name")
    private String name;

    @SerializedName("fields")
    private List<UniversalSearchField> fields;

    @SerializedName("created_at")
    private Long createdAt;

    @SerializedName("created_by")
    private String createdBy;

    @SerializedName("deleted_at")
    private Long deletedAt;

    @SerializedName("deleted_by")
    private String deletedBy;

    @SerializedName("updated_at")
    private Long updatedAt;

    @SerializedName("updated_by")
    private String updatedBy;

    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("simple_name")
    private String simpleName;

    @SerializedName("state_times")
    private List<StateTime> stateTimes;

    @SerializedName("template_id")
    private Long templateID;

    @SerializedName("current_nodes")
    private List<UniversalSearchCurrentNode> currentNodes;

    @SerializedName("template_type")
    private String templateType;

    @SerializedName("work_item_status")
    private WorkItemStatus workItemStatus;

    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    public Long getID() {
        return this.id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UniversalSearchField> getFields() {
        return this.fields;
    }

    public void setFields(List<UniversalSearchField> fields) {
        this.fields = fields;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getDeletedAt() {
        return this.deletedAt;
    }

    public void setDeletedAt(Long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getDeletedBy() {
        return this.deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getSimpleName() {
        return this.simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public List<StateTime> getStateTimes() {
        return this.stateTimes;
    }

    public void setStateTimes(List<StateTime> stateTimes) {
        this.stateTimes = stateTimes;
    }

    public Long getTemplateID() {
        return this.templateID;
    }

    public void setTemplateID(Long templateID) {
        this.templateID = templateID;
    }

    public List<UniversalSearchCurrentNode> getCurrentNodes() {
        return this.currentNodes;
    }

    public void setCurrentNodes(List<UniversalSearchCurrentNode> currentNodes) {
        this.currentNodes = currentNodes;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public WorkItemStatus getWorkItemStatus() {
        return this.workItemStatus;
    }

    public void setWorkItemStatus(WorkItemStatus workItemStatus) {
        this.workItemStatus = workItemStatus;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public static class UniversalSearchField {
        @SerializedName("field_key")
        private String fieldKey;

        @SerializedName("field_alias")
        private String fieldAlias;

        @SerializedName("field_value")
        private Object fieldValue;

        @SerializedName("field_type_key")
        private String fieldTypeKey;

        public String getFieldKey() {
            return this.fieldKey;
        }

        public void setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
        }

        public String getFieldAlias() {
            return this.fieldAlias;
        }

        public void setFieldAlias(String fieldAlias) {
            this.fieldAlias = fieldAlias;
        }

        public Object getFieldValue() {
            return this.fieldValue;
        }

        public void setFieldValue(Object fieldValue) {
            this.fieldValue = fieldValue;
        }

        public String getFieldTypeKey() {
            return this.fieldTypeKey;
        }

        public void setFieldTypeKey(String fieldTypeKey) {
            this.fieldTypeKey = fieldTypeKey;
        }
    }

    public static class UniversalSearchCurrentNode {
        @SerializedName("id")
        private String id;

        @SerializedName("name")
        private String name;

        @SerializedName("owners")
        private List<String> owners;

        public String getID() {
            return this.id;
        }

        public void setID(String id) {
            this.id = id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getOwners() {
            return this.owners;
        }

        public void setOwners(List<String> owners) {
            this.owners = owners;
        }
    }
}
