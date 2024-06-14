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

package com.lark.project.service.view.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.workitem.model.TimeInterval;

import java.util.List;

public class ViewListReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Body
    private ViewListReqBody body;


    public ViewListReq() {
    }

    public ViewListReq(Builder builder) {
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

    public ViewListReqBody getViewListReqBody() {
        return this.body;
    }

    public void setViewListReqBody(ViewListReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private ViewListReqBody body;

        public Builder() {
            body = new ViewListReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder viewName(String viewName) {
            this.body.setViewName(viewName);
            return this;
        }

        public Builder viewIDs(List<String> viewIDs) {
            this.body.setViewIDs(viewIDs);
            return this;
        }

        public Builder createdBy(String createdBy) {
            this.body.setCreatedBy(createdBy);
            return this;
        }

        public Builder createdAt(TimeInterval createdAt) {
            this.body.setCreatedAt(createdAt);
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

        public ViewListReq build() {
            return new ViewListReq(this);
        }

    }
}