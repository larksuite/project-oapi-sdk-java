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
import com.lark.project.service.workitem.model.Connection;

import java.util.List;


public class TemplateDetail {
    /**
     *
     */
    @SerializedName("workflow_confs")
    private List<WorkflowConfInfo> workflowConfs;

    /**
     *
     */
    @SerializedName("state_flow_confs")
    private List<StateFlowConfInfo> stateFlowConfs;

    /**
     *
     */
    @SerializedName("connections")
    private List<Connection> connections;

    /**
     *
     */
    @SerializedName("template_id")
    private Long templateID;

    /**
     *
     */
    @SerializedName("template_name")
    private String templateName;

    /**
     *
     */
    @SerializedName("version")
    private Long version;

    /**
     *
     */
    @SerializedName("is_disabled")
    private Long isDisabled;

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

    public List<Connection> getConnections() {
        return this.connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public Long getTemplateID() {
        return this.templateID;
    }

    public void setTemplateID(Long templateID) {
        this.templateID = templateID;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getIsDisabled() {
        return this.isDisabled;
    }

    public void setIsDisabled(Long isDisabled) {
        this.isDisabled = isDisabled;
    }

}