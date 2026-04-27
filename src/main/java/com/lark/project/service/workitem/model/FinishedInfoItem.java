package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class FinishedInfoItem {
    @SerializedName("node_id")
    private String nodeId;

    @SerializedName("opinion")
    private FinishedOpinionInfo opinion;

    @SerializedName("conclusion")
    private FinishedConclusionInfo conclusion;

    @SerializedName("summary_mode")
    private String summaryMode;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public FinishedOpinionInfo getOpinion() {
        return opinion;
    }

    public void setOpinion(FinishedOpinionInfo opinion) {
        this.opinion = opinion;
    }

    public FinishedConclusionInfo getConclusion() {
        return conclusion;
    }

    public void setConclusion(FinishedConclusionInfo conclusion) {
        this.conclusion = conclusion;
    }

    public String getSummaryMode() {
        return summaryMode;
    }

    public void setSummaryMode(String summaryMode) {
        this.summaryMode = summaryMode;
    }
}
