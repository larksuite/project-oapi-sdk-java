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

package com.lark.project.service.user.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class RoleAssign {
    /**
     *
     */
    @SerializedName("role")
    private String role;

    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("default_appear")
    private Integer defaultAppear;

    /**
     *
     */
    @SerializedName("deletable")
    private Integer deletable;

    /**
     *
     */
    @SerializedName("member_assign")
    private Integer memberAssign;

    /**
     *
     */
    @SerializedName("members")
    private List<String> members;

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDefaultAppear() {
        return this.defaultAppear;
    }

    public void setDefaultAppear(Integer defaultAppear) {
        this.defaultAppear = defaultAppear;
    }

    public Integer getDeletable() {
        return this.deletable;
    }

    public void setDeletable(Integer deletable) {
        this.deletable = deletable;
    }

    public Integer getMemberAssign() {
        return this.memberAssign;
    }

    public void setMemberAssign(Integer memberAssign) {
        this.memberAssign = memberAssign;
    }

    public List<String> getMembers() {
        return this.members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

}