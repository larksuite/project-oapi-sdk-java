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

package com.lark.meegooapi.service.workitem_conf.builder;

import com.lark.meegooapi.core.annotation.Body;
import com.lark.meegooapi.core.request.BaseRequest;
import com.lark.meegooapi.core.utils.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateTemplateDetailReq extends BaseRequest {
    @Body
    private CreateTemplateDetailReqBody body;


    public CreateTemplateDetailReq() {
    }

    public CreateTemplateDetailReq(Builder builder) {
        this.body = builder.body;


        this.setHeaders(builder.headers);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CreateTemplateDetailReqBody getCreateTemplateDetailReqBody() {
        return this.body;
    }

    public void setCreateTemplateDetailReqBody(CreateTemplateDetailReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private CreateTemplateDetailReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new CreateTemplateDetailReqBody();
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

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder templateName(String templateName) {
            this.body.setTemplateName(templateName);
            return this;
        }

        public Builder copyTemplateID(Long copyTemplateID) {
            this.body.setCopyTemplateID(copyTemplateID);
            return this;
        }

        public CreateTemplateDetailReq build() {
            return new CreateTemplateDetailReq(this);
        }

    }
}