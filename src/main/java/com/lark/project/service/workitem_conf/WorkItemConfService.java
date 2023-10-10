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

package com.lark.project.service.workitem_conf;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.workitem_conf.builder.*;

public interface WorkItemConfService {

    // 新增流程类型配置
    public CreateTemplateDetailResp createTemplateDetail(CreateTemplateDetailReq req, RequestOptions reqOptions) throws Exception;

    // 删除流程类型配置
    public DeleteTemplateDetailResp deleteTemplateDetail(DeleteTemplateDetailReq req, RequestOptions reqOptions) throws Exception;

    // 获取流程类型配置详情
    public QueryTemplateDetailResp queryTemplateDetail(QueryTemplateDetailReq req, RequestOptions reqOptions) throws Exception;

    // 获取流程类型配置（wbs）
    public QueryWbsTemplateConfResp queryWbsTemplateConf(QueryWbsTemplateConfReq req, RequestOptions reqOptions) throws Exception;

    // 获取工作项下的流程类型
    public QueryWorkItemTemplatesResp queryWorkItemTemplates(QueryWorkItemTemplatesReq req, RequestOptions reqOptions) throws Exception;

    // 更新流程类型配置
    public UpdateTemplateDetailResp updateTemplateDetail(UpdateTemplateDetailReq req, RequestOptions reqOptions) throws Exception;

}