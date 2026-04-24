package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class OwnerFinishedConclusion {
    @SerializedName("finished_conclusion_result")
    private FinishedConclusionResult finishedConclusionResult;

    @SerializedName("node_owner")
    private String nodeOwner;

    public FinishedConclusionResult getFinishedConclusionResult() {
        return finishedConclusionResult;
    }

    public void setFinishedConclusionResult(FinishedConclusionResult finishedConclusionResult) {
        this.finishedConclusionResult = finishedConclusionResult;
    }

    public String getNodeOwner() {
        return nodeOwner;
    }

    public void setNodeOwner(String nodeOwner) {
        this.nodeOwner = nodeOwner;
    }
}
