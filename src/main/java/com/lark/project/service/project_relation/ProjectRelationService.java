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

package com.lark.project.service.project_relation;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.project_relation.builder.*;

public interface ProjectRelationService {

    // 通过空间关联绑定关联工作项
    public CreateProjectRelationInstancesResp createProjectRelationInstances(CreateProjectRelationInstancesReq req, RequestOptions reqOptions) throws Exception;

    // 通过空间关联解绑关联工作项
    public DeleteProjectRelationInstanceResp deleteProjectRelationInstance(DeleteProjectRelationInstanceReq req, RequestOptions reqOptions) throws Exception;

    // 获取空间关联规则列表
    public QueryProjectRelationResp queryProjectRelation(QueryProjectRelationReq req, RequestOptions reqOptions) throws Exception;

    // 获取空间关联下的关联工作项列表
    public QueryProjectRelationInstanceResp queryProjectRelationInstance(QueryProjectRelationInstanceReq req, RequestOptions reqOptions) throws Exception;

}