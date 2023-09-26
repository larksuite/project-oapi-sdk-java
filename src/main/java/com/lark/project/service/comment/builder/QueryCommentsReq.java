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

package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Path;
import com.lark.project.core.annotation.Query;

public class QueryCommentsReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Query
    @SerializedName("page_size")
    private Long pageSize;
    @Query
    @SerializedName("page_num")
    private Long pageNum;

    public QueryCommentsReq() {
    }

    public QueryCommentsReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.workItemTypeKey = builder.workItemTypeKey;
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

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
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
        private Long workItemID;
        private String workItemTypeKey;
        private Long pageSize;
        private Long pageNum;

        public Builder() {
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
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

        public QueryCommentsReq build() {
            return new QueryCommentsReq(this);
        }

    }
}