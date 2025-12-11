/*
 * Copyright (c) 2023 Lark Technologies Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;
import com.lark.project.core.annotation.Query;
import com.lark.project.service.workitem.model.Expand;

/**
 * 获取工作流详情（WBS）的请求对象。
 *
 * <p>对应 OpenAPI：{@code GET /open_api/:project_key/work_item/:work_item_type_key/:work_item_id/wbs_view}。</p>
 */
public class WbsViewReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Query
    @SerializedName("need_union_deliverable")
    private Boolean needUnionDeliverable;
    @Query
    @SerializedName("need_schedule_table_agg")
    private Boolean needScheduleTableAgg;
    @Body
    private WbsViewReqBody body;


    public WbsViewReq() {
    }

    public WbsViewReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.needUnionDeliverable = builder.needUnionDeliverable;
        this.needScheduleTableAgg = builder.needScheduleTableAgg;
        this.body = builder.body;

    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public Boolean getNeedUnionDeliverable() {
        return needUnionDeliverable;
    }

    public void setNeedUnionDeliverable(Boolean needUnionDeliverable) {
        this.needUnionDeliverable = needUnionDeliverable;
    }

    public Boolean getNeedScheduleTableAgg() {
        return needScheduleTableAgg;
    }

    public void setNeedScheduleTableAgg(Boolean needScheduleTableAgg) {
        this.needScheduleTableAgg = needScheduleTableAgg;
    }

    public WbsViewReqBody getWbsViewReqBody() {
        return this.body;
    }

    public void setWbsViewReqBody(WbsViewReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private Long workItemID;
        private String workItemTypeKey;
        private Boolean needUnionDeliverable;
        private Boolean needScheduleTableAgg;
        private WbsViewReqBody body;

        public Builder() {
            body = new WbsViewReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        /**
         * 是否融合需要交付物。
         *
         * <p>对应查询参数 {@code need_union_deliverable}，含义与请求体
         * {@link Expand#getNeedUnionDeliverable()} 一致。</p>
         */
        public Builder needUnionDeliverable(Boolean needUnionDeliverable) {
            this.needUnionDeliverable = needUnionDeliverable;
            return this;
        }

        /**
         * 扩展查询：是否需要计划表自定义列聚合字段。
         *
         * <p>对应查询参数 {@code need_schedule_table_agg}。</p>
         */
        public Builder needScheduleTableAgg(Boolean needScheduleTableAgg) {
            this.needScheduleTableAgg = needScheduleTableAgg;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }
        public Builder expand(Expand expand) {
            this.body.setExpand(expand);
            return this;
        }

        public WbsViewReq build() {
            return new WbsViewReq(this);
        }

    }
}