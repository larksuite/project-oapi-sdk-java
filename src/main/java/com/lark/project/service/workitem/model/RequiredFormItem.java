package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class RequiredFormItem {
    @SerializedName("class")
    private String clazz;
    @SerializedName("key")
    private String key;
    @SerializedName("field_type_key")
    private String fieldTypeKey;
    @SerializedName("finished")
    private Boolean finished;
    @SerializedName("not_finished_owner")
    private List<String> notFinishedOwner;
    @SerializedName("sub_field")
    private List<RequiredField> subField;
    @SerializedName("state_info")
    private RequiredStateInfo stateInfo;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

    public RequiredStateInfo getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(RequiredStateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }
}
