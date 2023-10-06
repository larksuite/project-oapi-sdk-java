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

package com.lark.project.service.task;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.task.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskService {

    private static final Logger log = LoggerFactory.getLogger(TaskService.class);

    private Config config;

    public TaskService(Config config) {
        this.config = config;
    }

    // 创建子任务
    public CreateSubTaskResp createSubTask(CreateSubTaskReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/workflow/task"
                , false
                , req);

        CreateSubTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateSubTaskResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 删除子任务
    public DeleteSubTaskResp deleteSubTask(DeleteSubTaskReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "DELETE"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/task/:task_id"
                , false
                , req);

        DeleteSubTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteSubTaskResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 子任务完成/回滚
    public ModifySubtaskResp modifySubtask(ModifySubtaskReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/subtask/modify"
                , false
                , req);

        ModifySubtaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, ModifySubtaskResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取指定的子任务列表（跨空间）
    public SearchSubtaskResp searchSubtask(SearchSubtaskReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/work_item/subtask/search"
                , false
                , req);

        SearchSubtaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchSubtaskResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取子任务详情
    public TaskDetailResp taskDetail(TaskDetailReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/workflow/task"
                , false
                , req);

        TaskDetailResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, TaskDetailResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新子任务
    public UpdateSubTaskResp updateSubTask(UpdateSubTaskReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/workflow/:node_id/task/:task_id"
                , false
                , req);

        UpdateSubTaskResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateSubTaskResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}