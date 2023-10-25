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
import com.lark.project.core.annotation.Path;
import com.lark.project.core.annotation.Query;

public class WorkItemListReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("view_id")
    private String viewID;
    @Query
    @SerializedName("page_size")
    private Long pageSize;
    @Query
    @SerializedName("page_num")
    private Long pageNum;

    public WorkItemListReq() {
    }

    public WorkItemListReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.viewID = builder.viewID;
        this.pageSize = builder.pageSize;
        this.pageNum = builder.pageNum;
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

    public String getViewID() {
        return this.viewID;
    }

    public void setViewID(String viewID) {
        this.viewID = viewID;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public static class Builder {
        private String projectKey;
        private String viewID;
        private Long pageSize;
        private Long pageNum;

        public Builder() {
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder viewID(String viewID) {
            this.viewID = viewID;
            return this;
        }

        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        public WorkItemListReq build() {
            return new WorkItemListReq(this);
        }

    }
}