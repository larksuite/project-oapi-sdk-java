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

import com.lark.project.core.annotation.Body;
import com.lark.project.service.workitem.model.RelationDetail;

import java.util.List;

public class CreateWorkItemRelationReq {
    @Body
    private CreateWorkItemRelationReqBody body;


    public CreateWorkItemRelationReq() {
    }

    public CreateWorkItemRelationReq(Builder builder) {
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CreateWorkItemRelationReqBody getCreateWorkItemRelationReqBody() {
        return this.body;
    }

    public void setCreateWorkItemRelationReqBody(CreateWorkItemRelationReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private CreateWorkItemRelationReqBody body;

        public Builder() {
            body = new CreateWorkItemRelationReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder name(String name) {
            this.body.setName(name);
            return this;
        }

        public Builder relationDetails(List<RelationDetail> relationDetails) {
            this.body.setRelationDetails(relationDetails);
            return this;
        }

        public CreateWorkItemRelationReq build() {
            return new CreateWorkItemRelationReq(this);
        }

    }
}