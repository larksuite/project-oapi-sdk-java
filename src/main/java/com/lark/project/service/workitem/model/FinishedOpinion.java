package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FinishedOpinion {
    @SerializedName("finished_opinion_result")
    private String finishedOpinionResult;

    @SerializedName("owners_finished_opinion_result")
    private List<OwnerFinishedOpinion> ownersFinishedOpinionResult;

    public String getFinishedOpinionResult() {
        return finishedOpinionResult;
    }

    public void setFinishedOpinionResult(String finishedOpinionResult) {
        this.finishedOpinionResult = finishedOpinionResult;
    }

    public List<OwnerFinishedOpinion> getOwnersFinishedOpinionResult() {
        return ownersFinishedOpinionResult;
    }

    public void setOwnersFinishedOpinionResult(List<OwnerFinishedOpinion> ownersFinishedOpinionResult) {
        this.ownersFinishedOpinionResult = ownersFinishedOpinionResult;
    }
}
