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

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.workitem.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkItemServiceImpl implements WorkItemService {

    private static final Logger log = LoggerFactory.getLogger(WorkItemServiceImpl.class);

    private Config config;

    public WorkItemServiceImpl(Config config) {
        this.config = config;
    }

    // 终止/恢复工作项
    public AbortWorkItemResp abortWorkItem(AbortWorkItemReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PUT"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/abort"
                , false
                , req);

        AbortWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, AbortWorkItemResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/abort"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取指定的工作项列表（全文搜索）
    public CompositiveSearchResp compositiveSearch(CompositiveSearchReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/compositive_search"
                , false
                , req);

        CompositiveSearchResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CompositiveSearchResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/compositive_search"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 创建工作项
    public CreateWorkItemResp createWorkItem(CreateWorkItemReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/create"
                , false
                , req);

        CreateWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateWorkItemResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/create"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 创建工作项关系
    public CreateWorkItemRelationResp createWorkItemRelation(CreateWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/work_item/relation/create"
                , false
                , req);

        CreateWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateWorkItemRelationResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/work_item/relation/create"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 创建实际工时
    public CreateWorkingHourRecordResp createWorkingHourRecord(CreateWorkingHourRecordReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/work_hour_record"
                , false
                , req);

        CreateWorkingHourRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateWorkingHourRecordResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/work_hour_record"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 删除工作项
    public DeleteWorkItemResp deleteWorkItem(DeleteWorkItemReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "DELETE"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"
                , false
                , req);

        DeleteWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteWorkItemResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 删除工作项关系
    public DeleteWorkItemRelationResp deleteWorkItemRelation(DeleteWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "DELETE"
                , "/open_api/work_item/relation/delete"
                , false
                , req);

        DeleteWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteWorkItemRelationResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/work_item/relation/delete"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 删除实际工时
    public DeleteWorkingHourRecordResp deleteWorkingHourRecord(DeleteWorkingHourRecordReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "DELETE"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/work_hour_record"
                , false
                , req);

        DeleteWorkingHourRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteWorkingHourRecordResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/work_hour_record"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取指定的工作项列表（非跨空间）
    public FilterResp filter(FilterReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/filter"
                , false
                , req);

        FilterResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, FilterResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/filter"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取指定的工作项列表（跨空间）
    public FilterAcrossProjectResp filterAcrossProject(FilterAcrossProjectReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/work_items/filter_across_project"
                , false
                , req);

        FilterAcrossProjectResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, FilterAcrossProjectResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/work_items/filter_across_project"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取创建工作项元数据
    public GetMetaResp getMeta(GetMetaReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/:work_item_type_key/meta"
                , false
                , req);

        GetMetaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMetaResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/meta"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取工作项的工时记录列表
    public GetWorkItemManHourRecordsResp getWorkItemManHourRecords(GetWorkItemManHourRecordsReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/work_item/man_hour/records"
                , false
                , req);

        GetWorkItemManHourRecordsResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetWorkItemManHourRecordsResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/work_item/man_hour/records"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取工作项基础信息配置
    public GetWorkItemTypeInfoByKeyResp getWorkItemTypeInfoByKey(GetWorkItemTypeInfoByKeyReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/type/:work_item_type_key"
                , false
                , req);

        GetWorkItemTypeInfoByKeyResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetWorkItemTypeInfoByKeyResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/type/:work_item_type_key"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 节点完成/回滚
    public NodeOperateResp nodeOperate(NodeOperateReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id/operate"
                , false
                , req);

        NodeOperateResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, NodeOperateResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id/operate"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 状态流转
    public NodeStateChangeResp nodeStateChange(NodeStateChangeReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/state_change"
                , false
                , req);

        NodeStateChangeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, NodeStateChangeResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/state_change"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新节点/排期
    public NodeUpdateResp nodeUpdate(NodeUpdateReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PUT"
                , "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id"
                , false
                , req);

        NodeUpdateResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, NodeUpdateResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取工作项详情
    public QueryWorkItemDetailResp queryWorkItemDetail(QueryWorkItemDetailReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/query"
                , false
                , req);

        QueryWorkItemDetailResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryWorkItemDetailResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/query"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取工作项关系列表
    public QueryWorkItemRelationResp queryWorkItemRelation(QueryWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/relation"
                , false
                , req);

        QueryWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryWorkItemRelationResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/relation"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取工作流详情
    public QueryWorkflowResp queryWorkflow(QueryWorkflowReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/workflow/query"
                , false
                , req);

        QueryWorkflowResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryWorkflowResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/workflow/query"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取指定的工作项列表（单空间 | 复杂传参）
    public SearchByParamsResp searchByParams(SearchByParamsReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/search/params"
                , false
                , req);

        SearchByParamsResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchByParamsResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/search/params"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取指定的关联工作项列表（单空间）
    public SearchByRelationResp searchByRelation(SearchByRelationReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/search_by_relation"
                , false
                , req);

        SearchByRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchByRelationResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/search_by_relation"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新多值系统外信号
    public UpdateMultiSignalResp updateMultiSignal(UpdateMultiSignalReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/update/multi_signal"
                , false
                , req);

        UpdateMultiSignalResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateMultiSignalResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/update/multi_signal"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新工作项
    public UpdateWorkItemResp updateWorkItem(UpdateWorkItemReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PUT"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"
                , false
                , req);

        UpdateWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateWorkItemResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新工作项关系
    public UpdateWorkItemRelationResp updateWorkItemRelation(UpdateWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/work_item/relation/update"
                , false
                , req);

        UpdateWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateWorkItemRelationResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/work_item/relation/update"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新工作项基础信息配置
    public UpdateWorkItemTypeInfoResp updateWorkItemTypeInfo(UpdateWorkItemTypeInfoReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PUT"
                , "/open_api/:project_key/work_item/type/:work_item_type_key"
                , false
                , req);

        UpdateWorkItemTypeInfoResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateWorkItemTypeInfoResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/type/:work_item_type_key"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新实际工时
    public UpdateWorkingHourRecordResp updateWorkingHourRecord(UpdateWorkingHourRecordReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PUT"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/work_hour_record"
                , false
                , req);

        UpdateWorkingHourRecordResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateWorkingHourRecordResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/work_hour_record"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取工作流详情（wbs）
    public WbsViewResp wbsView(WbsViewReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/wbs_view"
                , false
                , req);

        WbsViewResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, WbsViewResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/wbs_view"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}