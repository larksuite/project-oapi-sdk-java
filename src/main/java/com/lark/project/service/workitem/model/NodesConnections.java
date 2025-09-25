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
import com.lark.project.service.common.model.UserDetail;

import java.util.List;


public class NodesConnections {
    @SerializedName("template_id")
    private Long templateID;

    @SerializedName("version")
    private Long version;

    @SerializedName("workflow_nodes")
    private List<WorkflowNode> workflowNodes;

    @SerializedName("connections")
    private List<Connection> connections;

    @SerializedName("state_flow_nodes")
    private List<StateFlowNode> stateFlowNodes;

    @SerializedName("user_details")
    private List<UserDetail> userDetails;

    public List<WorkflowNode> getWorkflowNodes() {
        return this.workflowNodes;
    }

    public void setWorkflowNodes(List<WorkflowNode> workflowNodes) {
        this.workflowNodes = workflowNodes;
    }

    public List<Connection> getConnections() {
        return this.connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

    public List<StateFlowNode> getStateFlowNodes() {
        return this.stateFlowNodes;
    }

    public void setStateFlowNodes(List<StateFlowNode> stateFlowNodes) {
        this.stateFlowNodes = stateFlowNodes;
    }

    public List<UserDetail> getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(List<UserDetail> userDetails) {
        this.userDetails = userDetails;
    }

    public Long getTemplateID() {
        return templateID;
    }

    public void setTemplateID(Long templateID) {
        this.templateID = templateID;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}