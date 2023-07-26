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

package com.lark.meegooapi.service.project.model;

import com.google.gson.annotations.SerializedName;
import com.lark.meegooapi.service.user.model.RoleOwner;

import java.util.List;
import java.util.Map;


public class Business {
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
    @SerializedName("project")
    private String project;

    /**
     *
     */
    @SerializedName("labels")
    private List<String> labels;

    /**
     *
     */
    @SerializedName("role_owners")
    private Map<String, RoleOwner> roleOwners;

    /**
     *
     */
    @SerializedName("watchers")
    private List<String> watchers;

    /**
     *
     */
    @SerializedName("order")
    private Float order;

    /**
     *
     */
    @SerializedName("super_masters")
    private List<String> superMasters;

    /**
     *
     */
    @SerializedName("parent")
    private String parent;

    /**
     *
     */
    @SerializedName("disabled")
    private Boolean disabled;

    /**
     *
     */
    @SerializedName("level_id")
    private Long levelID;

    /**
     *
     */
    @SerializedName("children")
    private List<Business> children;

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

    public String getProject() {
        return this.project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public List<String> getLabels() {
        return this.labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Map<String, RoleOwner> getRoleOwners() {
        return this.roleOwners;
    }

    public void setRoleOwners(Map<String, RoleOwner> roleOwners) {
        this.roleOwners = roleOwners;
    }

    public List<String> getWatchers() {
        return this.watchers;
    }

    public void setWatchers(List<String> watchers) {
        this.watchers = watchers;
    }

    public Float getOrder() {
        return this.order;
    }

    public void setOrder(Float order) {
        this.order = order;
    }

    public List<String> getSuperMasters() {
        return this.superMasters;
    }

    public void setSuperMasters(List<String> superMasters) {
        this.superMasters = superMasters;
    }

    public String getParent() {
        return this.parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Boolean getDisabled() {
        return this.disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Long getLevelID() {
        return this.levelID;
    }

    public void setLevelID(Long levelID) {
        this.levelID = levelID;
    }

    public List<Business> getChildren() {
        return this.children;
    }

    public void setChildren(List<Business> children) {
        this.children = children;
    }

}