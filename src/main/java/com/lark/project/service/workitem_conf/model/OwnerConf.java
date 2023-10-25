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

package com.lark.project.service.workitem_conf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class OwnerConf {
    @SerializedName("owner_usage_mode")
    private String ownerUsageMode;

    @SerializedName("owner_roles")
    private List<String> ownerRoles;

    @SerializedName("user_keys")
    private List<String> userKeys;

    public String getOwnerUsageMode() {
        return this.ownerUsageMode;
    }

    public void setOwnerUsageMode(String ownerUsageMode) {
        this.ownerUsageMode = ownerUsageMode;
    }

    public List<String> getOwnerRoles() {
        return this.ownerRoles;
    }

    public void setOwnerRoles(List<String> ownerRoles) {
        this.ownerRoles = ownerRoles;
    }

    public List<String> getUserKeys() {
        return this.userKeys;
    }

    public void setUserKeys(List<String> userKeys) {
        this.userKeys = userKeys;
    }

}