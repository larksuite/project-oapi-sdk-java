package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import java.util.List;

public class BatchQueryDeliverableReq {
    @Body
    private BatchQueryDeliverableReqBody body;

    public BatchQueryDeliverableReq() {
    }

    public BatchQueryDeliverableReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BatchQueryDeliverableReqBody getBatchQueryDeliverableReqBody() {
        return this.body;
    }

    public void setBatchQueryDeliverableReqBody(BatchQueryDeliverableReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private BatchQueryDeliverableReqBody body;

        public Builder() {
            body = new BatchQueryDeliverableReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemIds(List<Long> workItemIds) {
            this.body.setWorkItemIds(workItemIds);
            return this;
        }

        public BatchQueryDeliverableReq build() {
            return new BatchQueryDeliverableReq(this);
        }
    }
}
