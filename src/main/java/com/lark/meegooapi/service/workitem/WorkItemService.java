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

package com.lark.meegooapi.service.workitem;

import com.lark.meegooapi.core.Config;
import com.lark.meegooapi.core.Transport;
import com.lark.meegooapi.core.request.RequestOptions;
import com.lark.meegooapi.core.response.RawResponse;
import com.lark.meegooapi.core.utils.Jsons;
import com.lark.meegooapi.core.utils.UnmarshalRespUtil;
import com.lark.meegooapi.service.workitem.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class WorkItemService {

    private static final Logger log = LoggerFactory.getLogger(WorkItemService.class);

    private Config config;

    public WorkItemService(Config config) {
        this.config = config;
    }

    /*
     *
     */
    public AbortWorkItemResp abortWorkItem(AbortWorkItemReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/abort"
                , false
                , req);

        // 反序列化
        AbortWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, AbortWorkItemResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/abort"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public CompositiveSearchResp compositiveSearch(CompositiveSearchReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/compositive_search"
                , false
                , req);

        // 反序列化
        CompositiveSearchResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CompositiveSearchResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/compositive_search"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public CreateWorkItemResp createWorkItem(CreateWorkItemReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/create"
                , false
                , req);

        // 反序列化
        CreateWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateWorkItemResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/create"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public CreateWorkItemRelationResp createWorkItemRelation(CreateWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/work_item/relation/create"
                , false
                , req);

        // 反序列化
        CreateWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateWorkItemRelationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/work_item/relation/create"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public DeleteWorkItemResp deleteWorkItem(DeleteWorkItemReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"
                , false
                , req);

        // 反序列化
        DeleteWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteWorkItemResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public DeleteWorkItemRelationResp deleteWorkItemRelation(DeleteWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "DELETE"
                , "/open_api/work_item/relation/delete"
                , false
                , req);

        // 反序列化
        DeleteWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteWorkItemRelationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/work_item/relation/delete"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public FilterResp filter(FilterReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/filter"
                , false
                , req);

        // 反序列化
        FilterResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, FilterResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/filter"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public FilterAcrossProjectResp filterAcrossProject(FilterAcrossProjectReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/work_items/filter_across_project"
                , false
                , req);

        // 反序列化
        FilterAcrossProjectResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, FilterAcrossProjectResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/work_items/filter_across_project"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public GetMetaResp getMeta(GetMetaReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/:work_item_type_key/meta"
                , false
                , req);

        // 反序列化
        GetMetaResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetMetaResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/meta"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public NodeOperateResp nodeOperate(NodeOperateReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id/operate"
                , false
                , req);

        // 反序列化
        NodeOperateResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, NodeOperateResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id/operate"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public NodeStateChangeResp nodeStateChange(NodeStateChangeReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/state_change"
                , false
                , req);

        // 反序列化
        NodeStateChangeResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, NodeStateChangeResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/state_change"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public NodeUpdateResp nodeUpdate(NodeUpdateReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
                , "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id"
                , false
                , req);

        // 反序列化
        NodeUpdateResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, NodeUpdateResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/workflow/:work_item_type_key/:work_item_id/node/:node_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public QueryWorkItemDetailResp queryWorkItemDetail(QueryWorkItemDetailReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/query"
                , false
                , req);

        // 反序列化
        QueryWorkItemDetailResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryWorkItemDetailResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/query"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public QueryWorkItemRelationResp queryWorkItemRelation(QueryWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/relation"
                , false
                , req);

        // 反序列化
        QueryWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryWorkItemRelationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/relation"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public QueryWorkflowResp queryWorkflow(QueryWorkflowReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/workflow/query"
                , false
                , req);

        // 反序列化
        QueryWorkflowResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryWorkflowResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/workflow/query"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public SearchByParamsResp searchByParams(SearchByParamsReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/search/params"
                , false
                , req);

        // 反序列化
        SearchByParamsResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchByParamsResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/search/params"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public SearchByRelationResp searchByRelation(SearchByRelationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/search_by_relation"
                , false
                , req);

        // 反序列化
        SearchByRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchByRelationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/search_by_relation"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public UpdateMultiSignalResp updateMultiSignal(UpdateMultiSignalReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/update/multi_signal"
                , false
                , req);

        // 反序列化
        UpdateMultiSignalResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateMultiSignalResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/update/multi_signal"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public UpdateWorkItemResp updateWorkItem(UpdateWorkItemReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "PUT"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"
                , false
                , req);

        // 反序列化
        UpdateWorkItemResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateWorkItemResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public UpdateWorkItemRelationResp updateWorkItemRelation(UpdateWorkItemRelationReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/work_item/relation/update"
                , false
                , req);

        // 反序列化
        UpdateWorkItemRelationResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateWorkItemRelationResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/work_item/relation/update"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /*
     *
     */
    public WbsViewResp wbsView(WbsViewReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/wbs_view"
                , false
                , req);

        // 反序列化
        WbsViewResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, WbsViewResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/wbs_view"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}