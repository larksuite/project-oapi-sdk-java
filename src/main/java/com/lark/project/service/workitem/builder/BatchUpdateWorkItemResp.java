package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.BatchUpdateWorkItemResult;
import com.lark.project.service.workitem.model.WorkItemInfo;

import java.util.List;

/**
 * 批量更新工作项的响应对象。
 *
 * <p>对应 OpenAPI：{@code POST /open_api/:project_key/work_item/:work_item_type_key/batch_update}</p>
 */
public class BatchUpdateWorkItemResp extends BaseResponse {
    @SerializedName("data")
    private BatchUpdateWorkItemResult data;
    public BatchUpdateWorkItemResult getData() {
        return this.data;
    }

    public void setData(BatchUpdateWorkItemResult data) {
        this.data = data;
    }
}
