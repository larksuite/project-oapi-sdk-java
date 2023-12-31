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

import java.util.List;

public class CompositiveSearchReq {
    @Body
    private CompositiveSearchReqBody body;


    public CompositiveSearchReq() {
    }

    public CompositiveSearchReq(Builder builder) {
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CompositiveSearchReqBody getCompositiveSearchReqBody() {
        return this.body;
    }

    public void setCompositiveSearchReqBody(CompositiveSearchReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private CompositiveSearchReqBody body;

        public Builder() {
            body = new CompositiveSearchReqBody();
        }

        public Builder projectKeys(List<String> projectKeys) {
            this.body.setProjectKeys(projectKeys);
            return this;
        }

        public Builder queryType(String queryType) {
            this.body.setQueryType(queryType);
            return this;
        }

        public Builder query(String query) {
            this.body.setQuery(query);
            return this;
        }

        public Builder querySubType(List<String> querySubType) {
            this.body.setQuerySubType(querySubType);
            return this;
        }

        public Builder pageSize(Long pageSize) {
            this.body.setPageSize(pageSize);
            return this;
        }

        public Builder pageNum(Long pageNum) {
            this.body.setPageNum(pageNum);
            return this;
        }

        public Builder simpleNames(List<String> simpleNames) {
            this.body.setSimpleNames(simpleNames);
            return this;
        }

        public CompositiveSearchReq build() {
            return new CompositiveSearchReq(this);
        }

    }
}