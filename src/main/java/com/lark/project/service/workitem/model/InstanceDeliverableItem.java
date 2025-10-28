package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InstanceDeliverableItem {

    @SerializedName("name")
    private String name;

    @SerializedName("work_item_id")
    private Long workItemID;

    @SerializedName("deletable")
    private Boolean deletable;

    @SerializedName("must_complete")
    private Boolean mustComplete;

    @SerializedName("state_key")
    private String stateKey;

    @SerializedName("state_name")
    private String stateName;

    @SerializedName("owners")
    private List<String> owners;

    @SerializedName("remark")
    private String remark;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public Boolean getDeletable() {
        return deletable;
    }

    public Boolean getMustComplete() {
        return mustComplete;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public void setMustComplete(Boolean mustComplete) {
        this.mustComplete = mustComplete;
    }

    public String getStateKey() {
        return stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
