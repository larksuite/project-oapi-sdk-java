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

package com.lark.project.service.field.builder;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CreateFieldReqBody {
    @SerializedName("field_name")
    private String fieldName;
    @SerializedName("field_type_key")
    private String fieldTypeKey;
    @SerializedName("value_type")
    private Long valueType;
    @SerializedName("reference_work_item_type_key")
    private String referenceWorkItemTypeKey;
    @SerializedName("reference_field_key")
    private String referenceFieldKey;
    @SerializedName("field_value")
    private Object fieldValue;
    @SerializedName("free_add")
    private Long freeAdd;
    @SerializedName("work_item_relation_uuid")
    private String workItemRelationUUID;
    @SerializedName("default_value")
    private Object defaultValue;
    @SerializedName("field_alias")
    private String fieldAlias;
    @SerializedName("help_description")
    private String helpDescription;
    @SerializedName("authorized_roles")
    private List<String> authorizedRoles;
    @SerializedName("is_multi")
    private Boolean isMulti;
    @SerializedName("format")
    private Boolean format;

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldTypeKey() {
        return this.fieldTypeKey;
    }

    public void setFieldTypeKey(String fieldTypeKey) {
        this.fieldTypeKey = fieldTypeKey;
    }

    public Long getValueType() {
        return this.valueType;
    }

    public void setValueType(Long valueType) {
        this.valueType = valueType;
    }

    public String getReferenceWorkItemTypeKey() {
        return this.referenceWorkItemTypeKey;
    }

    public void setReferenceWorkItemTypeKey(String referenceWorkItemTypeKey) {
        this.referenceWorkItemTypeKey = referenceWorkItemTypeKey;
    }

    public String getReferenceFieldKey() {
        return this.referenceFieldKey;
    }

    public void setReferenceFieldKey(String referenceFieldKey) {
        this.referenceFieldKey = referenceFieldKey;
    }

    public Object getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Long getFreeAdd() {
        return this.freeAdd;
    }

    public void setFreeAdd(Long freeAdd) {
        this.freeAdd = freeAdd;
    }

    public String getWorkItemRelationUUID() {
        return this.workItemRelationUUID;
    }

    public void setWorkItemRelationUUID(String workItemRelationUUID) {
        this.workItemRelationUUID = workItemRelationUUID;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getFieldAlias() {
        return this.fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public String getHelpDescription() {
        return this.helpDescription;
    }

    public void setHelpDescription(String helpDescription) {
        this.helpDescription = helpDescription;
    }

    public List<String> getAuthorizedRoles() {
        return this.authorizedRoles;
    }

    public void setAuthorizedRoles(List<String> authorizedRoles) {
        this.authorizedRoles = authorizedRoles;
    }

    public Boolean getIsMulti() {
        return this.isMulti;
    }

    public void setIsMulti(Boolean isMulti) {
        this.isMulti = isMulti;
    }

    public Boolean getFormat() {
        return this.format;
    }

    public void setFormat(Boolean format) {
        this.format = format;
    }
}
