package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class FinishedOwnerConclusionInfo {
    @SerializedName("owner")
    private String owner;

    @SerializedName("finished_conclusion_result")
    private FinishedConclusionInfoItem finishedConclusionResult;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public FinishedConclusionInfoItem getFinishedConclusionResult() {
        return finishedConclusionResult;
    }

    public void setFinishedConclusionResult(FinishedConclusionInfoItem finishedConclusionResult) {
        this.finishedConclusionResult = finishedConclusionResult;
    }
}
