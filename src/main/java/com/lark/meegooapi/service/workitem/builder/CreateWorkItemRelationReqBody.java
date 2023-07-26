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
import com.lark.meegooapi.service.workitem.model.RelationDetail;

import java.util.List;


public class CreateWorkItemRelationReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("name")
    private String name;
    @SerializedName("relation_details")
    private List<RelationDetail> relationDetails;

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RelationDetail> getRelationDetails() {
        return this.relationDetails;
    }

    public void setRelationDetails(List<RelationDetail> relationDetails) {
        this.relationDetails = relationDetails;
    }
}
