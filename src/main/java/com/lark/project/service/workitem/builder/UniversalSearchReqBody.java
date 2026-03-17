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

package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.SearchGroup;
import com.lark.project.service.workitem.model.UniversalSearchPagination;

import java.util.List;

public class UniversalSearchReqBody {
    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    @SerializedName("search_group")
    private SearchGroup searchGroup;

    @SerializedName("pagination")
    private UniversalSearchPagination pagination;

    @SerializedName("field_selected")
    private List<String> fieldSelected;

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

    public SearchGroup getSearchGroup() {
        return this.searchGroup;
    }

    public void setSearchGroup(SearchGroup searchGroup) {
        this.searchGroup = searchGroup;
    }

    public UniversalSearchPagination getPagination() {
        return this.pagination;
    }

    public void setPagination(UniversalSearchPagination pagination) {
        this.pagination = pagination;
    }

    public List<String> getFieldSelected() {
        return this.fieldSelected;
    }

    public void setFieldSelected(List<String> fieldSelected) {
        this.fieldSelected = fieldSelected;
    }
}
