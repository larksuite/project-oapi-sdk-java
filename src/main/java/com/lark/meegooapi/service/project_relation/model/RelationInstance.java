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

package com.lark.meegooapi.service.project_relation.model;

import com.google.gson.annotations.SerializedName;


public class RelationInstance {
    /**
     *
     */
    @SerializedName("relation_work_item_id")
    private Long relationWorkItemID;

    /**
     *
     */
    @SerializedName("relation_work_item_name")
    private String relationWorkItemName;

    /**
     *
     */
    @SerializedName("relation_work_item_type_name")
    private String relationWorkItemTypeName;

    /**
     *
     */
    @SerializedName("relation_work_item_type_key")
    private String relationWorkItemTypeKey;

    /**
     *
     */
    @SerializedName("project_relation_rule_id")
    private String projectRelationRuleID;

    /**
     *
     */
    @SerializedName("project_relation_rule_name")
    private String projectRelationRuleName;

    /**
     *
     */
    @SerializedName("relation_project_key")
    private String relationProjectKey;

    /**
     *
     */
    @SerializedName("relation_project_name")
    private String relationProjectName;

    public Long getRelationWorkItemID() {
        return this.relationWorkItemID;
    }

    public void setRelationWorkItemID(Long relationWorkItemID) {
        this.relationWorkItemID = relationWorkItemID;
    }

    public String getRelationWorkItemName() {
        return this.relationWorkItemName;
    }

    public void setRelationWorkItemName(String relationWorkItemName) {
        this.relationWorkItemName = relationWorkItemName;
    }

    public String getRelationWorkItemTypeName() {
        return this.relationWorkItemTypeName;
    }

    public void setRelationWorkItemTypeName(String relationWorkItemTypeName) {
        this.relationWorkItemTypeName = relationWorkItemTypeName;
    }

    public String getRelationWorkItemTypeKey() {
        return this.relationWorkItemTypeKey;
    }

    public void setRelationWorkItemTypeKey(String relationWorkItemTypeKey) {
        this.relationWorkItemTypeKey = relationWorkItemTypeKey;
    }

    public String getProjectRelationRuleID() {
        return this.projectRelationRuleID;
    }

    public void setProjectRelationRuleID(String projectRelationRuleID) {
        this.projectRelationRuleID = projectRelationRuleID;
    }

    public String getProjectRelationRuleName() {
        return this.projectRelationRuleName;
    }

    public void setProjectRelationRuleName(String projectRelationRuleName) {
        this.projectRelationRuleName = projectRelationRuleName;
    }

    public String getRelationProjectKey() {
        return this.relationProjectKey;
    }

    public void setRelationProjectKey(String relationProjectKey) {
        this.relationProjectKey = relationProjectKey;
    }

    public String getRelationProjectName() {
        return this.relationProjectName;
    }

    public void setRelationProjectName(String relationProjectName) {
        this.relationProjectName = relationProjectName;
    }

}