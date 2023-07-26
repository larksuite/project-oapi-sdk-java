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

package com.lark.meegooapi.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.meegooapi.service.field.model.FieldValuePair;
import com.lark.meegooapi.service.user.model.RoleOwner;
import com.lark.meegooapi.service.workitem.model.Schedule;

import java.util.List;


public class NodeOperateReqBody {
    @SerializedName("action")
    private String action;
    @SerializedName("rollback_reason")
    private String rollbackReason;
    @SerializedName("node_owners")
    private List<String> nodeOwners;
    @SerializedName("node_schedule")
    private Schedule nodeSchedule;
    @SerializedName("schedules")
    private List<Schedule> schedules;
    @SerializedName("fields")
    private List<FieldValuePair> fields;
    @SerializedName("role_assignee")
    private List<RoleOwner> roleAssignee;

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRollbackReason() {
        return this.rollbackReason;
    }

    public void setRollbackReason(String rollbackReason) {
        this.rollbackReason = rollbackReason;
    }

    public List<String> getNodeOwners() {
        return this.nodeOwners;
    }

    public void setNodeOwners(List<String> nodeOwners) {
        this.nodeOwners = nodeOwners;
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

    public List<FieldValuePair> getFields() {
        return this.fields;
    }

    public void setFields(List<FieldValuePair> fields) {
        this.fields = fields;
    }

    public List<RoleOwner> getRoleAssignee() {
        return this.roleAssignee;
    }

    public void setRoleAssignee(List<RoleOwner> roleAssignee) {
        this.roleAssignee = roleAssignee;
    }
}
