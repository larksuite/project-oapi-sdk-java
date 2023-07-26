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

package com.lark.meegooapi.service.workitem_conf.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class StateFlowConfInfo {
    /**
     *
     */
    @SerializedName("state_key")
    private String stateKey;

    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("state_type")
    private Long stateType;

    /**
     *
     */
    @SerializedName("authorized_roles")
    private List<String> authorizedRoles;

    /**
     *
     */
    @SerializedName("confirm_form_list")
    private List<ConfirmForm> confirmFormList;

    /**
     *
     */
    @SerializedName("action")
    private Long action;

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

    public Long getStateType() {
        return this.stateType;
    }

    public void setStateType(Long stateType) {
        this.stateType = stateType;
    }

    public List<String> getAuthorizedRoles() {
        return this.authorizedRoles;
    }

    public void setAuthorizedRoles(List<String> authorizedRoles) {
        this.authorizedRoles = authorizedRoles;
    }

    public List<ConfirmForm> getConfirmFormList() {
        return this.confirmFormList;
    }

    public void setConfirmFormList(List<ConfirmForm> confirmFormList) {
        this.confirmFormList = confirmFormList;
    }

    public Long getAction() {
        return this.action;
    }

    public void setAction(Long action) {
        this.action = action;
    }

}