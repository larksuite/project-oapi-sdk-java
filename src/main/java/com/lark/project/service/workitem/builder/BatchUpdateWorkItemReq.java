package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.field.model.FieldValuePair;

import java.util.List;

/**
 * 批量更新工作项的请求对象。
 *
 * <p>对应 OpenAPI：{@code POST /open_api/work_item/batch_update}</p>
 */
public class BatchUpdateWorkItemReq {
    @Body
    private BatchUpdateWorkItemReqBody body;

    public BatchUpdateWorkItemReq() {
    }

    public BatchUpdateWorkItemReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public BatchUpdateWorkItemReqBody getBatchUpdateWorkItemReqBody() {
        return this.body;
    }

    public void setBatchUpdateWorkItemReqBody(BatchUpdateWorkItemReqBody body) {
        this.body = body;
    }
    public static class Builder {
        private BatchUpdateWorkItemReqBody body;

        public Builder() {
            body = new BatchUpdateWorkItemReqBody();
        }

        public BatchUpdateWorkItemReq build() {
            return new BatchUpdateWorkItemReq(this);
        }

        public BatchUpdateWorkItemReq.Builder projectKey(String projectKey) {
            body.setProjectKey(projectKey);
            return this;
        }

        public BatchUpdateWorkItemReq.Builder workItemIds(List<Long> workItemIds) {
            body.setWorkItemIds(workItemIds);
            return this;
        }

        public BatchUpdateWorkItemReq.Builder workItemTypeKey(String workItemTypeKey) {
            body.setWorkItemTypeKey(workItemTypeKey);
            return this;
        }

        public BatchUpdateWorkItemReq.Builder updateMode(String updateMode) {
            body.setUpdateMode(updateMode);
            return this;
        }

        public BatchUpdateWorkItemReq.Builder fieldKey(String fieldKey) {
            body.setFieldKey(fieldKey);
            return this;
        }

        public BatchUpdateWorkItemReq.Builder beforeFieldValue(Object beforeFieldValue) {
            body.setBeforeFieldValue(beforeFieldValue);
            return this;
        }


        public BatchUpdateWorkItemReq.Builder afterFieldValue(Object afterFieldValue) {
            body.setAfterFieldValue(afterFieldValue);
            return this;
        }

    }
}
