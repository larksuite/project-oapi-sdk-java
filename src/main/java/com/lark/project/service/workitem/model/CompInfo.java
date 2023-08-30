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


public class CompInfo {
    /**
     *
     */
    @SerializedName("ID")
    private String id;

    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("WorkItemTypeKey")
    private String workItemTypeKey;

    /**
     *
     */
    @SerializedName("ProjectKey")
    private String projectKey;

    /**
     *
     */
    @SerializedName("CreatedBy")
    private String createdBy;

    /**
     *
     */
    @SerializedName("CreatedAt")
    private Long createdAt;

    /**
     *
     */
    @SerializedName("SearchHit")
    private List<String> searchHit;

    /**
     *
     */
    @SerializedName("ViewScopeKey")
    private String viewScopeKey;

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

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getSearchHit() {
        return this.searchHit;
    }

    public void setSearchHit(List<String> searchHit) {
        this.searchHit = searchHit;
    }

    public String getViewScopeKey() {
        return this.viewScopeKey;
    }

    public void setViewScopeKey(String viewScopeKey) {
        this.viewScopeKey = viewScopeKey;
    }

}