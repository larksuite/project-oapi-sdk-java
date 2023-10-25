/*
 * Copyright (c) 2023 Lark Technologies Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.common.model.UserDetail;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;


public class WorkItemInfo {
    @SerializedName("id")
    private Long id;

    @SerializedName("name")
    private String name;

    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("template_type")
    private String templateType;

    @SerializedName("pattern")
    private String pattern;

    @SerializedName("sub_stage")
    private String subStage;

    @SerializedName("current_nodes")
    private List<NodeBasicInfo> currentNodes;

    @SerializedName("created_by")
    private String createdBy;

    @SerializedName("updated_by")
    private String updatedBy;

    @SerializedName("created_at")
    private Long createdAt;

    @SerializedName("updated_at")
    private Long updatedAt;

    @SerializedName("fields")
    private List<FieldValuePair> fields;

    @SerializedName("work_item_status")
    private WorkItemStatus workItemStatus;

    @SerializedName("deleted_by")
    private String deletedBy;

    @SerializedName("deleted_at")
    private Long deletedAt;

    @SerializedName("simple_name")
    private String simpleName;

    @SerializedName("template_id")
    private Long templateID;

    @SerializedName("workflow_infos")
    private NodesConnections workflowInfos;

    @SerializedName("state_times")
    private List<StateTime> stateTimes;

    @SerializedName("multi_texts")
    private List<MultiText> multiTexts;

    @SerializedName("relation_fields_detail")
    private List<RelationFieldDetail> relationFieldsDetail;

    @SerializedName("user_details")
    private List<UserDetail> userDetails;

    @SerializedName("sub_task_parent_info")
    private SubTaskParentInfo subTaskParentInfo;

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

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getTemplateType() {
        return this.templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getSubStage() {
        return this.subStage;
    }

    public void setSubStage(String subStage) {
        this.subStage = subStage;
    }

    public List<NodeBasicInfo> getCurrentNodes() {
        return this.currentNodes;
    }

    public void setCurrentNodes(List<NodeBasicInfo> currentNodes) {
        this.currentNodes = currentNodes;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<FieldValuePair> getFields() {
        return this.fields;
    }

    public void setFields(List<FieldValuePair> fields) {
        this.fields = fields;
    }

    public WorkItemStatus getWorkItemStatus() {
        return this.workItemStatus;
    }

    public void setWorkItemStatus(WorkItemStatus workItemStatus) {
        this.workItemStatus = workItemStatus;
    }

    public String getDeletedBy() {
        return this.deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Long getDeletedAt() {
        return this.deletedAt;
    }

    public void setDeletedAt(Long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getSimpleName() {
        return this.simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public Long getTemplateID() {
        return this.templateID;
    }

    public void setTemplateID(Long templateID) {
        this.templateID = templateID;
    }

    public NodesConnections getWorkflowInfos() {
        return this.workflowInfos;
    }

    public void setWorkflowInfos(NodesConnections workflowInfos) {
        this.workflowInfos = workflowInfos;
    }

    public List<StateTime> getStateTimes() {
        return this.stateTimes;
    }

    public void setStateTimes(List<StateTime> stateTimes) {
        this.stateTimes = stateTimes;
    }

    public List<MultiText> getMultiTexts() {
        return this.multiTexts;
    }

    public void setMultiTexts(List<MultiText> multiTexts) {
        this.multiTexts = multiTexts;
    }

    public List<RelationFieldDetail> getRelationFieldsDetail() {
        return this.relationFieldsDetail;
    }

    public void setRelationFieldsDetail(List<RelationFieldDetail> relationFieldsDetail) {
        this.relationFieldsDetail = relationFieldsDetail;
    }

    public List<UserDetail> getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(List<UserDetail> userDetails) {
        this.userDetails = userDetails;
    }

    public SubTaskParentInfo getSubTaskParentInfo() {
        return this.subTaskParentInfo;
    }

    public void setSubTaskParentInfo(SubTaskParentInfo subTaskParentInfo) {
        this.subTaskParentInfo = subTaskParentInfo;
    }

}