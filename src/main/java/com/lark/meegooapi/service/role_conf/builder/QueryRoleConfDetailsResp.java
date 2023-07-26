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

package com.lark.meegooapi.service.role_conf.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.meegooapi.core.response.BaseResponse;
import com.lark.meegooapi.service.role_conf.model.RoleConfDetail;

import java.util.List;


public class QueryRoleConfDetailsResp extends BaseResponse {
    @SerializedName("data")
    private List<RoleConfDetail> data;

    public List<RoleConfDetail> getData() {
        return this.data;
    }

    public void setData(List<RoleConfDetail> data) {
        this.data = data;
    }
}

