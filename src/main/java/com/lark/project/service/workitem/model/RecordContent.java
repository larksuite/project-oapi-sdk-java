package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class RecordContent {
    @SerializedName("object")
    private RecordObject object;
    @SerializedName("old")
    private List<String> oldValues;
    @SerializedName("new")
    private List<String> newValues;
    @SerializedName("add")
    private List<String> addValues;
    @SerializedName("delete")
    private List<String> deleteValues;
    @SerializedName("status_values")
    private List<StatusValue> statusValues;
    @SerializedName("belong_object")
    private List<RecordObject> belongObject;
    @SerializedName("extra")
    private Map<String, Object> extra;

    public RecordObject getObject() { return object; }
    public void setObject(RecordObject object) { this.object = object; }

    public List<String> getOldValues() { return oldValues; }
    public void setOldValues(List<String> oldValues) { this.oldValues = oldValues; }

    public List<String> getNewValues() { return newValues; }
    public void setNewValues(List<String> newValues) { this.newValues = newValues; }

    public List<String> getAddValues() { return addValues; }
    public void setAddValues(List<String> addValues) { this.addValues = addValues; }

    public List<String> getDeleteValues() { return deleteValues; }
    public void setDeleteValues(List<String> deleteValues) { this.deleteValues = deleteValues; }

    public List<StatusValue> getStatusValues() { return statusValues; }
    public void setStatusValues(List<StatusValue> statusValues) { this.statusValues = statusValues; }

    public List<RecordObject> getBelongObject() { return belongObject; }
    public void setBelongObject(List<RecordObject> belongObject) { this.belongObject = belongObject; }

    public Map<String, Object> getExtra() { return extra; }
    public void setExtra(Map<String, Object> extra) { this.extra = extra; }
}
