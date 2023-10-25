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
import com.lark.project.service.workitem.model.Expand;
import com.lark.project.service.workitem.model.TimeInterval;
import com.lark.project.service.workitem.model.WorkItemStatus;

import java.util.List;

public class FilterReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Body
    private FilterReqBody body;


    public FilterReq() {
    }

    public FilterReq(Builder builder) {
        this.projectKey = builder.projectKey;
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

    public FilterReqBody getFilterReqBody() {
        return this.body;
    }

    public void setFilterReqBody(FilterReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private FilterReqBody body;

        public Builder() {
            body = new FilterReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemName(String workItemName) {
            this.body.setWorkItemName(workItemName);
            return this;
        }

        public Builder userKeys(List<String> userKeys) {
            this.body.setUserKeys(userKeys);
            return this;
        }

        public Builder workItemIDs(List<Long> workItemIDs) {
            this.body.setWorkItemIDs(workItemIDs);
            return this;
        }

        public Builder workItemTypeKeys(List<String> workItemTypeKeys) {
            this.body.setWorkItemTypeKeys(workItemTypeKeys);
            return this;
        }

        public Builder createdAt(TimeInterval createdAt) {
            this.body.setCreatedAt(createdAt);
            return this;
        }

        public Builder updatedAt(TimeInterval updatedAt) {
            this.body.setUpdatedAt(updatedAt);
            return this;
        }

        public Builder subStages(List<String> subStages) {
            this.body.setSubStages(subStages);
            return this;
        }

        public Builder businesses(List<String> businesses) {
            this.body.setBusinesses(businesses);
            return this;
        }

        public Builder priorities(List<String> priorities) {
            this.body.setPriorities(priorities);
            return this;
        }

        public Builder tags(List<String> tags) {
            this.body.setTags(tags);
            return this;
        }

        public Builder pageNum(Long pageNum) {
            this.body.setPageNum(pageNum);
            return this;
        }

        public Builder pageSize(Long pageSize) {
            this.body.setPageSize(pageSize);
            return this;
        }

        public Builder workItemStatus(List<WorkItemStatus> workItemStatus) {
            this.body.setWorkItemStatus(workItemStatus);
            return this;
        }

        public Builder expand(Expand expand) {
            this.body.setExpand(expand);
            return this;
        }

        public FilterReq build() {
            return new FilterReq(this);
        }

    }
}