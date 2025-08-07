package com.lark.project.service.attachment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.service.chat.builder.BotJoinChatReq;
import com.lark.project.service.chat.builder.BotJoinChatReqBody;

import java.io.File;
import java.util.List;

public class UploadAttachmentReq {

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
    private UploadAttachmentReqBody body;

    public UploadAttachmentReq() {
    }

    public UploadAttachmentReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.workItemID = builder.workItemID;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public UploadAttachmentReqBody getUploadAttachmentReqBody() {
        return this.body;
    }

    public void setUploadAttachmentReqBody(UploadAttachmentReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private String workItemTypeKey;
        private Long workItemID;
        private UploadAttachmentReqBody body;

        public Builder() {
            body = new UploadAttachmentReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder file(File file) {
            this.body.setFile(file);
            return this;
        }

        public Builder fileMimeType(String mimeType) {
            this.body.setMimeType(mimeType);
            return this;
        }

        public Builder fieldKey(String fieldKey) {
            this.body.setFieldKey(fieldKey);
            return this;
        }

        public Builder fieldAlias(String fieldAlias) {
            this.body.setFieldAlias(fieldAlias);
            return this;
        }

        public Builder index(Integer index) {
            this.body.setIndex(index);
            return this;
        }

        public UploadAttachmentReq build() {
            return new UploadAttachmentReq(this);
        }

    }

}
