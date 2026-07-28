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

import java.util.List;

public class NodeSubWorkItemDetail {
    @SerializedName("workitems")
    private List<Long> workitems;

    @SerializedName("relation_id")
    private String relationId;

    @SerializedName("sub_workitem_group_name")
    private String subWorkitemGroupName;

    public List<Long> getWorkitems() {
        return workitems;
    }

    public void setWorkitems(List<Long> workitems) {
        this.workitems = workitems;
    }

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getSubWorkitemGroupName() {
        return subWorkitemGroupName;
    }

    public void setSubWorkitemGroupName(String subWorkitemGroupName) {
        this.subWorkitemGroupName = subWorkitemGroupName;
    }
}
