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

package com.lark.meegooapi.service.workitem.builder;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CompositiveSearchReqBody {
    @SerializedName("project_keys")
    private List<String> projectKeys;
    @SerializedName("query_type")
    private String queryType;
    @SerializedName("query")
    private String query;
    @SerializedName("query_sub_type")
    private List<String> querySubType;
    @SerializedName("page_size")
    private Long pageSize;
    @SerializedName("page_num")
    private Long pageNum;
    @SerializedName("simple_names")
    private List<String> simpleNames;

    public List<String> getProjectKeys() {
        return this.projectKeys;
    }

    public void setProjectKeys(List<String> projectKeys) {
        this.projectKeys = projectKeys;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQuery() {
        return this.query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<String> getQuerySubType() {
        return this.querySubType;
    }

    public void setQuerySubType(List<String> querySubType) {
        this.querySubType = querySubType;
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

    public List<String> getSimpleNames() {
        return this.simpleNames;
    }

    public void setSimpleNames(List<String> simpleNames) {
        this.simpleNames = simpleNames;
    }
}
