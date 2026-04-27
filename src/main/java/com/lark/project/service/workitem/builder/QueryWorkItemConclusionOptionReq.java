package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;

public class QueryWorkItemConclusionOptionReq {
    @Body
    private QueryWorkItemConclusionOptionReqBody body;

    public QueryWorkItemConclusionOptionReq() {
    }

    public QueryWorkItemConclusionOptionReq(Builder builder) {
        this.body = builder.body;
    }

    public QueryWorkItemConclusionOptionReqBody getQueryWorkItemConclusionOptionReqBody() {
        return this.body;
    }

    public void setQueryWorkItemConclusionOptionReqBody(QueryWorkItemConclusionOptionReqBody body) {
        this.body = body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private QueryWorkItemConclusionOptionReqBody body;

        public Builder queryWorkItemConclusionOptionReqBody(QueryWorkItemConclusionOptionReqBody body) {
            this.body = body;
            return this;
        }

        public QueryWorkItemConclusionOptionReq build() {
            return new QueryWorkItemConclusionOptionReq(this);
        }
    }
}
