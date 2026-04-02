package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;

public class FreezeWorkItemReq {
    @Body
    private FreezeWorkItemReqBody body;

    public FreezeWorkItemReq() {
    }

    public FreezeWorkItemReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public FreezeWorkItemReqBody getFreezeWorkItemReqBody() {
        return this.body;
    }

    public void setFreezeWorkItemReqBody(FreezeWorkItemReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private FreezeWorkItemReqBody body;

        public Builder() {
            body = new FreezeWorkItemReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.body.setWorkItemID(workItemID);
            return this;
        }

        public Builder isFrozen(Boolean isFrozen) {
            this.body.setIsFrozen(isFrozen);
            return this;
        }

        public FreezeWorkItemReq build() {
            return new FreezeWorkItemReq(this);
        }
    }
}
