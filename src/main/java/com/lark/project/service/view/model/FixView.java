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

package com.lark.project.service.view.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class FixView {
    @SerializedName("view_id")
    private String viewID;

    @SerializedName("name")
    private String name;

    @SerializedName("created_by")
    private String createdBy;

    @SerializedName("created_at")
    private Long createdAt;

    @SerializedName("modified_by")
    private String modifiedBy;

    @SerializedName("work_item_id_list")
    private List<Long> workItemIDList;

    @SerializedName("editable")
    private Boolean editable;

    public String getViewID() {
        return this.viewID;
    }

    public void setViewID(String viewID) {
        this.viewID = viewID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getModifiedBy() {
        return this.modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public List<Long> getWorkItemIDList() {
        return this.workItemIDList;
    }

    public void setWorkItemIDList(List<Long> workItemIDList) {
        this.workItemIDList = workItemIDList;
    }

    public Boolean getEditable() {
        return this.editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

}