package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;

public class GetTransitionRequiredInfoReq {
    @Body
    private GetTransitionRequiredInfoReqBody body;

    public GetTransitionRequiredInfoReq() {
    }

    public GetTransitionRequiredInfoReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public GetTransitionRequiredInfoReqBody getGetTransitionRequiredInfoReqBody() {
        return this.body;
    }

    public void setGetTransitionRequiredInfoReqBody(GetTransitionRequiredInfoReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private GetTransitionRequiredInfoReqBody body;

        public Builder() {
            body = new GetTransitionRequiredInfoReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder workItemId(Long workItemId) {
            this.body.setWorkItemId(workItemId);
            return this;
        }

        public Builder stateKey(String stateKey) {
            this.body.setStateKey(stateKey);
            return this;
        }

        public Builder mode(String mode) {
            this.body.setMode(mode);
            return this;
        }

        public GetTransitionRequiredInfoReq build() {
            return new GetTransitionRequiredInfoReq(this);
        }
    }
}
