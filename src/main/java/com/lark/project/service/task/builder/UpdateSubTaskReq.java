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
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;
import com.lark.project.service.workitem.model.Schedule;

import java.util.List;

public class UpdateSubTaskReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Path
    @SerializedName("node_id")
    private String nodeID;
    @Path
    @SerializedName("task_id")
    private Long taskID;
    @Body
    private UpdateSubTaskReqBody body;


    public UpdateSubTaskReq() {
    }

    public UpdateSubTaskReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.nodeID = builder.nodeID;
        this.taskID = builder.taskID;
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

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

    public UpdateSubTaskReqBody getUpdateSubTaskReqBody() {
        return this.body;
    }

    public void setUpdateSubTaskReqBody(UpdateSubTaskReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private Long workItemID;
        private String workItemTypeKey;
        private String nodeID;
        private Long taskID;
        private UpdateSubTaskReqBody body;

        public Builder() {
            body = new UpdateSubTaskReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder nodeID(String nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public Builder taskID(Long taskID) {
            this.taskID = taskID;
            return this;
        }

        public Builder name(String name) {
            this.body.setName(name);
            return this;
        }

        public Builder assignee(List<String> assignee) {
            this.body.setAssignee(assignee);
            return this;
        }

        public Builder roleAssignee(List<RoleOwner> roleAssignee) {
            this.body.setRoleAssignee(roleAssignee);
            return this;
        }

        public Builder schedule(Schedule schedule) {
            this.body.setSchedule(schedule);
            return this;
        }

        public Builder note(String note) {
            this.body.setNote(note);
            return this;
        }

        public Builder deliverable(List<FieldValuePair> deliverable) {
            this.body.setDeliverable(deliverable);
            return this;
        }

        public Builder updateFields(List<FieldValuePair> fieldValuePairs) {
            this.body.setUpdateFields(fieldValuePairs);
            return this;
        }

        public UpdateSubTaskReq build() {
            return new UpdateSubTaskReq(this);
        }

    }
}