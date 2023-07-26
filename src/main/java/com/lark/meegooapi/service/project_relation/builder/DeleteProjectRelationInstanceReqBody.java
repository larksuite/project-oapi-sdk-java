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


public class DeleteProjectRelationInstanceReqBody {
    @SerializedName("relation_rule_id")
    private String relationRuleID;
    @SerializedName("relation_work_item_id")
    private Long relationWorkItemID;

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
}
