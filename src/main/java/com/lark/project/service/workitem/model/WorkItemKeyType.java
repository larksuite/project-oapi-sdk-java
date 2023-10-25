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


public class WorkItemKeyType {
    @SerializedName("type_key")
    private String typeKey;

    @SerializedName("name")
    private String name;

    @SerializedName("is_disable")
    private Integer isDisable;

    @SerializedName("api_name")
    private String aPIName;

    public String getTypeKey() {
        return this.typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsDisable() {
        return this.isDisable;
    }

    public void setIsDisable(Integer isDisable) {
        this.isDisable = isDisable;
    }

    public String getAPIName() {
        return this.aPIName;
    }

    public void setAPIName(String aPIName) {
        this.aPIName = aPIName;
    }

}