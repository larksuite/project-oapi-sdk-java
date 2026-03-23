package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

import java.util.List;

public class BotJoinChatReq {

    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Path
    @SerializedName("work_item_id")
    private Long workItemID;

    @Body
    private BotJoinChatReqBody body;

    public BotJoinChatReq() {
    }

    public BotJoinChatReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemID() {
        return workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public BotJoinChatReqBody getBotJoinChatReqBody() {
        return body;
    }

    public void setBotJoinChatReqBody(BotJoinChatReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private Long workItemID;
        private BotJoinChatReqBody body;

        public Builder() {
            body = new BotJoinChatReqBody();
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
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder appIds(List<String> appIds) {
            this.body.setAppIds(appIds);
            return this;
        }

        public BotJoinChatReq build() {
            return new BotJoinChatReq(this);
        }
    }
}
