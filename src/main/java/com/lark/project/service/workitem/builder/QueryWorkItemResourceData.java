package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.workitem.model.MultiText;
import com.lark.project.service.workitem.model.RelationDetail;

import java.util.List;

public class QueryWorkItemResourceData {
    @SerializedName("id")
    private Long id;
    @SerializedName("name")
    private String name;
    @SerializedName("fields")
    private List<FieldValuePair> fields;
    @SerializedName("created_at")
    private Long createdAt;
    @SerializedName("created_by")
    private String createdBy;
    @SerializedName("updated_at")
    private Long updatedAt;
    @SerializedName("updated_by")
    private String updatedBy;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
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
}