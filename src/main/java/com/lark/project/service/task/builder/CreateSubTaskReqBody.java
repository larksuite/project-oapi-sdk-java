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

package com.lark.project.service.task.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;
import com.lark.project.service.workitem.model.Schedule;

import java.util.List;


public class CreateSubTaskReqBody {
    @SerializedName("node_id")
    private String nodeID;
    @SerializedName("name")
    private String name;
    @SerializedName("alias_key")
    private String aliasKey;
    @SerializedName("assignee")
    private List<String> assignee;
    @SerializedName("role_assignee")
    private List<RoleOwner> roleAssignee;
    @SerializedName("schedule")
    private Schedule schedule;
    @SerializedName("note")
    private String note;
    @SerializedName("field_value_pairs")
    private List<FieldValuePair> fieldValuePairs;

    public String getNodeID() {
        return this.nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAliasKey() {
        return this.aliasKey;
    }

    public void setAliasKey(String aliasKey) {
        this.aliasKey = aliasKey;
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

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<FieldValuePair> getFieldValuePairs() {
        return fieldValuePairs;
    }

    public void setFieldValuePairs(List<FieldValuePair> fieldValuePairs) {
        this.fieldValuePairs = fieldValuePairs;
    }
}
