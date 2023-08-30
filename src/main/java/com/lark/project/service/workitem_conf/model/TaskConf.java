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


public class TaskConf {
    /**
     *
     */
    @SerializedName("action")
    private Long action;

    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("id")
    private String id;

    /**
     *
     */
    @SerializedName("deliverable_field_id")
    private String deliverableFieldID;

    /**
     *
     */
    @SerializedName("pass_mode")
    private Long passMode;

    /**
     *
     */
    @SerializedName("node_pass_required_mode")
    private Long nodePassRequiredMode;

    public Long getAction() {
        return this.action;
    }

    public void setAction(Long action) {
        this.action = action;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getDeliverableFieldID() {
        return this.deliverableFieldID;
    }

    public void setDeliverableFieldID(String deliverableFieldID) {
        this.deliverableFieldID = deliverableFieldID;
    }

    public Long getPassMode() {
        return this.passMode;
    }

    public void setPassMode(Long passMode) {
        this.passMode = passMode;
    }

    public Long getNodePassRequiredMode() {
        return this.nodePassRequiredMode;
    }

    public void setNodePassRequiredMode(Long nodePassRequiredMode) {
        this.nodePassRequiredMode = nodePassRequiredMode;
    }

}