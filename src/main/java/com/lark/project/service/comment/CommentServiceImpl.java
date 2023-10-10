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

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.comment.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommentServiceImpl implements CommentService {

    private static final Logger log = LoggerFactory.getLogger(CommentServiceImpl.class);

    private Config config;

    public CommentServiceImpl(Config config) {
        this.config = config;
    }

    // 添加评论
    public CreateCommentResp createComment(CreateCommentReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comment/create"
                , false
                , req);

        CreateCommentResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateCommentResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comment/create"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 删除评论
    public DeleteCommentResp deleteComment(DeleteCommentReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "DELETE"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comment/:comment_id"
                , false
                , req);

        DeleteCommentResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, DeleteCommentResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comment/:comment_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 查询评论
    public QueryCommentsResp queryComments(QueryCommentsReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "GET"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comments"
                , false
                , req);

        QueryCommentsResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, QueryCommentsResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comments"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 更新评论
    public UpdateCommentResp updateComment(UpdateCommentReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "PUT"
                , "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comment/:comment_id"
                , false
                , req);

        UpdateCommentResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, UpdateCommentResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_type_key/:work_item_id/comment/:comment_id"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}