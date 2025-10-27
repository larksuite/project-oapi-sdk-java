package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

public class FieldDeliverableItem {
    @SerializedName("field_info")
    private FieldValuePair fieldInfo;

    @SerializedName("placeholder")
    private String placeholder;

    @SerializedName("remark")
    private String remark;

    @SerializedName("status")
    private long status;

    public FieldValuePair getFieldInfo() {
        return fieldInfo;
    }

    public void setFieldInfo(FieldValuePair fieldInfo) {
        this.fieldInfo = fieldInfo;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }
}
