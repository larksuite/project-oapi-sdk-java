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

package com.lark.project.service.chat;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.chat.builder.BotJoinChatReq;
import com.lark.project.service.chat.builder.BotJoinChatResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatServiceImpl implements ChatService {

    private static final Logger log = LoggerFactory.getLogger(ChatServiceImpl.class);

    private Config config;

    public ChatServiceImpl(Config config) {
        this.config = config;
    }

    // 拉机器人入群
    public BotJoinChatResp botJoinChat(BotJoinChatReq req, RequestOptions reqOptions) throws Exception {
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/:project_key/work_item/:work_item_id/bot_join_chat"
                , false
                , req);

        BotJoinChatResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, BotJoinChatResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/:project_key/work_item/:work_item_id/bot_join_chat"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

}