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

package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.Expand;
import com.lark.project.service.workitem.model.TimeInterval;
import com.lark.project.service.workitem.model.WorkItemStatus;

import java.util.List;


public class FilterReqBody {
    @SerializedName("work_item_name")
    private String workItemName;
    @SerializedName("user_keys")
    private List<String> userKeys;
    @SerializedName("work_item_ids")
    private List<Long> workItemIDs;
    @SerializedName("work_item_type_keys")
    private List<String> workItemTypeKeys;
    @SerializedName("created_at")
    private TimeInterval createdAt;
    @SerializedName("updated_at")
    private TimeInterval updatedAt;
    @SerializedName("sub_stages")
    private List<String> subStages;
    @SerializedName("businesses")
    private List<String> businesses;
    @SerializedName("priorities")
    private List<String> priorities;
    @SerializedName("tags")
    private List<String> tags;
    @SerializedName("page_num")
    private Long pageNum;
    @SerializedName("page_size")
    private Long pageSize;
    @SerializedName("work_item_status")
    private List<WorkItemStatus> workItemStatus;
    @SerializedName("expand")
    private Expand expand;

    public String getWorkItemName() {
        return this.workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    public List<String> getUserKeys() {
        return this.userKeys;
    }

    public void setUserKeys(List<String> userKeys) {
        this.userKeys = userKeys;
    }

    public List<Long> getWorkItemIDs() {
        return this.workItemIDs;
    }

    public void setWorkItemIDs(List<Long> workItemIDs) {
        this.workItemIDs = workItemIDs;
    }

    public List<String> getWorkItemTypeKeys() {
        return this.workItemTypeKeys;
    }

    public void setWorkItemTypeKeys(List<String> workItemTypeKeys) {
        this.workItemTypeKeys = workItemTypeKeys;
    }

    public TimeInterval getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(TimeInterval createdAt) {
        this.createdAt = createdAt;
    }

    public TimeInterval getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(TimeInterval updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<String> getSubStages() {
        return this.subStages;
    }

    public void setSubStages(List<String> subStages) {
        this.subStages = subStages;
    }

    public List<String> getBusinesses() {
        return this.businesses;
    }

    public void setBusinesses(List<String> businesses) {
        this.businesses = businesses;
    }

    public List<String> getPriorities() {
        return this.priorities;
    }

    public void setPriorities(List<String> priorities) {
        this.priorities = priorities;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public List<WorkItemStatus> getWorkItemStatus() {
        return this.workItemStatus;
    }

    public void setWorkItemStatus(List<WorkItemStatus> workItemStatus) {
        this.workItemStatus = workItemStatus;
    }

    public Expand getExpand() {
        return this.expand;
    }

    public void setExpand(Expand expand) {
        this.expand = expand;
    }
}
