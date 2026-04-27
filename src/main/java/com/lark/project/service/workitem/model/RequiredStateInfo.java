package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class RequiredStateInfo {
    @SerializedName("state_key")
    private String stateKey;
    @SerializedName("node_fields")
    private List<RequiredField> nodeFields;

    public String getStateKey() {
        return stateKey;
    }

    public void setStateKey(String stateKey) {
        this.stateKey = stateKey;
    }

    public List<RequiredField> getNodeFields() {
        return nodeFields;
    }

    public void setNodeFields(List<RequiredField> nodeFields) {
        this.nodeFields = nodeFields;
    }
}
