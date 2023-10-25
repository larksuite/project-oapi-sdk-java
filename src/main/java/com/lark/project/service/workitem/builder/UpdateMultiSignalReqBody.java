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

package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.MultiSignalDetail;

import java.util.List;


public class UpdateMultiSignalReqBody {
    @SerializedName("field_key")
    private String fieldKey;
    @SerializedName("field_alias")
    private String fieldAlias;
    @SerializedName("details")
    private List<MultiSignalDetail> details;
    @SerializedName("update_type")
    private String updateType;

    public String getFieldKey() {
        return this.fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldAlias() {
        return this.fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public List<MultiSignalDetail> getDetails() {
        return this.details;
    }

    public void setDetails(List<MultiSignalDetail> details) {
        this.details = details;
    }

    public String getUpdateType() {
        return this.updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }
}
