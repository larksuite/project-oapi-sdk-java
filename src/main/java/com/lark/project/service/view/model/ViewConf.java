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


public class ViewConf {
    @SerializedName("view_id")
    private String viewID;

    @SerializedName("name")
    private String name;

    @SerializedName("view_url")
    private String viewUrl;

    @SerializedName("view_type")
    private Integer viewType;

    @SerializedName("auth")
    private Integer auth;

    @SerializedName("system_view")
    private Integer systemView;

    @SerializedName("collaborators")
    private List<String> collaborators;

    @SerializedName("created_at")
    private Long createdAt;

    @SerializedName("created_by")
    private String createdBy;

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

    public String getViewUrl() {
        return this.viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }

    public Integer getViewType() {
        return this.viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public Integer getAuth() {
        return this.auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }

    public Integer getSystemView() {
        return this.systemView;
    }

    public void setSystemView(Integer systemView) {
        this.systemView = systemView;
    }

    public List<String> getCollaborators() {
        return this.collaborators;
    }

    public void setCollaborators(List<String> collaborators) {
        this.collaborators = collaborators;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}