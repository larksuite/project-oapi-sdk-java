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

package com.lark.project.service.user.model;

import com.google.gson.annotations.SerializedName;


public class Channel {
    /**
     *
     */
    @SerializedName("tenant_name")
    private String tenantName;

    /**
     *
     */
    @SerializedName("tenant_group_id")
    private Long tenantGroupID;

    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public Long getTenantGroupID() {
        return this.tenantGroupID;
    }

    public void setTenantGroupID(Long tenantGroupID) {
        this.tenantGroupID = tenantGroupID;
    }

}