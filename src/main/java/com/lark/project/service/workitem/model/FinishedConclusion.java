package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FinishedConclusion {
    @SerializedName("finished_conclusion_result")
    private FinishedConclusionResult finishedConclusionResult;

    @SerializedName("owners_finished_conclusion_result")
    private List<OwnerFinishedConclusion> ownersFinishedConclusionResult;

    public FinishedConclusionResult getFinishedConclusionResult() {
        return finishedConclusionResult;
    }

    public void setFinishedConclusionResult(FinishedConclusionResult finishedConclusionResult) {
        this.finishedConclusionResult = finishedConclusionResult;
    }

    public List<OwnerFinishedConclusion> getOwnersFinishedConclusionResult() {
        return ownersFinishedConclusionResult;
    }

    public void setOwnersFinishedConclusionResult(List<OwnerFinishedConclusion> ownersFinishedConclusionResult) {
        this.ownersFinishedConclusionResult = ownersFinishedConclusionResult;
    }
}
