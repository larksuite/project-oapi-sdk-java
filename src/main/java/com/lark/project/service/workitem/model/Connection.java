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


public class Connection {
    /**
     *
     */
    @SerializedName("source_state_key")
    private String sourceStateKey;

    /**
     *
     */
    @SerializedName("target_state_key")
    private String targetStateKey;

    /**
     *
     */
    @SerializedName("transition_id")
    private Long transitionID;

    public String getSourceStateKey() {
        return this.sourceStateKey;
    }

    public void setSourceStateKey(String sourceStateKey) {
        this.sourceStateKey = sourceStateKey;
    }

    public String getTargetStateKey() {
        return this.targetStateKey;
    }

    public void setTargetStateKey(String targetStateKey) {
        this.targetStateKey = targetStateKey;
    }

    public Long getTransitionID() {
        return this.transitionID;
    }

    public void setTransitionID(Long transitionID) {
        this.transitionID = transitionID;
    }

}