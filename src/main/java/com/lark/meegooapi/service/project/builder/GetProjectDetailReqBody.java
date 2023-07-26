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

package com.lark.meegooapi.service.project.builder;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class GetProjectDetailReqBody {
    @SerializedName("project_keys")
    private List<String> projectKeys;
    @SerializedName("user_key")
    private String userKey;
    @SerializedName("simple_names")
    private List<String> simpleNames;
    @SerializedName("tenant_group_id")
    private Long tenantGroupID;

    public List<String> getProjectKeys() {
        return this.projectKeys;
    }

    public void setProjectKeys(List<String> projectKeys) {
        this.projectKeys = projectKeys;
    }

    public String getUserKey() {
        return this.userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public List<String> getSimpleNames() {
        return this.simpleNames;
    }

    public void setSimpleNames(List<String> simpleNames) {
        this.simpleNames = simpleNames;
    }

    public Long getTenantGroupID() {
        return this.tenantGroupID;
    }

    public void setTenantGroupID(Long tenantGroupID) {
        this.tenantGroupID = tenantGroupID;
    }
}
