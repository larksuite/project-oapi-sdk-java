package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class FinishedConclusionResult {
    @SerializedName("key")
    private String key;

    @SerializedName("label")
    private String label;

    @SerializedName("original_label")
    private String originalLabel;

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

    public String getOriginalLabel() {
        return originalLabel;
    }

    public void setOriginalLabel(String originalLabel) {
        this.originalLabel = originalLabel;
    }
}
