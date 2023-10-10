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

import java.util.List;


public class WorkItemStatus {
    @SerializedName("state_key")
    private String stateKey;

    @SerializedName("is_archived_state")
    private Boolean isArchivedState;

    @SerializedName("is_init_state")
    private Boolean isInitState;

    @SerializedName("updated_at")
    private Long updatedAt;

    @SerializedName("updated_by")
    private String updatedBy;

    @SerializedName("history")
    private List<WorkItemStatus> history;

    public String getStateKey() {
        return this.stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public Boolean getIsArchivedState() {
        return this.isArchivedState;
    }

    public void setIsArchivedState(Boolean isArchivedState) {
        this.isArchivedState = isArchivedState;
    }

    public Boolean getIsInitState() {
        return this.isInitState;
    }

    public void setIsInitState(Boolean isInitState) {
        this.isInitState = isInitState;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<WorkItemStatus> getHistory() {
        return this.history;
    }

    public void setHistory(List<WorkItemStatus> history) {
        this.history = history;
    }

}