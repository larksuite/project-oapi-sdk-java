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

package com.lark.meegooapi.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.meegooapi.service.workitem.model.Expand;

import java.util.List;


public class QueryWorkflowReqBody {
    @SerializedName("fields")
    private List<String> fields;
    @SerializedName("flow_type")
    private Long flowType;
    @SerializedName("expand")
    private Expand expand;

    public List<String> getFields() {
        return this.fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public Long getFlowType() {
        return this.flowType;
    }

    public void setFlowType(Long flowType) {
        this.flowType = flowType;
    }

    public Expand getExpand() {
        return this.expand;
    }

    public void setExpand(Expand expand) {
        this.expand = expand;
    }
}
