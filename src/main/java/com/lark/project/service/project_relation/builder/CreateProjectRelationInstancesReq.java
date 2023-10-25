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

package com.lark.project.service.project_relation.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.project_relation.model.RelationBindInstance;

import java.util.List;

public class CreateProjectRelationInstancesReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Body
    private CreateProjectRelationInstancesReqBody body;


    public CreateProjectRelationInstancesReq() {
    }

    public CreateProjectRelationInstancesReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.workItemID = builder.workItemID;
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

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public CreateProjectRelationInstancesReqBody getCreateProjectRelationInstancesReqBody() {
        return this.body;
    }

    public void setCreateProjectRelationInstancesReqBody(CreateProjectRelationInstancesReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private Long workItemID;
        private CreateProjectRelationInstancesReqBody body;

        public Builder() {
            body = new CreateProjectRelationInstancesReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public Builder relationRuleID(String relationRuleID) {
            this.body.setRelationRuleID(relationRuleID);
            return this;
        }

        public Builder instances(List<RelationBindInstance> instances) {
            this.body.setInstances(instances);
            return this;
        }

        public CreateProjectRelationInstancesReq build() {
            return new CreateProjectRelationInstancesReq(this);
        }

    }
}