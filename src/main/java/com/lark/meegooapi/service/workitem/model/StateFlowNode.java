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
import com.lark.meegooapi.service.field.model.FieldValuePair;
import com.lark.meegooapi.service.user.model.RoleOwner;

import java.util.List;


public class StateFlowNode {
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
    @SerializedName("role_owners")
    private List<RoleOwner> roleOwners;

    /**
     *
     */
    @SerializedName("status")
    private Integer status;

    /**
     *
     */
    @SerializedName("actual_begin_time")
    private String actualBeginTime;

    /**
     *
     */
    @SerializedName("actual_finish_time")
    private String actualFinishTime;

    /**
     *
     */
    @SerializedName("fields")
    private List<FieldValuePair> fields;

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

    public List<RoleOwner> getRoleOwners() {
        return this.roleOwners;
    }

    public void setRoleOwners(List<RoleOwner> roleOwners) {
        this.roleOwners = roleOwners;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getActualBeginTime() {
        return this.actualBeginTime;
    }

    public void setActualBeginTime(String actualBeginTime) {
        this.actualBeginTime = actualBeginTime;
    }

    public String getActualFinishTime() {
        return this.actualFinishTime;
    }

    public void setActualFinishTime(String actualFinishTime) {
        this.actualFinishTime = actualFinishTime;
    }

    public List<FieldValuePair> getFields() {
        return this.fields;
    }

    public void setFields(List<FieldValuePair> fields) {
        this.fields = fields;
    }

}