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

package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class SearchGroup {
    @SerializedName("search_params")
    private List<SearchParam> searchParams;

    @SerializedName("conjunction")
    private String conjunction;

    @SerializedName("search_groups")
    private List<SearchGroup> searchGroups;

    public List<SearchParam> getSearchParams() {
        return this.searchParams;
    }

    public void setSearchParams(List<SearchParam> searchParams) {
        this.searchParams = searchParams;
    }

    public String getConjunction() {
        return this.conjunction;
    }

    public void setConjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public List<SearchGroup> getSearchGroups() {
        return this.searchGroups;
    }

    public void setSearchGroups(List<SearchGroup> searchGroups) {
        this.searchGroups = searchGroups;
    }

}