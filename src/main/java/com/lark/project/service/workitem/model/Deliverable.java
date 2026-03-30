package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class Deliverable {
    @SerializedName("deliverable_info")
    private DeliverableInfo deliverableInfo;
    @SerializedName("deliverable_type")
    private String deliverableType;
    @SerializedName("deliverable_uuid")
    private String deliverableUUID;

    public DeliverableInfo getDeliverableInfo() { return deliverableInfo; }
    public void setDeliverableInfo(DeliverableInfo deliverableInfo) { this.deliverableInfo = deliverableInfo; }

    public String getDeliverableType() { return deliverableType; }
    public void setDeliverableType(String deliverableType) { this.deliverableType = deliverableType; }

    public String getDeliverableUUID() { return deliverableUUID; }
    public void setDeliverableUUID(String deliverableUUID) { this.deliverableUUID = deliverableUUID; }
}
