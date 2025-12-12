package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class WBSRelationChainPathItem {
    @SerializedName("project_key")
    private String ProjectKey;

    @SerializedName("level")
    private Integer Level;

    @SerializedName("type")
    private String Type;

    @SerializedName("work_item_type_key")
    private String WorkItemTypeKey;

    @SerializedName("name")
    private String Name;

    @SerializedName("node_name")
    private String NodeName;


    public String getProjectKey() {
        return ProjectKey;
    }

    public void setProjectKey(String projectKey) {
        ProjectKey = projectKey;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getWorkItemTypeKey() {
        return WorkItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        WorkItemTypeKey = workItemTypeKey;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNodeName() {
        return NodeName;
    }

    public void setNodeName(String nodeName) {
        NodeName = nodeName;
    }
}
