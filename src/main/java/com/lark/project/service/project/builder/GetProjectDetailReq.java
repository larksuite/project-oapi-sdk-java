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

package com.lark.project.service.project.builder;

import com.lark.project.core.annotation.Body;

import java.util.List;

public class GetProjectDetailReq {
    @Body
    private GetProjectDetailReqBody body;


    public GetProjectDetailReq() {
    }

    public GetProjectDetailReq(Builder builder) {
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public GetProjectDetailReqBody getGetProjectDetailReqBody() {
        return this.body;
    }

    public void setGetProjectDetailReqBody(GetProjectDetailReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private GetProjectDetailReqBody body;

        public Builder() {
            body = new GetProjectDetailReqBody();
        }

        public Builder projectKeys(List<String> projectKeys) {
            this.body.setProjectKeys(projectKeys);
            return this;
        }

        public Builder userKey(String userKey) {
            this.body.setUserKey(userKey);
            return this;
        }

        public Builder simpleNames(List<String> simpleNames) {
            this.body.setSimpleNames(simpleNames);
            return this;
        }

        public Builder tenantGroupID(Long tenantGroupID) {
            this.body.setTenantGroupID(tenantGroupID);
            return this;
        }

        public GetProjectDetailReq build() {
            return new GetProjectDetailReq(this);
        }

    }
}