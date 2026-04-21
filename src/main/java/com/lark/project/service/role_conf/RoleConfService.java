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

package com.lark.project.service.role_conf;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.role_conf.builder.CreateRoleConfReq;
import com.lark.project.service.role_conf.builder.CreateRoleConfResp;
import com.lark.project.service.role_conf.builder.DeleteRoleConfReq;
import com.lark.project.service.role_conf.builder.DeleteRoleConfResp;
import com.lark.project.service.role_conf.builder.QueryRoleConfDetailsReq;
import com.lark.project.service.role_conf.builder.QueryRoleConfDetailsResp;
import com.lark.project.service.role_conf.builder.UpdateRoleConfReq;
import com.lark.project.service.role_conf.builder.UpdateRoleConfResp;

public interface RoleConfService {

    // 获取流程角色配置详情
    public QueryRoleConfDetailsResp queryRoleConfDetails(QueryRoleConfDetailsReq req, RequestOptions reqOptions) throws Exception;

    /**
     * 创建流程角色配置。
     *
     * <p>对应 OpenAPI：{@code POST /open_api/:project_key/flow_roles/:work_item_type_key/create_role}</p>
     */
    public CreateRoleConfResp createRoleConf(CreateRoleConfReq req, RequestOptions reqOptions) throws Exception;

    /**
     * 更新流程角色配置。
     *
     * <p>对应 OpenAPI：{@code POST /open_api/:project_key/flow_roles/:work_item_type_key/update_role}</p>
     */
    public UpdateRoleConfResp updateRoleConf(UpdateRoleConfReq req, RequestOptions reqOptions) throws Exception;

    /**
     * 删除流程角色配置。
     *
     * <p>对应 OpenAPI：{@code POST /open_api/:project_key/flow_roles/:work_item_type_key/delete_role}</p>
     */
    public DeleteRoleConfResp deleteRoleConf(DeleteRoleConfReq req, RequestOptions reqOptions) throws Exception;
}