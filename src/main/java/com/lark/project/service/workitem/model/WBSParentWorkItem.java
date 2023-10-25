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

import java.util.List;


public class WBSParentWorkItem {
    @SerializedName("is_top")
    private Boolean isTop;

    @SerializedName("work_item_id")
    private Long workItemID;

    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    @SerializedName("name")
    private String name;

    @SerializedName("template_id")
    private String templateID;

    @SerializedName("template_key")
    private String templateKey;

    @SerializedName("template_name")
    private String templateName;

    @SerializedName("template_version")
    private Long templateVersion;

    @SerializedName("relation_node_id")
    private String relationNodeID;

    @SerializedName("relation_node_name")
    private String relationNodeName;

    @SerializedName("relation_node_tags")
    private List<String> relationNodeTags;

    @SerializedName("relation_node_uuid")
    private String relationNodeUUID;

    public Boolean getIsTop() {
        return this.isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplateID() {
        return this.templateID;
    }

    public void setTemplateID(String templateID) {
        this.templateID = templateID;
    }

    public String getTemplateKey() {
        return this.templateKey;
    }

    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public void setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
    }

    public String getRelationNodeID() {
        return this.relationNodeID;
    }

    public void setRelationNodeID(String relationNodeID) {
        this.relationNodeID = relationNodeID;
    }

    public String getRelationNodeName() {
        return this.relationNodeName;
    }

    public void setRelationNodeName(String relationNodeName) {
        this.relationNodeName = relationNodeName;
    }

    public List<String> getRelationNodeTags() {
        return this.relationNodeTags;
    }

    public void setRelationNodeTags(List<String> relationNodeTags) {
        this.relationNodeTags = relationNodeTags;
    }

    public String getRelationNodeUUID() {
        return this.relationNodeUUID;
    }

    public void setRelationNodeUUID(String relationNodeUUID) {
        this.relationNodeUUID = relationNodeUUID;
    }

}