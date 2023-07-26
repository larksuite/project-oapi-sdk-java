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

import java.util.List;


public class Option {
    /**
     *
     */
    @SerializedName("label")
    private String label;

    /**
     *
     */
    @SerializedName("value")
    private String value;

    /**
     *
     */
    @SerializedName("children")
    private List<Option> children;

    /**
     *
     */
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Option> getChildren() {
        return this.children;
    }

    public void setChildren(List<Option> children) {
        this.children = children;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

}