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

package com.lark.project.service.task.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.workitem.model.TimeInterval;

import java.util.List;

public class SearchSubtaskReq {
    @Body
    private SearchSubtaskReqBody body;


    public SearchSubtaskReq() {
    }

    public SearchSubtaskReq(Builder builder) {
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SearchSubtaskReqBody getSearchSubtaskReqBody() {
        return this.body;
    }

    public void setSearchSubtaskReqBody(SearchSubtaskReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private SearchSubtaskReqBody body;

        public Builder() {
            body = new SearchSubtaskReqBody();
        }

        public Builder projectKeys(List<String> projectKeys) {
            this.body.setProjectKeys(projectKeys);
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

        public Builder name(String name) {
            this.body.setName(name);
            return this;
        }

        public Builder userKeys(List<String> userKeys) {
            this.body.setUserKeys(userKeys);
            return this;
        }

        public Builder status(Integer status) {
            this.body.setStatus(status);
            return this;
        }

        public Builder createdAt(TimeInterval createdAt) {
            this.body.setCreatedAt(createdAt);
            return this;
        }

        public Builder simpleNames(List<String> simpleNames) {
            this.body.setSimpleNames(simpleNames);
            return this;
        }

        public SearchSubtaskReq build() {
            return new SearchSubtaskReq(this);
        }

    }
}