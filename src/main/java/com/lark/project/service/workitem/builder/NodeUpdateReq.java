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
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;
import com.lark.project.service.workitem.model.Schedule;

import java.util.List;

public class NodeUpdateReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Path
    @SerializedName("node_id")
    private String nodeID;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private NodeUpdateReqBody body;


    public NodeUpdateReq() {
    }

    public NodeUpdateReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.nodeID = builder.nodeID;
        this.workItemTypeKey = builder.workItemTypeKey;
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

    public String getNodeID() {
        return this.nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public NodeUpdateReqBody getNodeUpdateReqBody() {
        return this.body;
    }

    public void setNodeUpdateReqBody(NodeUpdateReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private Long workItemID;
        private String nodeID;
        private String workItemTypeKey;
        private NodeUpdateReqBody body;

        public Builder() {
            body = new NodeUpdateReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public Builder nodeID(String nodeID) {
            this.nodeID = nodeID;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder nodeOwners(List<String> nodeOwners) {
            this.body.setNodeOwners(nodeOwners);
            return this;
        }

        public Builder nodeSchedule(Schedule nodeSchedule) {
            this.body.setNodeSchedule(nodeSchedule);
            return this;
        }

        public Builder schedules(List<Schedule> schedules) {
            this.body.setSchedules(schedules);
            return this;
        }

        public Builder fields(List<FieldValuePair> fields) {
            this.body.setFields(fields);
            return this;
        }

        public Builder roleAssignee(List<RoleOwner> roleAssignee) {
            this.body.setRoleAssignee(roleAssignee);
            return this;
        }

        public NodeUpdateReq build() {
            return new NodeUpdateReq(this);
        }

    }
}