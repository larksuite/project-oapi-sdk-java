package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import java.util.List;

public class ListWorkItemOpRecordReq {
    @Body
    private ListWorkItemOpRecordReqBody body;

    public ListWorkItemOpRecordReq() {
    }

    public ListWorkItemOpRecordReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public ListWorkItemOpRecordReqBody getListWorkItemOpRecordReqBody() {
        return this.body;
    }

    public void setListWorkItemOpRecordReqBody(ListWorkItemOpRecordReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private ListWorkItemOpRecordReqBody body;

        public Builder() {
            body = new ListWorkItemOpRecordReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemIds(List<Long> workItemIds) {
            this.body.setWorkItemIds(workItemIds);
            return this;
        }

        public Builder startFrom(String startFrom) {
            this.body.setStartFrom(startFrom);
            return this;
        }

        public Builder operator(List<String> operator) {
            this.body.setOperator(operator);
            return this;
        }

        public Builder operatorType(List<String> operatorType) {
            this.body.setOperatorType(operatorType);
            return this;
        }

        public Builder sourceType(List<String> sourceType) {
            this.body.setSourceType(sourceType);
            return this;
        }

        public Builder source(List<String> source) {
            this.body.setSource(source);
            return this;
        }

        public Builder operationType(List<String> operationType) {
            this.body.setOperationType(operationType);
            return this;
        }

        public Builder start(Long start) {
            this.body.setStart(start);
            return this;
        }

        public Builder end(Long end) {
            this.body.setEnd(end);
            return this;
        }

        public Builder opRecordModule(List<String> opRecordModule) {
            this.body.setOpRecordModule(opRecordModule);
            return this;
        }

        public Builder pageSize(Long pageSize) {
            this.body.setPageSize(pageSize);
            return this;
        }

        public ListWorkItemOpRecordReq build() {
            return new ListWorkItemOpRecordReq(this);
        }
    }
}
