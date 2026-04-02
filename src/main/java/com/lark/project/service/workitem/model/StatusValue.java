package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StatusValue {
    @SerializedName("values")
    private List<String> values;
    @SerializedName("object_property")
    private String objectProperty;

    public List<String> getValues() { return values; }
    public void setValues(List<String> values) { this.values = values; }

    public String getObjectProperty() { return objectProperty; }
    public void setObjectProperty(String objectProperty) { this.objectProperty = objectProperty; }
}
