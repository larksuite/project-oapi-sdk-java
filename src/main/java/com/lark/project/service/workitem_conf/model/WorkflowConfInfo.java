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

package com.lark.project.service.workitem_conf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class WorkflowConfInfo {
    @SerializedName("state_key")
    private String stateKey;

    @SerializedName("name")
    private String name;

    @SerializedName("tags")
    private List<String> tags;

    @SerializedName("owner_usage_mode")
    private Long ownerUsageMode;

    @SerializedName("owner_roles")
    private List<String> ownerRoles;

    @SerializedName("owners")
    private List<String> owners;

    @SerializedName("need_schedule")
    private Boolean needSchedule;

    @SerializedName("different_schedule")
    private Boolean differentSchedule;

    @SerializedName("visibility_usage_mode")
    private Long visibilityUsageMode;

    @SerializedName("deletable")
    private Boolean deletable;

    @SerializedName("deletable_operation_role")
    private List<String> deletableOperationRole;

    @SerializedName("pass_mode")
    private Long passMode;

    @SerializedName("is_limit_node")
    private Boolean isLimitNode;

    @SerializedName("done_operation_role")
    private List<String> doneOperationRole;

    @SerializedName("done_schedule")
    private Boolean doneSchedule;

    @SerializedName("done_allocate_owner")
    private Boolean doneAllocateOwner;

    public String getStateKey() {
        return this.stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getOwnerUsageMode() {
        return this.ownerUsageMode;
    }

    public void setOwnerUsageMode(Long ownerUsageMode) {
        this.ownerUsageMode = ownerUsageMode;
    }

    public List<String> getOwnerRoles() {
        return this.ownerRoles;
    }

    public void setOwnerRoles(List<String> ownerRoles) {
        this.ownerRoles = ownerRoles;
    }

    public List<String> getOwners() {
        return this.owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public Boolean getNeedSchedule() {
        return this.needSchedule;
    }

    public void setNeedSchedule(Boolean needSchedule) {
        this.needSchedule = needSchedule;
    }

    public Boolean getDifferentSchedule() {
        return this.differentSchedule;
    }

    public void setDifferentSchedule(Boolean differentSchedule) {
        this.differentSchedule = differentSchedule;
    }

    public Long getVisibilityUsageMode() {
        return this.visibilityUsageMode;
    }

    public void setVisibilityUsageMode(Long visibilityUsageMode) {
        this.visibilityUsageMode = visibilityUsageMode;
    }

    public Boolean getDeletable() {
        return this.deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public List<String> getDeletableOperationRole() {
        return this.deletableOperationRole;
    }

    public void setDeletableOperationRole(List<String> deletableOperationRole) {
        this.deletableOperationRole = deletableOperationRole;
    }

    public Long getPassMode() {
        return this.passMode;
    }

    public void setPassMode(Long passMode) {
        this.passMode = passMode;
    }

    public Boolean getIsLimitNode() {
        return this.isLimitNode;
    }

    public void setIsLimitNode(Boolean isLimitNode) {
        this.isLimitNode = isLimitNode;
    }

    public List<String> getDoneOperationRole() {
        return this.doneOperationRole;
    }

    public void setDoneOperationRole(List<String> doneOperationRole) {
        this.doneOperationRole = doneOperationRole;
    }

    public Boolean getDoneSchedule() {
        return this.doneSchedule;
    }

    public void setDoneSchedule(Boolean doneSchedule) {
        this.doneSchedule = doneSchedule;
    }

    public Boolean getDoneAllocateOwner() {
        return this.doneAllocateOwner;
    }

    public void setDoneAllocateOwner(Boolean doneAllocateOwner) {
        this.doneAllocateOwner = doneAllocateOwner;
    }

}