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

package com.lark.meegooapi.service.task.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.meegooapi.service.workitem.model.TimeInterval;

import java.util.List;


public class SearchSubtaskReqBody {
    @SerializedName("project_keys")
    private List<String> projectKeys;
    @SerializedName("page_size")
    private Long pageSize;
    @SerializedName("page_num")
    private Long pageNum;
    @SerializedName("name")
    private String name;
    @SerializedName("user_keys")
    private List<String> userKeys;
    @SerializedName("status")
    private Integer status;
    @SerializedName("created_at")
    private TimeInterval createdAt;
    @SerializedName("simple_names")
    private List<String> simpleNames;

    public List<String> getProjectKeys() {
        return this.projectKeys;
    }

    public void setProjectKeys(List<String> projectKeys) {
        this.projectKeys = projectKeys;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getUserKeys() {
        return this.userKeys;
    }

    public void setUserKeys(List<String> userKeys) {
        this.userKeys = userKeys;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TimeInterval getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(TimeInterval createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getSimpleNames() {
        return this.simpleNames;
    }

    public void setSimpleNames(List<String> simpleNames) {
        this.simpleNames = simpleNames;
    }
}
