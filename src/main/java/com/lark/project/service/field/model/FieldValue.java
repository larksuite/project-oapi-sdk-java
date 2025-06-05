package com.lark.project.service.field.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FieldValue {
    @SerializedName("value")
    private String value;

    @SerializedName("label")
    private String label;

    @SerializedName("disabled")
    private Integer disabled;

    @SerializedName("action")
    private Integer action;

    @SerializedName("children")
    private List<FieldValue> children;

    @SerializedName("config_order")
    private Integer configOrder;

    @SerializedName("parent_value")
    private String parentValue;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public List<FieldValue> getChildren() {
        return children;
    }

    public void setChildren(List<FieldValue> children) {
        this.children = children;
    }

    public Integer getConfigOrder() {
        return configOrder;
    }

    public void setConfigOrder(Integer configOrder) {
        this.configOrder = configOrder;
    }

    public String getParentValue() {
        return parentValue;
    }

    public void setParentValue(String parentValue) {
        this.parentValue = parentValue;
    }
}
