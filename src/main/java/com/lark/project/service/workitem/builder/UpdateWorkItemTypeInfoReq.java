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
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

import java.util.List;

public class UpdateWorkItemTypeInfoReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private UpdateWorkItemTypeInfoReqBody body;


    public UpdateWorkItemTypeInfoReq() {
    }

    public UpdateWorkItemTypeInfoReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public UpdateWorkItemTypeInfoReqBody getUpdateWorkItemTypeInfoReqBody() {
        return this.body;
    }

    public void setUpdateWorkItemTypeInfoReqBody(UpdateWorkItemTypeInfoReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private UpdateWorkItemTypeInfoReqBody body;

        public Builder() {
            body = new UpdateWorkItemTypeInfoReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder description(String description) {
            this.body.setDescription(description);
            return this;
        }

        public Builder isDisabled(Boolean isDisabled) {
            this.body.setIsDisabled(isDisabled);
            return this;
        }

        public Builder isPinned(Boolean isPinned) {
            this.body.setIsPinned(isPinned);
            return this;
        }

        public Builder enableSchedule(Boolean enableSchedule) {
            this.body.setEnableSchedule(enableSchedule);
            return this;
        }

        public Builder scheduleFieldKey(String scheduleFieldKey) {
            this.body.setScheduleFieldKey(scheduleFieldKey);
            return this;
        }

        public Builder estimatePointFieldKey(String estimatePointFieldKey) {
            this.body.setEstimatePointFieldKey(estimatePointFieldKey);
            return this;
        }

        public Builder actualWorkTimeFieldKey(String actualWorkTimeFieldKey) {
            this.body.setActualWorkTimeFieldKey(actualWorkTimeFieldKey);
            return this;
        }

        public Builder belongRoleKeys(List<String> belongRoleKeys) {
            this.body.setBelongRoleKeys(belongRoleKeys);
            return this;
        }

        public Builder actualWorkTimeSwitch(Boolean actualWorkTimeSwitch) {
            this.body.setActualWorkTimeSwitch(actualWorkTimeSwitch);
            return this;
        }

        public UpdateWorkItemTypeInfoReq build() {
            return new UpdateWorkItemTypeInfoReq(this);
        }

    }
}