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


public class RelationRule {
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
    private Long disabled;

    /**
     *
     */
    @SerializedName("work_item_relation_id")
    private String workItemRelationID;

    /**
     *
     */
    @SerializedName("work_item_relation_name")
    private String workItemRelationName;

    /**
     *
     */
    @SerializedName("current_work_item_type_key")
    private String currentWorkItemTypeKey;

    /**
     *
     */
    @SerializedName("current_work_item_type_name")
    private String currentWorkItemTypeName;

    /**
     *
     */
    @SerializedName("remote_work_item_type_key")
    private String remoteWorkItemTypeKey;

    /**
     *
     */
    @SerializedName("remote_work_item_type_name")
    private String remoteWorkItemTypeName;

    /**
     *
     */
    @SerializedName("chat_group_merge")
    private Long chatGroupMerge;

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

    public Long getDisabled() {
        return this.disabled;
    }

    public void setDisabled(Long disabled) {
        this.disabled = disabled;
    }

    public String getWorkItemRelationID() {
        return this.workItemRelationID;
    }

    public void setWorkItemRelationID(String workItemRelationID) {
        this.workItemRelationID = workItemRelationID;
    }

    public String getWorkItemRelationName() {
        return this.workItemRelationName;
    }

    public void setWorkItemRelationName(String workItemRelationName) {
        this.workItemRelationName = workItemRelationName;
    }

    public String getCurrentWorkItemTypeKey() {
        return this.currentWorkItemTypeKey;
    }

    public void setCurrentWorkItemTypeKey(String currentWorkItemTypeKey) {
        this.currentWorkItemTypeKey = currentWorkItemTypeKey;
    }

    public String getCurrentWorkItemTypeName() {
        return this.currentWorkItemTypeName;
    }

    public void setCurrentWorkItemTypeName(String currentWorkItemTypeName) {
        this.currentWorkItemTypeName = currentWorkItemTypeName;
    }

    public String getRemoteWorkItemTypeKey() {
        return this.remoteWorkItemTypeKey;
    }

    public void setRemoteWorkItemTypeKey(String remoteWorkItemTypeKey) {
        this.remoteWorkItemTypeKey = remoteWorkItemTypeKey;
    }

    public String getRemoteWorkItemTypeName() {
        return this.remoteWorkItemTypeName;
    }

    public void setRemoteWorkItemTypeName(String remoteWorkItemTypeName) {
        this.remoteWorkItemTypeName = remoteWorkItemTypeName;
    }

    public Long getChatGroupMerge() {
        return this.chatGroupMerge;
    }

    public void setChatGroupMerge(Long chatGroupMerge) {
        this.chatGroupMerge = chatGroupMerge;
    }

}