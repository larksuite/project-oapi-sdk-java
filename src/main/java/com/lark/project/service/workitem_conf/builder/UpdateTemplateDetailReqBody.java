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

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem_conf.model.StateFlowConfInfo;
import com.lark.project.service.workitem_conf.model.WorkflowConfInfo;

import java.util.List;


public class UpdateTemplateDetailReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("template_id")
    private Long templateID;
    @SerializedName("workflow_confs")
    private List<WorkflowConfInfo> workflowConfs;
    @SerializedName("state_flow_confs")
    private List<StateFlowConfInfo> stateFlowConfs;

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getTemplateID() {
        return this.templateID;
    }

    public void setTemplateID(Long templateID) {
        this.templateID = templateID;
    }

    public List<WorkflowConfInfo> getWorkflowConfs() {
        return this.workflowConfs;
    }

    public void setWorkflowConfs(List<WorkflowConfInfo> workflowConfs) {
        this.workflowConfs = workflowConfs;
    }

    public List<StateFlowConfInfo> getStateFlowConfs() {
        return this.stateFlowConfs;
    }

    public void setStateFlowConfs(List<StateFlowConfInfo> stateFlowConfs) {
        this.stateFlowConfs = stateFlowConfs;
    }
}
