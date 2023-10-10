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

package com.lark.project.service.field.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class SimpleField {
    @SerializedName("field_key")
    private String fieldKey;

    @SerializedName("field_type_key")
    private String fieldTypeKey;

    @SerializedName("options")
    private List<Option> options;

    @SerializedName("compound_fields")
    private List<SimpleField> compoundFields;

    @SerializedName("field_alias")
    private String fieldAlias;

    @SerializedName("field_name")
    private String fieldName;

    @SerializedName("is_custom_field")
    private Boolean isCustomField;

    @SerializedName("is_obsoleted")
    private Boolean isObsoleted;

    @SerializedName("work_item_scopes")
    private List<String> workItemScopes;

    @SerializedName("value_generate_mode")
    private String valueGenerateMode;

    public String getFieldKey() {
        return this.fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldTypeKey() {
        return this.fieldTypeKey;
    }

    public void setFieldTypeKey(String fieldTypeKey) {
        this.fieldTypeKey = fieldTypeKey;
    }

    public List<Option> getOptions() {
        return this.options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<SimpleField> getCompoundFields() {
        return this.compoundFields;
    }

    public void setCompoundFields(List<SimpleField> compoundFields) {
        this.compoundFields = compoundFields;
    }

    public String getFieldAlias() {
        return this.fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Boolean getIsCustomField() {
        return this.isCustomField;
    }

    public void setIsCustomField(Boolean isCustomField) {
        this.isCustomField = isCustomField;
    }

    public Boolean getIsObsoleted() {
        return this.isObsoleted;
    }

    public void setIsObsoleted(Boolean isObsoleted) {
        this.isObsoleted = isObsoleted;
    }

    public List<String> getWorkItemScopes() {
        return this.workItemScopes;
    }

    public void setWorkItemScopes(List<String> workItemScopes) {
        this.workItemScopes = workItemScopes;
    }

    public String getValueGenerateMode() {
        return this.valueGenerateMode;
    }

    public void setValueGenerateMode(String valueGenerateMode) {
        this.valueGenerateMode = valueGenerateMode;
    }

}