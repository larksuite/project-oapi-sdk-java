package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;

public class BatchQueryWorkItemFinishedReq {
    @Body
    private BatchQueryWorkItemFinishedReqBody body;

    public BatchQueryWorkItemFinishedReq() {
    }

    public BatchQueryWorkItemFinishedReq(Builder builder) {
        this.body = builder.body;
    }

    public BatchQueryWorkItemFinishedReqBody getBatchQueryWorkItemFinishedReqBody() {
        return this.body;
    }

    public void setBatchQueryWorkItemFinishedReqBody(BatchQueryWorkItemFinishedReqBody body) {
        this.body = body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private BatchQueryWorkItemFinishedReqBody body;

        public Builder batchQueryWorkItemFinishedReqBody(BatchQueryWorkItemFinishedReqBody body) {
            this.body = body;
            return this;
        }

        public BatchQueryWorkItemFinishedReq build() {
            return new BatchQueryWorkItemFinishedReq(this);
        }
    }
}
