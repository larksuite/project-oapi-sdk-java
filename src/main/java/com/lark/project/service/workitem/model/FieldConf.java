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
import com.lark.project.service.user.model.RoleAssign;

import java.util.List;


public class FieldConf {
    @SerializedName("is_required")
    private Integer isRequired;

    @SerializedName("is_visibility")
    private Integer isVisibility;

    @SerializedName("role_assign")
    private List<RoleAssign> roleAssign;

    @SerializedName("field_name")
    private String fieldName;

    @SerializedName("field_key")
    private String fieldKey;

    @SerializedName("field_alias")
    private String fieldAlias;

    @SerializedName("field_type_key")
    private String fieldTypeKey;

    @SerializedName("default_value")
    private DefaultValue defaultValue;

    @SerializedName("options")
    private List<OptionConf> options;

    @SerializedName("compound_fields")
    private List<FieldConf> compoundFields;

    @SerializedName("is_validity")
    private Integer isValidity;

    @SerializedName("label")
    private String label;

    public Integer getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public Integer getIsVisibility() {
        return this.isVisibility;
    }

    public void setIsVisibility(Integer isVisibility) {
        this.isVisibility = isVisibility;
    }

    public List<RoleAssign> getRoleAssign() {
        return this.roleAssign;
    }

    public void setRoleAssign(List<RoleAssign> roleAssign) {
        this.roleAssign = roleAssign;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldKey() {
        return this.fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldAlias() {
        return this.fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public String getFieldTypeKey() {
        return this.fieldTypeKey;
    }

    public void setFieldTypeKey(String fieldTypeKey) {
        this.fieldTypeKey = fieldTypeKey;
    }

    public DefaultValue getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(DefaultValue defaultValue) {
        this.defaultValue = defaultValue;
    }

    public List<OptionConf> getOptions() {
        return this.options;
    }

    public void setOptions(List<OptionConf> options) {
        this.options = options;
    }

    public List<FieldConf> getCompoundFields() {
        return this.compoundFields;
    }

    public void setCompoundFields(List<FieldConf> compoundFields) {
        this.compoundFields = compoundFields;
    }

    public Integer getIsValidity() {
        return this.isValidity;
    }

    public void setIsValidity(Integer isValidity) {
        this.isValidity = isValidity;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}