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
import com.lark.project.core.request.BaseRequest;
import com.lark.project.core.utils.Lists;
import com.lark.project.service.workitem.model.Expand;
import com.lark.project.service.workitem.model.SearchUser;
import com.lark.project.service.workitem.model.TimeInterval;
import com.lark.project.service.workitem.model.WorkItemStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterAcrossProjectReq extends BaseRequest {
    @Body
    private FilterAcrossProjectReqBody body;


    public FilterAcrossProjectReq() {
    }

    public FilterAcrossProjectReq(Builder builder) {
        this.body = builder.body;


        this.setHeaders(builder.headers);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public FilterAcrossProjectReqBody getFilterAcrossProjectReqBody() {
        return this.body;
    }

    public void setFilterAcrossProjectReqBody(FilterAcrossProjectReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private FilterAcrossProjectReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new FilterAcrossProjectReqBody();
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

        public Builder projectKeys(List<String> projectKeys) {
            this.body.setProjectKeys(projectKeys);
            return this;
        }

        public Builder searchUser(SearchUser searchUser) {
            this.body.setSearchUser(searchUser);
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
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

        public Builder workItemStatus(List<WorkItemStatus> workItemStatus) {
            this.body.setWorkItemStatus(workItemStatus);
            return this;
        }

        public Builder workItemName(String workItemName) {
            this.body.setWorkItemName(workItemName);
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

        public Builder tenantGroupID(Long tenantGroupID) {
            this.body.setTenantGroupID(tenantGroupID);
            return this;
        }

        public Builder workItemIDs(List<Long> workItemIDs) {
            this.body.setWorkItemIDs(workItemIDs);
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

        public Builder simpleNames(List<String> simpleNames) {
            this.body.setSimpleNames(simpleNames);
            return this;
        }

        public Builder templateIDs(List<Long> templateIDs) {
            this.body.setTemplateIDs(templateIDs);
            return this;
        }

        public Builder expand(Expand expand) {
            this.body.setExpand(expand);
            return this;
        }

        public FilterAcrossProjectReq build() {
            return new FilterAcrossProjectReq(this);
        }

    }
}