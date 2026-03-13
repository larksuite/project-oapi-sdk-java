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

package com.lark.project.sample;

import com.lark.project.Client;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.utils.Lists;
import com.lark.project.service.workitem.builder.UpdateWorkItemTypeInfoReq;
import com.lark.project.service.workitem.builder.UpdateWorkItemTypeInfoResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdateWorkItemTypeInfoSample {

    public static void main(String[] args) {
        // 构建client
        Client client = Client.newBuilder("MII_6746C7E9CD010004", "6C96F2B71C3C4FA6C0AB21D522F6CA00")
                .openBaseUrl("https://meego.larkoffice.com/").build();

        // 创建请求对象
        UpdateWorkItemTypeInfoReq req = UpdateWorkItemTypeInfoReq.newBuilder()
                .projectKey("665ec5afe79781c894e82e5d")
                .workItemTypeKey("story")
                .description("管理需求的全生命周期")
                .isDisabled(false)
                .isPinned(true)
                .enableSchedule(true)
                .scheduleFieldKey("field_66d5xx")
                .estimatePointFieldKey("field_66d5xx")
                .actualWorkTimeFieldKey("field_66d5xx")
                .actualWorkTimeSwitch(true)
                .belongRoleKeys(Lists.newArrayList("PM"))
                .build();

        // 创建自定义 Headers (可选)
        Map<String, List<String>> headers = new HashMap<>();

        // 发起请求
        UpdateWorkItemTypeInfoResp resp = null;
        try {
            resp = client.getWorkItemService().updateWorkItemTypeInfo(req, RequestOptions.newBuilder()
                    .userKey("7374823452487794692") // 传递用户标识 (X-USER-KEY)
                    .headers(headers) // 传递自定义 Headers
                    .build());
        } catch (Exception e) {
            // 处理异常
            e.printStackTrace();
            return;
        }

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getErrCode(), resp.getErrMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println("Request ID: " + resp.getRequestId());
        System.out.println("Update successful.");
    }
}
