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

package com.lark.meegooapi.service.field.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.meegooapi.core.annotation.Body;
import com.lark.meegooapi.core.annotation.Path;
import com.lark.meegooapi.core.request.BaseRequest;
import com.lark.meegooapi.core.utils.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateFieldReq extends BaseRequest {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private CreateFieldReqBody body;


    public CreateFieldReq() {
    }

    public CreateFieldReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.body = builder.body;


        this.setHeaders(builder.headers);
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

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public CreateFieldReqBody getCreateFieldReqBody() {
        return this.body;
    }

    public void setCreateFieldReqBody(CreateFieldReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private String projectKey;
        private String workItemTypeKey;
        private CreateFieldReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new CreateFieldReqBody();
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
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder fieldName(String fieldName) {
            this.body.setFieldName(fieldName);
            return this;
        }

        public Builder fieldTypeKey(String fieldTypeKey) {
            this.body.setFieldTypeKey(fieldTypeKey);
            return this;
        }

        public Builder valueType(Long valueType) {
            this.body.setValueType(valueType);
            return this;
        }

        public Builder referenceWorkItemTypeKey(String referenceWorkItemTypeKey) {
            this.body.setReferenceWorkItemTypeKey(referenceWorkItemTypeKey);
            return this;
        }

        public Builder referenceFieldKey(String referenceFieldKey) {
            this.body.setReferenceFieldKey(referenceFieldKey);
            return this;
        }

        public Builder fieldValue(Object fieldValue) {
            this.body.setFieldValue(fieldValue);
            return this;
        }

        public Builder freeAdd(Long freeAdd) {
            this.body.setFreeAdd(freeAdd);
            return this;
        }

        public Builder workItemRelationUUID(String workItemRelationUUID) {
            this.body.setWorkItemRelationUUID(workItemRelationUUID);
            return this;
        }

        public Builder defaultValue(Object defaultValue) {
            this.body.setDefaultValue(defaultValue);
            return this;
        }

        public Builder fieldAlias(String fieldAlias) {
            this.body.setFieldAlias(fieldAlias);
            return this;
        }

        public Builder helpDescription(String helpDescription) {
            this.body.setHelpDescription(helpDescription);
            return this;
        }

        public Builder authorizedRoles(List<String> authorizedRoles) {
            this.body.setAuthorizedRoles(authorizedRoles);
            return this;
        }

        public Builder isMulti(Boolean isMulti) {
            this.body.setIsMulti(isMulti);
            return this;
        }

        public Builder format(Boolean format) {
            this.body.setFormat(format);
            return this;
        }

        public CreateFieldReq build() {
            return new CreateFieldReq(this);
        }

    }
}