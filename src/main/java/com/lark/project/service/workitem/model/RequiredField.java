package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class RequiredField {
    @SerializedName("field_key")
    private String fieldKey;
    @SerializedName("field_type_key")
    private String fieldTypeKey;
    @SerializedName("finished")
    private Boolean finished;
    @SerializedName("not_finished_owner")
    private List<String> notFinishedOwner;
    @SerializedName("sub_field")
    private List<RequiredField> subField;

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldTypeKey() {
        return fieldTypeKey;
    }

    public void setFieldTypeKey(String fieldTypeKey) {
        this.fieldTypeKey = fieldTypeKey;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public List<String> getNotFinishedOwner() {
        return notFinishedOwner;
    }

    public void setNotFinishedOwner(List<String> notFinishedOwner) {
        this.notFinishedOwner = notFinishedOwner;
    }

    public List<RequiredField> getSubField() {
        return subField;
    }

    public void setSubField(List<RequiredField> subField) {
        this.subField = subField;
    }
}
