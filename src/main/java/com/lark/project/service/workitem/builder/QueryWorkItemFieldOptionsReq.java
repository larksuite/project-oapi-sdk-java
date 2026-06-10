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

public class QueryWorkItemFieldOptionsReq {

    @Body
    private QueryWorkItemFieldOptionsReqBody body;

    public QueryWorkItemFieldOptionsReq() {
    }

    public QueryWorkItemFieldOptionsReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public QueryWorkItemFieldOptionsReqBody getQueryWorkItemFieldOptionsReqBody() {
        return this.body;
    }

    public void setQueryWorkItemFieldOptionsReqBody(QueryWorkItemFieldOptionsReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private QueryWorkItemFieldOptionsReqBody body;

        public Builder() {
            body = new QueryWorkItemFieldOptionsReqBody();
        }

        public Builder workItemID(Long workItemID) {
            this.body.setWorkItemID(workItemID);
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder fieldKey(String fieldKey) {
            this.body.setFieldKey(fieldKey);
            return this;
        }

        public Builder firstOptionKey(String firstOptionKey) {
            this.body.setFirstOptionKey(firstOptionKey);
            return this;
        }

        public QueryWorkItemFieldOptionsReq build() {
            return new QueryWorkItemFieldOptionsReq(this);
        }
    }
}