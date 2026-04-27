package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FinishedConclusionInfo {
    @SerializedName("finished_conclusion_result")
    private FinishedConclusionInfoItem finishedConclusionResult;

    @SerializedName("owners_finished_conclusion_result")
    private List<FinishedOwnerConclusionInfo> ownersFinishedConclusionResult;

    public FinishedConclusionInfoItem getFinishedConclusionResult() {
        return finishedConclusionResult;
    }

    public void setFinishedConclusionResult(FinishedConclusionInfoItem finishedConclusionResult) {
        this.finishedConclusionResult = finishedConclusionResult;
    }

    public List<FinishedOwnerConclusionInfo> getOwnersFinishedConclusionResult() {
        return ownersFinishedConclusionResult;
    }

    public void setOwnersFinishedConclusionResult(List<FinishedOwnerConclusionInfo> ownersFinishedConclusionResult) {
        this.ownersFinishedConclusionResult = ownersFinishedConclusionResult;
    }
}
