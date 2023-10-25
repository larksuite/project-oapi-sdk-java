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

package com.lark.project.service.view.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.common.model.Pagination;
import com.lark.project.service.view.model.FixView;


public class UpdateFixViewResp extends BaseResponse {
    @SerializedName("data")
    private FixView data;
    @SerializedName("pagination")
    private Pagination pagination;

    public FixView getData() {
        return this.data;
    }

    public void setData(FixView data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return this.pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}

