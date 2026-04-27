package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class FinishedConclusionInfoItem {
    @SerializedName("key")
    private String key;

    @SerializedName("label")
    private String label;

    @SerializedName("origin_label")
    private String originLabel;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getOriginLabel() {
        return originLabel;
    }

    public void setOriginLabel(String originLabel) {
        this.originLabel = originLabel;
    }
}
