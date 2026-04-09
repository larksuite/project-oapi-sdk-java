package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.common.model.UserDetail;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;

import java.util.List;

public class ResourceDetailWorkItemInfo {
    @SerializedName("id")
    private Long id;
    @SerializedName("name")
    private String name;
    @SerializedName("fields")
    private List<FieldValuePair> fields;
    @SerializedName("created_at")
    private Long createdAt;
    @SerializedName("created_by")
    private Object createdBy;
    @SerializedName("updated_at")
    private Long updatedAt;
    @SerializedName("updated_by")
    private Object updatedBy;
    @SerializedName("multi_texts")
    private List<MultiText> multiTexts;
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("simple_name")
    private String simpleName;
    @SerializedName("template_id")
    private Long templateId;
    @SerializedName("template_type")
    private String templateType;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("relation_fields_detail")
    private List<RelationDetail> relationFieldsDetail;
    @SerializedName("owner")
    private UserDetail owner;
    @SerializedName("template")
    private Template template;
    @SerializedName("role_owners")
    private List<RoleOwner> roleOwners;
    @SerializedName("work_item_id")
    private Long workItemId;
    @SerializedName("template_version")
    private Long templateVersion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FieldValuePair> getFields() {
        return fields;
    }

    public void setFields(List<FieldValuePair> fields) {
        this.fields = fields;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Object getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<MultiText> getMultiTexts() {
        return multiTexts;
    }

    public void setMultiTexts(List<MultiText> multiTexts) {
        this.multiTexts = multiTexts;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public List<RelationDetail> getRelationFieldsDetail() {
        return relationFieldsDetail;
    }

    public void setRelationFieldsDetail(List<RelationDetail> relationFieldsDetail) {
        this.relationFieldsDetail = relationFieldsDetail;
    }

    public UserDetail getOwner() {
        return owner;
    }

    public void setOwner(UserDetail owner) {
        this.owner = owner;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public List<RoleOwner> getRoleOwners() {
        return roleOwners;
    }

    public void setRoleOwners(List<RoleOwner> roleOwners) {
        this.roleOwners = roleOwners;
    }

    public Long getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(Long workItemId) {
        this.workItemId = workItemId;
    }

    public Long getTemplateVersion() {
        return templateVersion;
    }

    public void setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
    }

    public static class Template {
        @SerializedName("id")
        private Long id;
        @SerializedName("work_flow_key")
        private String workFlowKey;
        @SerializedName("state_flow_key")
        private String stateFlowKey;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getWorkFlowKey() {
            return workFlowKey;
        }

        public void setWorkFlowKey(String workFlowKey) {
            this.workFlowKey = workFlowKey;
        }

        public String getStateFlowKey() {
            return stateFlowKey;
        }

        public void setStateFlowKey(String stateFlowKey) {
            this.stateFlowKey = stateFlowKey;
        }
    }
}