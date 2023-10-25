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

import java.util.List;


public class UpdateWorkItemTypeInfoReqBody {
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
    @SerializedName("estimate_point_field_key")
    private String estimatePointFieldKey;
    @SerializedName("actual_work_time_field_key")
    private String actualWorkTimeFieldKey;
    @SerializedName("belong_role_keys")
    private List<String> belongRoleKeys;
    @SerializedName("actual_work_time_switch")
    private Boolean actualWorkTimeSwitch;

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

    public String getEstimatePointFieldKey() {
        return this.estimatePointFieldKey;
    }

    public void setEstimatePointFieldKey(String estimatePointFieldKey) {
        this.estimatePointFieldKey = estimatePointFieldKey;
    }

    public String getActualWorkTimeFieldKey() {
        return this.actualWorkTimeFieldKey;
    }

    public void setActualWorkTimeFieldKey(String actualWorkTimeFieldKey) {
        this.actualWorkTimeFieldKey = actualWorkTimeFieldKey;
    }

    public List<String> getBelongRoleKeys() {
        return this.belongRoleKeys;
    }

    public void setBelongRoleKeys(List<String> belongRoleKeys) {
        this.belongRoleKeys = belongRoleKeys;
    }

    public Boolean getActualWorkTimeSwitch() {
        return this.actualWorkTimeSwitch;
    }

    public void setActualWorkTimeSwitch(Boolean actualWorkTimeSwitch) {
        this.actualWorkTimeSwitch = actualWorkTimeSwitch;
    }
}
