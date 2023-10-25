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

public class DeleteWorkItemRelationReq {
    @Body
    private DeleteWorkItemRelationReqBody body;


    public DeleteWorkItemRelationReq() {
    }

    public DeleteWorkItemRelationReq(Builder builder) {
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public DeleteWorkItemRelationReqBody getDeleteWorkItemRelationReqBody() {
        return this.body;
    }

    public void setDeleteWorkItemRelationReqBody(DeleteWorkItemRelationReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private DeleteWorkItemRelationReqBody body;

        public Builder() {
            body = new DeleteWorkItemRelationReqBody();
        }

        public Builder relationID(String relationID) {
            this.body.setRelationID(relationID);
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public DeleteWorkItemRelationReq build() {
            return new DeleteWorkItemRelationReq(this);
        }

    }
}