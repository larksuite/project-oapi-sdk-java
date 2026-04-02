package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class DeliveryRelatedInfo {
    @SerializedName("root_work_item")
    private DeliveryRelatedInfoItem rootWorkItem;
    @SerializedName("source_work_item")
    private DeliveryRelatedInfoItem sourceWorkItem;

    public DeliveryRelatedInfoItem getRootWorkItem() { return rootWorkItem; }
    public void setRootWorkItem(DeliveryRelatedInfoItem rootWorkItem) { this.rootWorkItem = rootWorkItem; }

    public DeliveryRelatedInfoItem getSourceWorkItem() { return sourceWorkItem; }
    public void setSourceWorkItem(DeliveryRelatedInfoItem sourceWorkItem) { this.sourceWorkItem = sourceWorkItem; }
}
