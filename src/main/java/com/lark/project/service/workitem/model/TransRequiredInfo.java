package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TransRequiredInfo {
    @SerializedName("tasks")
    private List<RequiredTask> tasks;
    @SerializedName("form_items")
    private List<RequiredFormItem> formItems;
    @SerializedName("node_fields")
    private List<RequiredField> nodeFields;
    @SerializedName("deliverables")
    private List<RequiredDeliverable> deliverables;

    public List<RequiredTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<RequiredTask> tasks) {
        this.tasks = tasks;
    }

    public List<RequiredFormItem> getFormItems() {
        return formItems;
    }

    public void setFormItems(List<RequiredFormItem> formItems) {
        this.formItems = formItems;
    }

    public List<RequiredField> getNodeFields() {
        return nodeFields;
    }

    public void setNodeFields(List<RequiredField> nodeFields) {
        this.nodeFields = nodeFields;
    }

    public List<RequiredDeliverable> getDeliverables() {
        return deliverables;
    }

    public void setDeliverables(List<RequiredDeliverable> deliverables) {
        this.deliverables = deliverables;
    }
}
