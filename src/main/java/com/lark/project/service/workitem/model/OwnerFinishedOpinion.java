package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class OwnerFinishedOpinion {
    @SerializedName("finished_opinion_result")
    private String finishedOpinionResult;

    @SerializedName("node_owner")
    private String nodeOwner;

    public String getFinishedOpinionResult() {
        return finishedOpinionResult;
    }

    public void setFinishedOpinionResult(String finishedOpinionResult) {
        this.finishedOpinionResult = finishedOpinionResult;
    }

    public String getNodeOwner() {
        return nodeOwner;
    }

    public void setNodeOwner(String nodeOwner) {
        this.nodeOwner = nodeOwner;
    }
}
