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

package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;
import com.lark.project.service.workitem.model.Schedule;
import com.lark.project.service.workitem.model.ScheduleConstraintRule;

import java.util.List;


public class NodeUpdateReqBody {
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
    @SerializedName("schedule_constraint_rule")
    private ScheduleConstraintRule scheduleConstraintRule;
    @SerializedName("node_custom_fields")
    private List<FieldValuePair> nodeCustomFields;

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

    public ScheduleConstraintRule getScheduleConstraintRule() {
        return this.scheduleConstraintRule;
    }

    public void setScheduleConstraintRule(ScheduleConstraintRule scheduleConstraintRule) {
        this.scheduleConstraintRule = scheduleConstraintRule;
    }

    public List<FieldValuePair> getNodeCustomFields() {
        return this.nodeCustomFields;
    }

    public void setNodeCustomFields(List<FieldValuePair> nodeCustomFields) {
        this.nodeCustomFields = nodeCustomFields;
    }
}
