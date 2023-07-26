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

package com.lark.meegooapi.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class WorkItemRelation {
    /**
     *
     */
    @SerializedName("id")
    private String id;

    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("disabled")
    private Boolean disabled;

    /**
     *
     */
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    /**
     *
     */
    @SerializedName("work_item_type_name")
    private String workItemTypeName;

    /**
     *
     */
    @SerializedName("relation_details")
    private List<RelationDetail> relationDetails;

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

    public Boolean getDisabled() {
        return this.disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public String getWorkItemTypeName() {
        return this.workItemTypeName;
    }

    public void setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName;
    }

    public List<RelationDetail> getRelationDetails() {
        return this.relationDetails;
    }

    public void setRelationDetails(List<RelationDetail> relationDetails) {
        this.relationDetails = relationDetails;
    }

}