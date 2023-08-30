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

package com.lark.project.service.project_relation.model;

import com.google.gson.annotations.SerializedName;


public class RelationBindInstance {
    /**
     *
     */
    @SerializedName("project_key")
    private String projectKey;

    /**
     *
     */
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    /**
     *
     */
    @SerializedName("work_item_id")
    private Long workItemID;

    /**
     *
     */
    @SerializedName("chat_group_merge")
    private Long chatGroupMerge;

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public Long getChatGroupMerge() {
        return this.chatGroupMerge;
    }

    public void setChatGroupMerge(Long chatGroupMerge) {
        this.chatGroupMerge = chatGroupMerge;
    }

}