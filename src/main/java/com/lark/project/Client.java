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

package com.lark.project;

import com.lark.project.core.Config;
import com.lark.project.core.cache.ICache;
import com.lark.project.core.cache.LocalCache;
import com.lark.project.core.httpclient.IHttpTransport;
import com.lark.project.core.httpclient.OkHttpTransport;
import com.lark.project.core.token.AccessTokenType;
import com.lark.project.core.token.GlobalTokenManager;
import com.lark.project.core.token.TokenManager;
import com.lark.project.core.utils.OKHttps;
import com.lark.project.service.chat.ChatService;
import com.lark.project.service.comment.CommentService;
import com.lark.project.service.field.FieldService;
import com.lark.project.service.plugin.PluginService;
import com.lark.project.service.project.ProjectService;
import com.lark.project.service.task.TaskService;
import com.lark.project.service.user.UserService;
import com.lark.project.service.view.ViewService;
import com.lark.project.service.workitem.WorkItemService;
import com.lark.project.service.workitem_conf.WorkItemConfService;

import java.util.concurrent.TimeUnit;


public class Client {

    private Config config;

    private PluginService plugin; // token

    private ProjectService project; // 空间

    private UserService user; // 用户

    private WorkItemService workItem; // 工作项

    private TaskService task; // 子任务

    private ViewService view; // 视图

    private FieldService field; // 字段

    private ChatService chat; // 群组

    private CommentService comment; // 评论

    private WorkItemConfService workItemConf; // 工作项配置

    public static Builder newBuilder(String pluginId, String pluginSecret) {
        return new Builder(pluginId, pluginSecret);
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public PluginService plugin() {
        return plugin;
    }

    public ProjectService project() {
        return project;
    }

    public UserService user() {
        return user;
    }

    public WorkItemService workItem() {
        return workItem;
    }

    public TaskService task() {
        return task;
    }

    public ViewService view() {
        return view;
    }

    public FieldService field() {
        return field;
    }

    public ChatService chat() {
        return chat;
    }

    public CommentService comment() {
        return comment;
    }

    public WorkItemConfService workItemConf() {
        return workItemConf;
    }

    public static final class Builder {
        private Config config = new Config();

        public Builder(String pluginID, String pluginSecret) {
            config.setPluginID(pluginID);
            config.setPluginSecret(pluginSecret);
            config.setDisableTokenCache(false);
            config.setAccessTokenType(AccessTokenType.AccessTokenTypePlugin);
        }

        public Builder disableTokenCache() {
            config.setDisableTokenCache(true);
            return this;
        }

        public Builder logReqAtDebug(boolean logReqAtDebug) {
            config.setLogReqAtDebug(logReqAtDebug);
            return this;
        }

        public Builder accessTokenType(AccessTokenType accessTokenType) {
            config.setAccessTokenType(accessTokenType);
            return this;
        }

        public Builder openBaseUrl(String baseUrl) {
            config.setBaseUrl(baseUrl);
            return this;
        }

        public Builder tokenCache(ICache cache) {
            config.setCache(cache);
            return this;
        }

        public Builder requestTimeout(long timeout, TimeUnit timeUnit) {
            config.setRequestTimeOut(timeout);
            config.setTimeOutTimeUnit(timeUnit);
            return this;
        }

        public Builder httpTransport(IHttpTransport httpTransport) {
            config.setHttpTransport(httpTransport);
            return this;
        }

        private void initCache(Config config) {
            if (config.getCache() != null) {
                GlobalTokenManager.setTokenManager(new TokenManager(config.getCache()));
            } else {
                ICache cache = LocalCache.getInstance();
                GlobalTokenManager.setTokenManager(new TokenManager(cache));
            }
        }

        private void initHttpTransport(Config config) {
            if (config.getHttpTransport() == null) {
                if (config.getRequestTimeOut() > 0) {
                    config.setHttpTransport(new OkHttpTransport(OKHttps.create(config.getRequestTimeOut(), config.getTimeOutTimeUnit())));
                } else {
                    config.setHttpTransport(new OkHttpTransport(OKHttps.defaultClient));
                }
            }
        }

        public Client build() {
            Client client = new Client();
            client.setConfig(config);
            initCache(config);
            initHttpTransport(config);
            client.plugin = new PluginService(config);
            client.project = new ProjectService(config);
            client.user = new UserService(config);
            client.workItem = new WorkItemService(config);
            client.task = new TaskService(config);
            client.view = new ViewService(config);
            client.field = new FieldService(config);
            client.comment = new CommentService(config);
            client.workItemConf = new WorkItemConfService(config);
            client.chat = new ChatService(config);
            return client;
        }
    }
}

