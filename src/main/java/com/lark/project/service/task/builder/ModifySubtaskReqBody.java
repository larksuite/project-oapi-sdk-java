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


public class ModifySubtaskReqBody {
    @SerializedName("node_id")
    private String nodeID;
    @SerializedName("task_id")
    private Long taskID;
    @SerializedName("action")
    private String action;
    @SerializedName("assignee")
    private List<String> assignee;
    @SerializedName("role_assignee")
    private List<RoleOwner> roleAssignee;
    @SerializedName("schedules")
    private List<Schedule> schedules;
    @SerializedName("deliverable")
    private List<FieldValuePair> deliverable;
    @SerializedName("note")
    private String note;

    public String getNodeID() {
        return this.nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public Long getTaskID() {
        return this.taskID;
    }

    public void setTaskID(Long taskID) {
        this.taskID = taskID;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
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

    public List<Schedule> getSchedules() {
        return this.schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<FieldValuePair> getDeliverable() {
        return this.deliverable;
    }

    public void setDeliverable(List<FieldValuePair> deliverable) {
        this.deliverable = deliverable;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
