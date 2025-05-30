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
import com.lark.project.service.field.model.FieldValue;

import java.util.List;


public class UpdateFieldReqBody {
    @SerializedName("field_name")
    private String fieldName;
    @SerializedName("field_key")
    private String fieldKey;
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
}
