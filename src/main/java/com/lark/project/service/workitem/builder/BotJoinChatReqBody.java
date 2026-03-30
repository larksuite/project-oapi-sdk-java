package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BotJoinChatReqBody {

    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    @SerializedName("app_ids")
    private List<String> appIds;

    public String getWorkItemTypeKey() {
        return workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String workItemTypeKey;
        private List<String> appIds;

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder appIds(List<String> appIds) {
            this.appIds = appIds;
            return this;
        }

        public BotJoinChatReqBody build() {
            BotJoinChatReqBody body = new BotJoinChatReqBody();
            body.setWorkItemTypeKey(workItemTypeKey);
            body.setAppIds(appIds);
            return body;
        }
    }
}
