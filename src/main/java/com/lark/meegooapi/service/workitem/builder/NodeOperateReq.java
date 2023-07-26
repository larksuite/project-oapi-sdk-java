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
import com.lark.meegooapi.core.annotation.Body;
import com.lark.meegooapi.core.annotation.Path;
import com.lark.meegooapi.core.request.BaseRequest;
import com.lark.meegooapi.core.utils.Lists;
import com.lark.meegooapi.service.field.model.FieldValuePair;
import com.lark.meegooapi.service.user.model.RoleOwner;
import com.lark.meegooapi.service.workitem.model.Schedule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeOperateReq extends BaseRequest {
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
    private NodeOperateReqBody body;


    public NodeOperateReq() {
    }

    public NodeOperateReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.nodeID = builder.nodeID;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.body = builder.body;


        this.setHeaders(builder.headers);
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

    public NodeOperateReqBody getNodeOperateReqBody() {
        return this.body;
    }

    public void setNodeOperateReqBody(NodeOperateReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private String projectKey;
        private Long workItemID;
        private String nodeID;
        private String workItemTypeKey;
        private NodeOperateReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new NodeOperateReqBody();
        }

        /**
         * 请求头用户user_key
         */
        public Builder accessUser(String userKey) {
            this.headers.put("X-USER-KEY", Lists.newArrayList(userKey));
            return this;
        }

        /**
         * 请求头接口的幂等串
         */
        public Builder uuid(String uuid) {
            this.headers.put("X-IDEM-UUID", Lists.newArrayList(uuid));
            return this;
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

        public Builder action(String action) {
            this.body.setAction(action);
            return this;
        }

        public Builder rollbackReason(String rollbackReason) {
            this.body.setRollbackReason(rollbackReason);
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

        public NodeOperateReq build() {
            return new NodeOperateReq(this);
        }

    }
}