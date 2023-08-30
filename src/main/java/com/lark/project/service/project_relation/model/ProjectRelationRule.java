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

import java.util.List;


public class ProjectRelationRule {
    /**
     *
     */
    @SerializedName("remote_project_key")
    private String remoteProjectKey;

    /**
     *
     */
    @SerializedName("remote_project_name")
    private String remoteProjectName;

    /**
     *
     */
    @SerializedName("rules")
    private List<RelationRule> rules;

    public String getRemoteProjectKey() {
        return this.remoteProjectKey;
    }

    public void setRemoteProjectKey(String remoteProjectKey) {
        this.remoteProjectKey = remoteProjectKey;
    }

    public String getRemoteProjectName() {
        return this.remoteProjectName;
    }

    public void setRemoteProjectName(String remoteProjectName) {
        this.remoteProjectName = remoteProjectName;
    }

    public List<RelationRule> getRules() {
        return this.rules;
    }

    public void setRules(List<RelationRule> rules) {
        this.rules = rules;
    }

}