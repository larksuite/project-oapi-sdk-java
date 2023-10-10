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

package com.lark.project.service.comment;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.comment.builder.*;

public interface CommentService {

    // 添加评论
    public CreateCommentResp createComment(CreateCommentReq req, RequestOptions reqOptions) throws Exception;

    // 删除评论
    public DeleteCommentResp deleteComment(DeleteCommentReq req, RequestOptions reqOptions) throws Exception;

    // 查询评论
    public QueryCommentsResp queryComments(QueryCommentsReq req, RequestOptions reqOptions) throws Exception;

    // 更新评论
    public UpdateCommentResp updateComment(UpdateCommentReq req, RequestOptions reqOptions) throws Exception;

}