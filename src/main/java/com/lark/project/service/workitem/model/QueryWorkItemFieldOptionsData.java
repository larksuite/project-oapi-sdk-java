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
import com.lark.project.service.field.model.Option;

import java.util.List;

public class QueryWorkItemFieldOptionsData {

    @SerializedName("options")
    private List<Option> options;

    @SerializedName("free_add")
    private Boolean freeAdd;

    @SerializedName("has_more")
    private Boolean hasMore;

    @SerializedName("field_key")
    private String fieldKey;

    @SerializedName("field_name")
    private String fieldName;

    @SerializedName("field_type")
    private String fieldType;

    @SerializedName("level_mode")
    private String levelMode;

    @SerializedName("field_alias")
    private String fieldAlias;

    @SerializedName("level_class")
    private String levelClass;

    public List<Option> getOptions() {
        return this.options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Boolean getFreeAdd() {
        return this.freeAdd;
    }

    public void setFreeAdd(Boolean freeAdd) {
        this.freeAdd = freeAdd;
    }

    public Boolean getHasMore() {
        return this.hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public String getFieldKey() {
        return this.fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getLevelMode() {
        return this.levelMode;
    }

    public void setLevelMode(String levelMode) {
        this.levelMode = levelMode;
    }

    public String getFieldAlias() {
        return this.fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public String getLevelClass() {
        return this.levelClass;
    }

    public void setLevelClass(String levelClass) {
        this.levelClass = levelClass;
    }
}