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


public class WorkflowNode {
    @SerializedName("id")
    private String id;

    @SerializedName("state_key")
    private String stateKey;

    @SerializedName("name")
    private String name;

    @SerializedName("status")
    private Integer status;

    @SerializedName("fields")
    private List<FieldValuePair> fields;

    @SerializedName("owners")
    private List<String> owners;

    @SerializedName("node_schedule")
    private Schedule nodeSchedule;

    @SerializedName("schedules")
    private List<Schedule> schedules;

    @SerializedName("sub_tasks")
    private List<SubTask> subTasks;

    @SerializedName("actual_begin_time")
    private String actualBeginTime;

    @SerializedName("actual_finish_time")
    private String actualFinishTime;

    @SerializedName("role_assignee")
    private List<RoleOwner> roleAssignee;

    @SerializedName("different_schedule")
    private Boolean differentSchedule;

    @SerializedName("sub_status")
    private List<Checker> subStatus;

    @SerializedName("milestone")
    private Boolean milestone;

    @SerializedName("participants")
    private List<String> participants;

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getStateKey() {
        return this.stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<FieldValuePair> getFields() {
        return this.fields;
    }

    public void setFields(List<FieldValuePair> fields) {
        this.fields = fields;
    }

    public List<String> getOwners() {
        return this.owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public Schedule getNodeSchedule() {
        return this.nodeSchedule;
    }

    public void setNodeSchedule(Schedule nodeSchedule) {
        this.nodeSchedule = nodeSchedule;
    }

    public List<Schedule> getSchedules() {
        return this.schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<SubTask> getSubTasks() {
        return this.subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
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

    public List<RoleOwner> getRoleAssignee() {
        return this.roleAssignee;
    }

    public void setRoleAssignee(List<RoleOwner> roleAssignee) {
        this.roleAssignee = roleAssignee;
    }

    public Boolean getDifferentSchedule() {
        return this.differentSchedule;
    }

    public void setDifferentSchedule(Boolean differentSchedule) {
        this.differentSchedule = differentSchedule;
    }

    public List<Checker> getSubStatus() {
        return this.subStatus;
    }

    public void setSubStatus(List<Checker> subStatus) {
        this.subStatus = subStatus;
    }

    public Boolean getMilestone() {
        return this.milestone;
    }

    public void setMilestone(Boolean milestone) {
        this.milestone = milestone;
    }

    public List<String> getParticipants() {
        return this.participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

}