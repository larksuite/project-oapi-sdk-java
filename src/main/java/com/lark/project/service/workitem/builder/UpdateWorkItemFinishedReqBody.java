package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;

public class UpdateWorkItemFinishedReqBody {

    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("work_item_id")
    private Long workItemId;

    @SerializedName("node_id")
    private String nodeId;

    @SerializedName("opinion")
    private String opinion;

    @SerializedName("finished_conclusion_option_key")
    private String finishedConclusionOptionKey;

    @SerializedName("operation_type")
    private String operationType;

    @SerializedName("reset")
    private Boolean reset;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(Long workItemId) {
        this.workItemId = workItemId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getFinishedConclusionOptionKey() {
        return finishedConclusionOptionKey;
    }

    public void setFinishedConclusionOptionKey(String finishedConclusionOptionKey) {
        this.finishedConclusionOptionKey = finishedConclusionOptionKey;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Boolean getReset() {
        return reset;
    }

    public void setReset(Boolean reset) {
        this.reset = reset;
    }
}
