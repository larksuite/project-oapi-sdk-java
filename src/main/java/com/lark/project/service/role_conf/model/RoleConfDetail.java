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

package com.lark.project.service.role_conf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class RoleConfDetail {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("is_owner")
    private Boolean isOwner;

    @SerializedName("role_appear_mode")
    private Long roleAppearMode;

    @SerializedName("deletable")
    private Boolean deletable;

    @SerializedName("auto_enter_group")
    private Boolean autoEnterGroup;

    @SerializedName("member_assign_mode")
    private Long memberAssignMode;

    @SerializedName("members")
    private List<String> members;

    @SerializedName("is_member_multi")
    private Boolean isMemberMulti;

    @SerializedName("lock_scope")
    private List<String> lockScope;

    @SerializedName("role_alias")
    private String roleAlias;

    @SerializedName("is_required")
    private Integer isRequired;

    @SerializedName("lock_app_id")
    private String lockAppId;

    @SerializedName("allow_delete")
    private Boolean allowDelete;

    @SerializedName("authorization_role_keys")
    private List<String> authorizationRoleKeys;

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

    public Boolean getIsMemberMulti() {
        return this.isMemberMulti;
    }

    public void setIsMemberMulti(Boolean isMemberMulti) {
        this.isMemberMulti = isMemberMulti;
    }

    public List<String> getLockScope() {
        return lockScope;
    }

    public void setLockScope(List<String> lockScope) {
        this.lockScope = lockScope;
    }

    public String getRoleAlias() {
        return roleAlias;
    }

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }

    public Integer getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public String getLockAppId() {
        return lockAppId;
    }

    public void setLockAppId(String lockAppId) {
        this.lockAppId = lockAppId;
    }

    public Boolean getAllowDelete() {
        return allowDelete;
    }

    public void setAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
    }

    public List<String> getAuthorizationRoleKeys() {
        return authorizationRoleKeys;
    }

    public void setAuthorizationRoleKeys(List<String> authorizationRoleKeys) {
        this.authorizationRoleKeys = authorizationRoleKeys;
    }
}