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


public class NodeBasicInfo {
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
    @SerializedName("owners")
    private List<String> owners;

    /**
     *
     */
    @SerializedName("milestone")
    private Boolean milestone;

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

    public List<String> getOwners() {
        return this.owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public Boolean getMilestone() {
        return this.milestone;
    }

    public void setMilestone(Boolean milestone) {
        this.milestone = milestone;
    }

}