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
import com.lark.project.core.utils.Jsons;
import com.lark.project.core.utils.Lists;
import com.lark.project.service.project.builder.ListProjectWorkItemTypeReq;
import com.lark.project.service.project.builder.ListProjectWorkItemTypeResp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

    public static void main(String[] args) throws Exception {
        // 构建client
        Client client = Client.newBuilder("pluginID", "pluginSecret")
                .openBaseUrl("https://project.feishu.cn/").build();
        // 创建请求对象
        ListProjectWorkItemTypeReq req = ListProjectWorkItemTypeReq.newBuilder()
                .projectKey("project_key")
                .build();

        // 创建自定义 Headers
        Map<String, List<String>> headers = new HashMap<>();
        headers.put("key1", Lists.newArrayList("value1"));
        headers.put("key2", Lists.newArrayList("value2"));

        // 发起请求
        ListProjectWorkItemTypeResp resp = client.getProjectService().listProjectWorkItemType(req, RequestOptions.newBuilder()
                .accessToken("user_token") // 传递用户token
                .headers(headers) // 传递自定义 Headers
                .build());

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getErrCode(), resp.getErrMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
