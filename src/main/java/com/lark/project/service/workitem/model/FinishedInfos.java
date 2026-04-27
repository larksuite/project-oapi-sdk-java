package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class FinishedInfos {
    @SerializedName("opinion")
    private FinishedOpinion opinion;

    @SerializedName("conclusion")
    private FinishedConclusion conclusion;

    @SerializedName("summary_mode")
    private String summaryMode;

    public FinishedOpinion getOpinion() {
        return opinion;
    }

    public void setOpinion(FinishedOpinion opinion) {
        this.opinion = opinion;
    }

    public FinishedConclusion getConclusion() {
        return conclusion;
    }

    public void setConclusion(FinishedConclusion conclusion) {
        this.conclusion = conclusion;
    }

    public String getSummaryMode() {
        return summaryMode;
    }

    public void setSummaryMode(String summaryMode) {
        this.summaryMode = summaryMode;
    }
}
