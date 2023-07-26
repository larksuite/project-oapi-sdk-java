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

package com.lark.meegooapi.service.project_relation.builder;

import com.google.gson.annotations.SerializedName;


public class QueryProjectRelationInstanceReqBody {
    @SerializedName("relation_rule_id")
    private String relationRuleID;
    @SerializedName("relation_work_item_id")
    private Long relationWorkItemID;
    @SerializedName("relation_work_item_type_key")
    private String relationWorkItemTypeKey;
    @SerializedName("relation_project_key")
    private String relationProjectKey;

    public String getRelationRuleID() {
        return this.relationRuleID;
    }

    public void setRelationRuleID(String relationRuleID) {
        this.relationRuleID = relationRuleID;
    }

    public Long getRelationWorkItemID() {
        return this.relationWorkItemID;
    }

    public void setRelationWorkItemID(Long relationWorkItemID) {
        this.relationWorkItemID = relationWorkItemID;
    }

    public String getRelationWorkItemTypeKey() {
        return this.relationWorkItemTypeKey;
    }

    public void setRelationWorkItemTypeKey(String relationWorkItemTypeKey) {
        this.relationWorkItemTypeKey = relationWorkItemTypeKey;
    }

    public String getRelationProjectKey() {
        return this.relationProjectKey;
    }

    public void setRelationProjectKey(String relationProjectKey) {
        this.relationProjectKey = relationProjectKey;
    }
}
