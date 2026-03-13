package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WBSRelationChainEntity {

    @SerializedName("wbs_relation_chain_entity")
    private List<WBSRelationChainEntityItem> WBSRelationChainEntity;

    @SerializedName("work_item_id")
    private Long workItemID;

    public List<WBSRelationChainEntityItem> getWBSRelationChainEntity() {
        return WBSRelationChainEntity;
    }

    public void setWBSRelationChainEntity(List<WBSRelationChainEntityItem> WBSRelationChainEntity) {
        this.WBSRelationChainEntity = WBSRelationChainEntity;
    }

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }
}
