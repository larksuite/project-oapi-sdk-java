package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;

public class UpdateWorkItemFinishedReq {

    @Body
    private UpdateWorkItemFinishedReqBody body;

    public UpdateWorkItemFinishedReq() {
    }

    public UpdateWorkItemFinishedReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UpdateWorkItemFinishedReqBody getUpdateWorkItemFinishedReqBody() {
        return this.body;
    }

    public void setUpdateWorkItemFinishedReqBody(UpdateWorkItemFinishedReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private UpdateWorkItemFinishedReqBody body;

        public Builder() {
            body = new UpdateWorkItemFinishedReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemId(Long workItemId) {
            this.body.setWorkItemId(workItemId);
            return this;
        }

        public Builder nodeId(String nodeId) {
            this.body.setNodeId(nodeId);
            return this;
        }

        public Builder opinion(String opinion) {
            this.body.setOpinion(opinion);
            return this;
        }

        public Builder finishedConclusionOptionKey(String finishedConclusionOptionKey) {
            this.body.setFinishedConclusionOptionKey(finishedConclusionOptionKey);
            return this;
        }

        public Builder operationType(String operationType) {
            this.body.setOperationType(operationType);
            return this;
        }

        public Builder reset(Boolean reset) {
            this.body.setReset(reset);
            return this;
        }

        public UpdateWorkItemFinishedReq build() {
            return new UpdateWorkItemFinishedReq(this);
        }
    }
}
