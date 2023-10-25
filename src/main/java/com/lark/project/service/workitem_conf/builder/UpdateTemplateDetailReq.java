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

package com.lark.project.service.workitem_conf.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.workitem_conf.model.StateFlowConfInfo;
import com.lark.project.service.workitem_conf.model.WorkflowConfInfo;

import java.util.List;

public class UpdateTemplateDetailReq {
    @Body
    private UpdateTemplateDetailReqBody body;


    public UpdateTemplateDetailReq() {
    }

    public UpdateTemplateDetailReq(Builder builder) {
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UpdateTemplateDetailReqBody getUpdateTemplateDetailReqBody() {
        return this.body;
    }

    public void setUpdateTemplateDetailReqBody(UpdateTemplateDetailReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private UpdateTemplateDetailReqBody body;

        public Builder() {
            body = new UpdateTemplateDetailReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder templateID(Long templateID) {
            this.body.setTemplateID(templateID);
            return this;
        }

        public Builder workflowConfs(List<WorkflowConfInfo> workflowConfs) {
            this.body.setWorkflowConfs(workflowConfs);
            return this;
        }

        public Builder stateFlowConfs(List<StateFlowConfInfo> stateFlowConfs) {
            this.body.setStateFlowConfs(stateFlowConfs);
            return this;
        }

        public UpdateTemplateDetailReq build() {
            return new UpdateTemplateDetailReq(this);
        }

    }
}