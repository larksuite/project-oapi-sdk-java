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
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;

import java.util.List;


public class SubTask {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("schedules")
    private List<Schedule> schedules;

    @SerializedName("order")
    private Float order;

    @SerializedName("details")
    private String details;

    @SerializedName("passed")
    private Boolean passed;

    @SerializedName("owners")
    private List<String> owners;

    @SerializedName("note")
    private String note;

    @SerializedName("actual_begin_time")
    private String actualBeginTime;

    @SerializedName("actual_finish_time")
    private String actualFinishTime;

    @SerializedName("assignee")
    private List<String> assignee;

    @SerializedName("role_assignee")
    private List<RoleOwner> roleAssignee;

    @SerializedName("deliverable")
    private List<FieldValuePair> deliverable;

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

    public List<Schedule> getSchedules() {
        return this.schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Float getOrder() {
        return this.order;
    }

    public void setOrder(Float order) {
        this.order = order;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getPassed() {
        return this.passed;
    }

    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public List<String> getOwners() {
        return this.owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public List<String> getAssignee() {
        return this.assignee;
    }

    public void setAssignee(List<String> assignee) {
        this.assignee = assignee;
    }

    public List<RoleOwner> getRoleAssignee() {
        return this.roleAssignee;
    }

    public void setRoleAssignee(List<RoleOwner> roleAssignee) {
        this.roleAssignee = roleAssignee;
    }

    public List<FieldValuePair> getDeliverable() {
        return this.deliverable;
    }

    public void setDeliverable(List<FieldValuePair> deliverable) {
        this.deliverable = deliverable;
    }

}