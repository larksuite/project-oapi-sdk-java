package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;


public class DownloadAttachmentReq {

    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Body
    private DownloadAttachmentReqBody body;

    public DownloadAttachmentReq() {
    }

    public DownloadAttachmentReq(DownloadAttachmentReq.Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.workItemID = builder.workItemID;
        this.body = builder.body;
    }

    public static DownloadAttachmentReq.Builder newBuilder() {
        return new DownloadAttachmentReq.Builder();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public DownloadAttachmentReqBody getDownloadAttachmentReqBody() {
        return this.body;
    }

    public void setDownloadAttachmentReqBody(DownloadAttachmentReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private Long workItemID;
        private DownloadAttachmentReqBody body;

        public Builder() {
            body = new DownloadAttachmentReqBody();
        }

        public DownloadAttachmentReq.Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public DownloadAttachmentReq.Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public DownloadAttachmentReq.Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public DownloadAttachmentReq.Builder uuid(String uuid) {
            this.body.setUUID(uuid);
            return this;
        }

        public DownloadAttachmentReq build() {
            return new DownloadAttachmentReq(this);
        }

    }

}
