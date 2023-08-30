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
import com.lark.project.service.workitem.model.SearchUser;
import com.lark.project.service.workitem.model.TimeInterval;
import com.lark.project.service.workitem.model.WorkItemStatus;

import java.util.List;


public class FilterAcrossProjectReqBody {
    @SerializedName("project_keys")
    private List<String> projectKeys;
    @SerializedName("search_user")
    private SearchUser searchUser;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("created_at")
    private TimeInterval createdAt;
    @SerializedName("updated_at")
    private TimeInterval updatedAt;
    @SerializedName("work_item_status")
    private List<WorkItemStatus> workItemStatus;
    @SerializedName("work_item_name")
    private String workItemName;
    @SerializedName("page_num")
    private Long pageNum;
    @SerializedName("page_size")
    private Long pageSize;
    @SerializedName("tenant_group_id")
    private Long tenantGroupID;
    @SerializedName("work_item_ids")
    private List<Long> workItemIDs;
    @SerializedName("businesses")
    private List<String> businesses;
    @SerializedName("priorities")
    private List<String> priorities;
    @SerializedName("tags")
    private List<String> tags;
    @SerializedName("simple_names")
    private List<String> simpleNames;
    @SerializedName("template_ids")
    private List<Long> templateIDs;
    @SerializedName("expand")
    private Expand expand;

    public List<String> getProjectKeys() {
        return this.projectKeys;
    }

    public void setProjectKeys(List<String> projectKeys) {
        this.projectKeys = projectKeys;
    }

    public SearchUser getSearchUser() {
        return this.searchUser;
    }

    public void setSearchUser(SearchUser searchUser) {
        this.searchUser = searchUser;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
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

    public List<WorkItemStatus> getWorkItemStatus() {
        return this.workItemStatus;
    }

    public void setWorkItemStatus(List<WorkItemStatus> workItemStatus) {
        this.workItemStatus = workItemStatus;
    }

    public String getWorkItemName() {
        return this.workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
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

    public Long getTenantGroupID() {
        return this.tenantGroupID;
    }

    public void setTenantGroupID(Long tenantGroupID) {
        this.tenantGroupID = tenantGroupID;
    }

    public List<Long> getWorkItemIDs() {
        return this.workItemIDs;
    }

    public void setWorkItemIDs(List<Long> workItemIDs) {
        this.workItemIDs = workItemIDs;
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

    public List<String> getSimpleNames() {
        return this.simpleNames;
    }

    public void setSimpleNames(List<String> simpleNames) {
        this.simpleNames = simpleNames;
    }

    public List<Long> getTemplateIDs() {
        return this.templateIDs;
    }

    public void setTemplateIDs(List<Long> templateIDs) {
        this.templateIDs = templateIDs;
    }

    public Expand getExpand() {
        return this.expand;
    }

    public void setExpand(Expand expand) {
        this.expand = expand;
    }
}
