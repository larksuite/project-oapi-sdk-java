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

package com.lark.project.service.user.builder;

import com.lark.project.core.annotation.Body;

public class SearchUserReq {
    @Body
    private SearchUserReqBody body;


    public SearchUserReq() {
    }

    public SearchUserReq(Builder builder) {
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SearchUserReqBody getSearchUserReqBody() {
        return this.body;
    }

    public void setSearchUserReqBody(SearchUserReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private SearchUserReqBody body;

        public Builder() {
            body = new SearchUserReqBody();
        }

        public Builder query(String query) {
            this.body.setQuery(query);
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public SearchUserReq build() {
            return new SearchUserReq(this);
        }

    }
}