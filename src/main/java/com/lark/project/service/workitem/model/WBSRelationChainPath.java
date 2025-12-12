package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WBSRelationChainPath {
    @SerializedName("wbs_relation_chain_path")
    private List<WBSRelationChainPathItem> WBSRelationChainPath;

    @SerializedName("work_item_id")
    private Long workItemID;


    public List<WBSRelationChainPathItem> getWBSRelationChainPath() {
        return WBSRelationChainPath;
    }

    public void setWBSRelationChainPath(List<WBSRelationChainPathItem> WBSRelationChainPath) {
        this.WBSRelationChainPath = WBSRelationChainPath;
    }

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }
}
