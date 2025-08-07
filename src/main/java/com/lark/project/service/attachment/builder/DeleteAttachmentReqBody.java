package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.util.List;

public class DeleteAttachmentReqBody {

    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("work_item_id")
    private String workitemID;

    @SerializedName("field_key")
    private String fieldKey;

    @SerializedName("field_alias")
    private String fieldAlias;

    @SerializedName("uuids")
    private List<String> uuids;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkitemID() {
        return workitemID;
    }

    public void setWorkitemID(String workitemID) {
        this.workitemID = workitemID;
    }

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public String getFieldAlias() {
        return fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public List<String> getUuids() {
        return uuids;
    }

    public void setUuids(List<String> uuids) {
        this.uuids = uuids;
    }
}
