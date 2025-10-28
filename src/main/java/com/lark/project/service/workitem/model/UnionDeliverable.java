package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UnionDeliverable {
    @SerializedName("field_deliverables")
    private List<FieldDeliverableItem> fieldDeliverables;

    @SerializedName("instance_deliverables")
    private List<InstanceDeliverableItem> instanceDeliverables;

    public List<FieldDeliverableItem> getFieldDeliverables() {
        return fieldDeliverables;
    }

    public void setFieldDeliverables(List<FieldDeliverableItem> fieldDeliverables) {
        this.fieldDeliverables = fieldDeliverables;
    }

    public List<InstanceDeliverableItem> getInstanceDeliverables() {
        return instanceDeliverables;
    }

    public void setInstanceDeliverables(List<InstanceDeliverableItem> instanceDeliverables) {
        this.instanceDeliverables = instanceDeliverables;
    }
}
