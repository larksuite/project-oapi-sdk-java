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

package com.lark.meegooapi.service.role_conf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class RoleConfDetail {
    /**
     *
     */
    @SerializedName("id")
    private String id;

    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("is_owner")
    private Boolean isOwner;

    /**
     *
     */
    @SerializedName("role_appear_mode")
    private Long roleAppearMode;

    /**
     *
     */
    @SerializedName("deletable")
    private Boolean deletable;

    /**
     *
     */
    @SerializedName("auto_enter_group")
    private Boolean autoEnterGroup;

    /**
     *
     */
    @SerializedName("member_assign_mode")
    private Long memberAssignMode;

    /**
     *
     */
    @SerializedName("members")
    private List<String> members;

    /**
     *
     */
    @SerializedName("key")
    private String key;

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsOwner() {
        return this.isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public Long getRoleAppearMode() {
        return this.roleAppearMode;
    }

    public void setRoleAppearMode(Long roleAppearMode) {
        this.roleAppearMode = roleAppearMode;
    }

    public Boolean getDeletable() {
        return this.deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public Boolean getAutoEnterGroup() {
        return this.autoEnterGroup;
    }

    public void setAutoEnterGroup(Boolean autoEnterGroup) {
        this.autoEnterGroup = autoEnterGroup;
    }

    public Long getMemberAssignMode() {
        return this.memberAssignMode;
    }

    public void setMemberAssignMode(Long memberAssignMode) {
        this.memberAssignMode = memberAssignMode;
    }

    public List<String> getMembers() {
        return this.members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}