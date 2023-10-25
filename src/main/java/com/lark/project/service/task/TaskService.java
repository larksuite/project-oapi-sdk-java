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

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.task.builder.*;

public interface TaskService {

    // 创建子任务
    public CreateSubTaskResp createSubTask(CreateSubTaskReq req, RequestOptions reqOptions) throws Exception;

    // 删除子任务
    public DeleteSubTaskResp deleteSubTask(DeleteSubTaskReq req, RequestOptions reqOptions) throws Exception;

    // 子任务完成/回滚
    public ModifySubtaskResp modifySubtask(ModifySubtaskReq req, RequestOptions reqOptions) throws Exception;

    // 获取指定的子任务列表（跨空间）
    public SearchSubtaskResp searchSubtask(SearchSubtaskReq req, RequestOptions reqOptions) throws Exception;

    // 获取子任务详情
    public TaskDetailResp taskDetail(TaskDetailReq req, RequestOptions reqOptions) throws Exception;

    // 更新子任务
    public UpdateSubTaskResp updateSubTask(UpdateSubTaskReq req, RequestOptions reqOptions) throws Exception;

}