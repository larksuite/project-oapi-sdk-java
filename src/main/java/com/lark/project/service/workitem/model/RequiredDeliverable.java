package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class RequiredDeliverable {
    @SerializedName("finished")
    private Boolean finished;
    @SerializedName("deliverable_id")
    private Long deliverableId;

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Long getDeliverableId() {
        return deliverableId;
    }

    public void setDeliverableId(Long deliverableId) {
        this.deliverableId = deliverableId;
    }
}
