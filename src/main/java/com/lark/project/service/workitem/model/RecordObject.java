package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

public class RecordObject {
    @SerializedName("object_type")
    private String objectType;
    @SerializedName("object_value")
    private String objectValue;

    public String getObjectType() { return objectType; }
    public void setObjectType(String objectType) { this.objectType = objectType; }

    public String getObjectValue() { return objectValue; }
    public void setObjectValue(String objectValue) { this.objectValue = objectValue; }
}
