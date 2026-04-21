package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.workitem.model.Expand;

import java.util.List;

public class QueryWorkItemResourceReq {
    @Body
    private QueryWorkItemResourceReqBody body;

    public QueryWorkItemResourceReq() {
    }

    public QueryWorkItemResourceReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public QueryWorkItemResourceReqBody getQueryWorkItemResourceReqBody() {
        return this.body;
    }

    public void setQueryWorkItemResourceReqBody(QueryWorkItemResourceReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private QueryWorkItemResourceReqBody body;

        public Builder() {
            body = new QueryWorkItemResourceReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder workItemIDs(List<Long> workItemIDs) {
            this.body.setWorkItemIDs(workItemIDs);
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public Builder fields(List<String> fields) {
            this.body.setFields(fields);
            return this;
        }

        public Builder expand(Expand expand) {
            this.body.setExpand(expand);
            return this;
        }

        public QueryWorkItemResourceReq build() {
            return new QueryWorkItemResourceReq(this);
        }
    }
}