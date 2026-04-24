package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class FinishedOwnerOpinionInfo {
    @SerializedName("owner")
    private String owner;

    @SerializedName("finished_opinion_result")
    private String finishedOpinionResult;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFinishedOpinionResult() {
        return finishedOpinionResult;
    }

    public void setFinishedOpinionResult(String finishedOpinionResult) {
        this.finishedOpinionResult = finishedOpinionResult;
    }
}
