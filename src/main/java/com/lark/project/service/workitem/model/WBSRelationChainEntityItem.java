package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WBSRelationChainEntityItem {

    @SerializedName("project_key")
    private String projectKey;


    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    @SerializedName("work_item_id")
    private Long workItemID;

    @SerializedName("type")
    private String type;

    @SerializedName("work_item_name")
    private String workItemName;

    @SerializedName("state_key")
    private String stateKey;

    @SerializedName("node_name")
    private String nodeName;

    @SerializedName("sub_task_id")
    private Long subTaskID;

    @SerializedName("sub_task_name")
    private String subTaskName;

    @SerializedName("level")
    private Integer Level;


    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWorkItemName() {
        return workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    public String getStateKey() {
        return stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Long getSubTaskID() {
        return subTaskID;
    }

    public void setSubTaskID(Long subTaskID) {
        this.subTaskID = subTaskID;
    }

    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }
}
