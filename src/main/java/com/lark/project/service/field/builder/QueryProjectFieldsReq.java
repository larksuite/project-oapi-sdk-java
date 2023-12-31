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

package com.lark.project.service.field.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

public class QueryProjectFieldsReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Body
    private QueryProjectFieldsReqBody body;


    public QueryProjectFieldsReq() {
    }

    public QueryProjectFieldsReq(Builder builder) {
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

    public QueryProjectFieldsReqBody getQueryProjectFieldsReqBody() {
        return this.body;
    }

    public void setQueryProjectFieldsReqBody(QueryProjectFieldsReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private QueryProjectFieldsReqBody body;

        public Builder() {
            body = new QueryProjectFieldsReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public QueryProjectFieldsReq build() {
            return new QueryProjectFieldsReq(this);
        }

    }
}