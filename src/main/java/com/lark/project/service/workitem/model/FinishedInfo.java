package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class FinishedInfo {
    @SerializedName("node_id")
    private String nodeId;

    @SerializedName("finished_conclusion_option")
    private List<ConclusionOption> finishedConclusionOption;

    @SerializedName("finished_owners_conclusion_option")
    private List<ConclusionOption> finishedOwnersConclusionOption;

    @SerializedName("finished_overall_conclusion_option")
    private List<ConclusionOption> finishedOverallConclusionOption;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public List<ConclusionOption> getFinishedConclusionOption() {
        return finishedConclusionOption;
    }

    public void setFinishedConclusionOption(List<ConclusionOption> finishedConclusionOption) {
        this.finishedConclusionOption = finishedConclusionOption;
    }

    public List<ConclusionOption> getFinishedOwnersConclusionOption() {
        return finishedOwnersConclusionOption;
    }

    public void setFinishedOwnersConclusionOption(List<ConclusionOption> finishedOwnersConclusionOption) {
        this.finishedOwnersConclusionOption = finishedOwnersConclusionOption;
    }

    public List<ConclusionOption> getFinishedOverallConclusionOption() {
        return finishedOverallConclusionOption;
    }

    public void setFinishedOverallConclusionOption(List<ConclusionOption> finishedOverallConclusionOption) {
        this.finishedOverallConclusionOption = finishedOverallConclusionOption;
    }
}
