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


public class NodeConf {
    @SerializedName("state_key")
    private String stateKey;

    @SerializedName("node_name")
    private String nodeName;

    @SerializedName("node_tags")
    private List<String> nodeTags;

    @SerializedName("node_type")
    private String nodeType;

    @SerializedName("is_visibility")
    private Integer isVisibility;

    @SerializedName("need_schedule")
    private Boolean needSchedule;

    @SerializedName("owner")
    private OwnerConf owner;

    @SerializedName("wbs_status_map")
    private WbsStatusMap wbsStatusMap;

    @SerializedName("node_sub_process")
    private SubProcessConf nodeSubProcess;

    @SerializedName("wbs_node_map")
    private WbsNodeMap wbsNodeMap;

    public String getStateKey() {
        return this.stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public String getNodeName() {
        return this.nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<String> getNodeTags() {
        return this.nodeTags;
    }

    public void setNodeTags(List<String> nodeTags) {
        this.nodeTags = nodeTags;
    }

    public String getNodeType() {
        return this.nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public Integer getIsVisibility() {
        return this.isVisibility;
    }

    public void setIsVisibility(Integer isVisibility) {
        this.isVisibility = isVisibility;
    }

    public Boolean getNeedSchedule() {
        return this.needSchedule;
    }

    public void setNeedSchedule(Boolean needSchedule) {
        this.needSchedule = needSchedule;
    }

    public OwnerConf getOwner() {
        return this.owner;
    }

    public void setOwner(OwnerConf owner) {
        this.owner = owner;
    }

    public WbsStatusMap getWbsStatusMap() {
        return this.wbsStatusMap;
    }

    public void setWbsStatusMap(WbsStatusMap wbsStatusMap) {
        this.wbsStatusMap = wbsStatusMap;
    }

    public SubProcessConf getNodeSubProcess() {
        return this.nodeSubProcess;
    }

    public void setNodeSubProcess(SubProcessConf nodeSubProcess) {
        this.nodeSubProcess = nodeSubProcess;
    }

    public WbsNodeMap getWbsNodeMap() {
        return this.wbsNodeMap;
    }

    public void setWbsNodeMap(WbsNodeMap wbsNodeMap) {
        this.wbsNodeMap = wbsNodeMap;
    }

}