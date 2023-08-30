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
import com.lark.project.core.request.BaseRequest;
import com.lark.project.core.utils.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryUserDetailReq extends BaseRequest {
    @Body
    private QueryUserDetailReqBody body;


    public QueryUserDetailReq() {
    }

    public QueryUserDetailReq(Builder builder) {
        this.body = builder.body;


        this.setHeaders(builder.headers);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public QueryUserDetailReqBody getQueryUserDetailReqBody() {
        return this.body;
    }

    public void setQueryUserDetailReqBody(QueryUserDetailReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private QueryUserDetailReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new QueryUserDetailReqBody();
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

        public Builder userKeys(List<String> userKeys) {
            this.body.setUserKeys(userKeys);
            return this;
        }

        public Builder usernames(List<String> usernames) {
            this.body.setUsernames(usernames);
            return this;
        }

        public Builder outIDs(List<String> outIDs) {
            this.body.setOutIDs(outIDs);
            return this;
        }

        public Builder emails(List<String> emails) {
            this.body.setEmails(emails);
            return this;
        }

        public QueryUserDetailReq build() {
            return new QueryUserDetailReq(this);
        }

    }
}