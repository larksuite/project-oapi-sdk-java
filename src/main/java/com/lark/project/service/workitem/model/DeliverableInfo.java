package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class DeliverableInfo {
    @SerializedName("name")
    private String name;
    @SerializedName("deleted")
    private Boolean deleted;
    @SerializedName("work_item_id")
    private Long workItemID;
    @SerializedName("template_type")
    private String templateType;
    @SerializedName("template_resources")
    private Boolean templateResources;
    @SerializedName("delivery_related_info")
    private DeliveryRelatedInfo deliveryRelatedInfo;
    @SerializedName("instance_linked_virtual_resource_workitem")
    private Long instanceLinkedVirtualResourceWorkitem;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Boolean getDeleted() { return deleted; }
    public void setDeleted(Boolean deleted) { this.deleted = deleted; }

    public Long getWorkItemID() { return workItemID; }
    public void setWorkItemID(Long workItemID) { this.workItemID = workItemID; }

    public String getTemplateType() { return templateType; }
    public void setTemplateType(String templateType) { this.templateType = templateType; }

    public Boolean getTemplateResources() { return templateResources; }
    public void setTemplateResources(Boolean templateResources) { this.templateResources = templateResources; }

    public DeliveryRelatedInfo getDeliveryRelatedInfo() { return deliveryRelatedInfo; }
    public void setDeliveryRelatedInfo(DeliveryRelatedInfo deliveryRelatedInfo) { this.deliveryRelatedInfo = deliveryRelatedInfo; }

    public Long getInstanceLinkedVirtualResourceWorkitem() { return instanceLinkedVirtualResourceWorkitem; }
    public void setInstanceLinkedVirtualResourceWorkitem(Long instanceLinkedVirtualResourceWorkitem) { this.instanceLinkedVirtualResourceWorkitem = instanceLinkedVirtualResourceWorkitem; }
}
