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

package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.role_conf.model.SimpleRoleConf;

import java.util.List;


public class WorkItemTypeInfo {
    @SerializedName("type_key")
    private String typeKey;

    @SerializedName("name")
    private String name;

    @SerializedName("flow_mode")
    private String flowMode;

    @SerializedName("api_name")
    private String aPIName;

    @SerializedName("description")
    private String description;

    @SerializedName("is_disabled")
    private Boolean isDisabled;

    @SerializedName("is_pinned")
    private Boolean isPinned;

    @SerializedName("enable_schedule")
    private Boolean enableSchedule;

    @SerializedName("schedule_field_key")
    private String scheduleFieldKey;

    @SerializedName("schedule_field_name")
    private String scheduleFieldName;

    @SerializedName("estimate_point_field_key")
    private String estimatePointFieldKey;

    @SerializedName("estimate_point_field_name")
    private String estimatePointFieldName;

    @SerializedName("actual_work_time_field_key")
    private String actualWorkTimeFieldKey;

    @SerializedName("actual_work_time_field_name")
    private String actualWorkTimeFieldName;

    @SerializedName("belong_roles")
    private List<SimpleRoleConf> belongRoles;

    public String getTypeKey() {
        return this.typeKey;
    }

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowMode() {
        return this.flowMode;
    }

    public void setFlowMode(String flowMode) {
        this.flowMode = flowMode;
    }

    public String getAPIName() {
        return this.aPIName;
    }

    public void setAPIName(String aPIName) {
        this.aPIName = aPIName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Boolean getIsPinned() {
        return this.isPinned;
    }

    public void setIsPinned(Boolean isPinned) {
        this.isPinned = isPinned;
    }

    public Boolean getEnableSchedule() {
        return this.enableSchedule;
    }

    public void setEnableSchedule(Boolean enableSchedule) {
        this.enableSchedule = enableSchedule;
    }

    public String getScheduleFieldKey() {
        return this.scheduleFieldKey;
    }

    public void setScheduleFieldKey(String scheduleFieldKey) {
        this.scheduleFieldKey = scheduleFieldKey;
    }

    public String getScheduleFieldName() {
        return this.scheduleFieldName;
    }

    public void setScheduleFieldName(String scheduleFieldName) {
        this.scheduleFieldName = scheduleFieldName;
    }

    public String getEstimatePointFieldKey() {
        return this.estimatePointFieldKey;
    }

    public void setEstimatePointFieldKey(String estimatePointFieldKey) {
        this.estimatePointFieldKey = estimatePointFieldKey;
    }

    public String getEstimatePointFieldName() {
        return this.estimatePointFieldName;
    }

    public void setEstimatePointFieldName(String estimatePointFieldName) {
        this.estimatePointFieldName = estimatePointFieldName;
    }

    public String getActualWorkTimeFieldKey() {
        return this.actualWorkTimeFieldKey;
    }

    public void setActualWorkTimeFieldKey(String actualWorkTimeFieldKey) {
        this.actualWorkTimeFieldKey = actualWorkTimeFieldKey;
    }

    public String getActualWorkTimeFieldName() {
        return this.actualWorkTimeFieldName;
    }

    public void setActualWorkTimeFieldName(String actualWorkTimeFieldName) {
        this.actualWorkTimeFieldName = actualWorkTimeFieldName;
    }

    public List<SimpleRoleConf> getBelongRoles() {
        return this.belongRoles;
    }

    public void setBelongRoles(List<SimpleRoleConf> belongRoles) {
        this.belongRoles = belongRoles;
    }

}