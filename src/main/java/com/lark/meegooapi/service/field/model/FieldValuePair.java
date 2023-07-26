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

package com.lark.meegooapi.service.field.model;

import com.google.gson.annotations.SerializedName;


public class FieldValuePair {
    /**
     *
     */
    @SerializedName("field_key")
    private String fieldKey;

    /**
     *
     */
    @SerializedName("field_value")
    private Object fieldValue;

    /**
     *
     */
    @SerializedName("target_state")
    private TargetState targetState;

    /**
     *
     */
    @SerializedName("field_type_key")
    private String fieldTypeKey;

    /**
     *
     */
    @SerializedName("field_alias")
    private String fieldAlias;

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

    public TargetState getTargetState() {
        return this.targetState;
    }

    public void setTargetState(TargetState targetState) {
        this.targetState = targetState;
    }

    public String getFieldTypeKey() {
        return this.fieldTypeKey;
    }

    public void setFieldTypeKey(String fieldTypeKey) {
        this.fieldTypeKey = fieldTypeKey;
    }

    public String getFieldAlias() {
        return this.fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

}