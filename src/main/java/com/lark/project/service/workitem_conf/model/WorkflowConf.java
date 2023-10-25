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

import java.util.List;


public class WorkflowConf {
    @SerializedName("status_infos")
    private List<StatusConf> statusInfos;

    @SerializedName("node_infos")
    private List<NodeConf> nodeInfos;

    @SerializedName("connections")
    private List<Connection> connections;

    public List<StatusConf> getStatusInfos() {
        return this.statusInfos;
    }

    public void setStatusInfos(List<StatusConf> statusInfos) {
        this.statusInfos = statusInfos;
    }

    public List<NodeConf> getNodeInfos() {
        return this.nodeInfos;
    }

    public void setNodeInfos(List<NodeConf> nodeInfos) {
        this.nodeInfos = nodeInfos;
    }

    public List<Connection> getConnections() {
        return this.connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }

}