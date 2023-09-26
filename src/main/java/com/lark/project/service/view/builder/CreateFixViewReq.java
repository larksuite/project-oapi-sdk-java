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

package com.lark.project.service.view.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

import java.util.List;

public class CreateFixViewReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private CreateFixViewReqBody body;


    public CreateFixViewReq() {
    }

    public CreateFixViewReq(Builder builder) {
        this.projectKey = builder.projectKey;
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

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public CreateFixViewReqBody getCreateFixViewReqBody() {
        return this.body;
    }

    public void setCreateFixViewReqBody(CreateFixViewReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private CreateFixViewReqBody body;

        public Builder() {
            body = new CreateFixViewReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder workItemIDList(List<Long> workItemIDList) {
            this.body.setWorkItemIDList(workItemIDList);
            return this;
        }

        public Builder name(String name) {
            this.body.setName(name);
            return this;
        }

        public Builder cooperationMode(Long cooperationMode) {
            this.body.setCooperationMode(cooperationMode);
            return this;
        }

        public Builder cooperationUserKeys(List<String> cooperationUserKeys) {
            this.body.setCooperationUserKeys(cooperationUserKeys);
            return this;
        }

        public Builder cooperationTeamIDs(List<Long> cooperationTeamIDs) {
            this.body.setCooperationTeamIDs(cooperationTeamIDs);
            return this;
        }

        public CreateFixViewReq build() {
            return new CreateFixViewReq(this);
        }

    }
}