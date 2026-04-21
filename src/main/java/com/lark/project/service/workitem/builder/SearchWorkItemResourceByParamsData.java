package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.common.model.UserDetail;
import com.lark.project.service.user.model.RoleOwner;

import java.util.List;

public class SearchWorkItemResourceByParamsData {
    @SerializedName("name")
    private String name;
    @SerializedName("owner")
    private UserDetail owner;
    @SerializedName("template")
    private Template template;
    @SerializedName("created_at")
    private Long createdAt;
    @SerializedName("created_by")
    private UserDetail createdBy;
    @SerializedName("updated_at")
    private Long updatedAt;
    @SerializedName("updated_by")
    private UserDetail updatedBy;
    @SerializedName("role_owners")
    private List<RoleOwner> roleOwners;
    @SerializedName("work_item_id")
    private Long workItemId;
    @SerializedName("template_version")
    private Long templateVersion;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("template_type")
    private String templateType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public UserDetail getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserDetail createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserDetail getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserDetail updatedBy) {
        this.updatedBy = updatedBy;
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

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
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