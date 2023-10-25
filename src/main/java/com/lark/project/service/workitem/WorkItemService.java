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

package com.lark.project.service.workitem;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.workitem.builder.*;

public interface WorkItemService {

    // 终止/恢复工作项
    public AbortWorkItemResp abortWorkItem(AbortWorkItemReq req, RequestOptions reqOptions) throws Exception;

    // 获取指定的工作项列表（全文搜索）
    public CompositiveSearchResp compositiveSearch(CompositiveSearchReq req, RequestOptions reqOptions) throws Exception;

    // 创建工作项
    public CreateWorkItemResp createWorkItem(CreateWorkItemReq req, RequestOptions reqOptions) throws Exception;

    // 创建工作项关系
    public CreateWorkItemRelationResp createWorkItemRelation(CreateWorkItemRelationReq req, RequestOptions reqOptions) throws Exception;

    // 创建实际工时
    public CreateWorkingHourRecordResp createWorkingHourRecord(CreateWorkingHourRecordReq req, RequestOptions reqOptions) throws Exception;

    // 删除工作项
    public DeleteWorkItemResp deleteWorkItem(DeleteWorkItemReq req, RequestOptions reqOptions) throws Exception;

    // 删除工作项关系
    public DeleteWorkItemRelationResp deleteWorkItemRelation(DeleteWorkItemRelationReq req, RequestOptions reqOptions) throws Exception;

    // 删除实际工时
    public DeleteWorkingHourRecordResp deleteWorkingHourRecord(DeleteWorkingHourRecordReq req, RequestOptions reqOptions) throws Exception;

    // 获取指定的工作项列表（非跨空间）
    public FilterResp filter(FilterReq req, RequestOptions reqOptions) throws Exception;

    // 获取指定的工作项列表（跨空间）
    public FilterAcrossProjectResp filterAcrossProject(FilterAcrossProjectReq req, RequestOptions reqOptions) throws Exception;

    // 获取创建工作项元数据
    public GetMetaResp getMeta(GetMetaReq req, RequestOptions reqOptions) throws Exception;

    // 获取工作项的工时记录列表
    public GetWorkItemManHourRecordsResp getWorkItemManHourRecords(GetWorkItemManHourRecordsReq req, RequestOptions reqOptions) throws Exception;

    // 获取工作项基础信息配置
    public GetWorkItemTypeInfoByKeyResp getWorkItemTypeInfoByKey(GetWorkItemTypeInfoByKeyReq req, RequestOptions reqOptions) throws Exception;

    // 节点完成/回滚
    public NodeOperateResp nodeOperate(NodeOperateReq req, RequestOptions reqOptions) throws Exception;

    // 状态流转
    public NodeStateChangeResp nodeStateChange(NodeStateChangeReq req, RequestOptions reqOptions) throws Exception;

    // 更新节点/排期
    public NodeUpdateResp nodeUpdate(NodeUpdateReq req, RequestOptions reqOptions) throws Exception;

    // 获取工作项详情
    public QueryWorkItemDetailResp queryWorkItemDetail(QueryWorkItemDetailReq req, RequestOptions reqOptions) throws Exception;

    // 获取工作项关系列表
    public QueryWorkItemRelationResp queryWorkItemRelation(QueryWorkItemRelationReq req, RequestOptions reqOptions) throws Exception;

    // 获取工作流详情
    public QueryWorkflowResp queryWorkflow(QueryWorkflowReq req, RequestOptions reqOptions) throws Exception;

    // 获取指定的工作项列表（单空间 | 复杂传参）
    public SearchByParamsResp searchByParams(SearchByParamsReq req, RequestOptions reqOptions) throws Exception;

    // 获取指定的关联工作项列表（单空间）
    public SearchByRelationResp searchByRelation(SearchByRelationReq req, RequestOptions reqOptions) throws Exception;

    // 更新多值系统外信号
    public UpdateMultiSignalResp updateMultiSignal(UpdateMultiSignalReq req, RequestOptions reqOptions) throws Exception;

    // 更新工作项
    public UpdateWorkItemResp updateWorkItem(UpdateWorkItemReq req, RequestOptions reqOptions) throws Exception;

    // 更新工作项关系
    public UpdateWorkItemRelationResp updateWorkItemRelation(UpdateWorkItemRelationReq req, RequestOptions reqOptions) throws Exception;

    // 更新工作项基础信息配置
    public UpdateWorkItemTypeInfoResp updateWorkItemTypeInfo(UpdateWorkItemTypeInfoReq req, RequestOptions reqOptions) throws Exception;

    // 更新实际工时
    public UpdateWorkingHourRecordResp updateWorkingHourRecord(UpdateWorkingHourRecordReq req, RequestOptions reqOptions) throws Exception;

    // 获取工作流详情（wbs）
    public WbsViewResp wbsView(WbsViewReq req, RequestOptions reqOptions) throws Exception;

}