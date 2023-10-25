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

package com.lark.project.service.workitem_conf.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

public class QueryWbsTemplateConfReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Body
    private QueryWbsTemplateConfReqBody body;


    public QueryWbsTemplateConfReq() {
    }

    public QueryWbsTemplateConfReq(Builder builder) {
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

    public QueryWbsTemplateConfReqBody getQueryWbsTemplateConfReqBody() {
        return this.body;
    }

    public void setQueryWbsTemplateConfReqBody(QueryWbsTemplateConfReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private QueryWbsTemplateConfReqBody body;

        public Builder() {
            body = new QueryWbsTemplateConfReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder templateKey(String templateKey) {
            this.body.setTemplateKey(templateKey);
            return this;
        }

        public QueryWbsTemplateConfReq build() {
            return new QueryWbsTemplateConfReq(this);
        }

    }
}