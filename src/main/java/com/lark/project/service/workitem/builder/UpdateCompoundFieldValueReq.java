package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.workitem.model.Expand;

import java.util.List;

/**
 * 按组更新复合字段值的请求对象。
 *
 * <p>对应 OpenAPI：{@code POST /open_api/work_item/field_value/update_compound_field}，
 * 用于对指定工作项的复合字段按组执行删除（delete）、更新（update）或添加（add）操作。</p>
 */
public class UpdateCompoundFieldValueReq {
    @Body
    private UpdateCompoundFieldValueReqBody body;

    public UpdateCompoundFieldValueReq() {
    }

    public UpdateCompoundFieldValueReq(UpdateCompoundFieldValueReq.Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UpdateCompoundFieldValueReqBody getBody() {
        return body;
    }

    public void setBody(UpdateCompoundFieldValueReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private UpdateCompoundFieldValueReqBody body;

        public Builder() {
            body = new UpdateCompoundFieldValueReqBody();
        }

        public UpdateCompoundFieldValueReq.Builder workItemID(Long workItemID) {
            this.body.setWorkItemID(workItemID);
            return this;
        }

        public UpdateCompoundFieldValueReq.Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public UpdateCompoundFieldValueReq.Builder fieldKey(String fieldKey) {
            this.body.setFieldKey(fieldKey);
            return this;
        }

        public UpdateCompoundFieldValueReq.Builder fieldAlias(String fieldAlias) {
            this.body.setFieldAlias(fieldAlias);
            return this;
        }

        public UpdateCompoundFieldValueReq.Builder groupUUID(String groupUUID) {
            this.body.setGroupUUID(groupUUID);
            return this;
        }

        public UpdateCompoundFieldValueReq.Builder action(String action) {
            this.body.setAction(action);
            return this;
        }

        public UpdateCompoundFieldValueReq.Builder fields(List<List<FieldValuePair>> fields) {
            this.body.setFields(fields);
            return this;
        }

        public UpdateCompoundFieldValueReq build() {
            return new UpdateCompoundFieldValueReq(this);
        }
    }
}
