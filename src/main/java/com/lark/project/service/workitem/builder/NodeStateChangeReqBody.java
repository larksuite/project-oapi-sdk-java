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
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;

import java.util.List;


public class NodeStateChangeReqBody {
    @SerializedName("transition_id")
    private Long transitionID;
    @SerializedName("role_owners")
    private List<RoleOwner> roleOwners;
    @SerializedName("fields")
    private List<FieldValuePair> fields;

    public Long getTransitionID() {
        return this.transitionID;
    }

    public void setTransitionID(Long transitionID) {
        this.transitionID = transitionID;
    }

    public List<RoleOwner> getRoleOwners() {
        return this.roleOwners;
    }

    public void setRoleOwners(List<RoleOwner> roleOwners) {
        this.roleOwners = roleOwners;
    }

    public List<FieldValuePair> getFields() {
        return this.fields;
    }

    public void setFields(List<FieldValuePair> fields) {
        this.fields = fields;
    }
}
