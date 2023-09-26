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

import java.util.List;

public class NodeStateChangeReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private NodeStateChangeReqBody body;


    public NodeStateChangeReq() {
    }

    public NodeStateChangeReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
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

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public NodeStateChangeReqBody getNodeStateChangeReqBody() {
        return this.body;
    }

    public void setNodeStateChangeReqBody(NodeStateChangeReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private Long workItemID;
        private String workItemTypeKey;
        private NodeStateChangeReqBody body;

        public Builder() {
            body = new NodeStateChangeReqBody();
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

        public Builder transitionID(Long transitionID) {
            this.body.setTransitionID(transitionID);
            return this;
        }

        public Builder roleOwners(List<RoleOwner> roleOwners) {
            this.body.setRoleOwners(roleOwners);
            return this;
        }

        public Builder fields(List<FieldValuePair> fields) {
            this.body.setFields(fields);
            return this;
        }

        public NodeStateChangeReq build() {
            return new NodeStateChangeReq(this);
        }

    }
}