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
import com.lark.project.service.workitem.model.TimeInterval;

import java.util.List;


public class ViewListReqBody {
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("view_ids")
    private List<String> viewIDs;
    @SerializedName("created_by")
    private String createdBy;
    @SerializedName("created_at")
    private TimeInterval createdAt;
    @SerializedName("page_size")
    private Long pageSize;
    @SerializedName("page_num")
    private Long pageNum;

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public List<String> getViewIDs() {
        return this.viewIDs;
    }

    public void setViewIDs(List<String> viewIDs) {
        this.viewIDs = viewIDs;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public TimeInterval getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(TimeInterval createdAt) {
        this.createdAt = createdAt;
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
}
