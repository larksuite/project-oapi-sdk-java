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
import com.lark.project.core.Constants;
import com.lark.project.core.cache.ICache;
import com.lark.project.core.cache.LocalCache;
import com.lark.project.core.httpclient.HttpTransport;
import com.lark.project.core.httpclient.IHttpTransport;
import com.lark.project.core.token.AccessTokenType;
import com.lark.project.core.token.GlobalTokenManager;
import com.lark.project.core.token.TokenManager;
import com.lark.project.service.attachment.AttachmentService;
import com.lark.project.service.attachment.AttachmentServiceImpl;
import com.lark.project.service.chat.ChatService;
import com.lark.project.service.chat.ChatServiceImpl;
import com.lark.project.service.comment.CommentService;
import com.lark.project.service.comment.CommentServiceImpl;
import com.lark.project.service.field.FieldService;
import com.lark.project.service.field.FieldServiceImpl;
import com.lark.project.service.measure.MeasureService;
import com.lark.project.service.measure.MeasureServiceImpl;
import com.lark.project.service.plugin.PluginService;
import com.lark.project.service.plugin.PluginServiceImpl;
import com.lark.project.service.project.ProjectService;
import com.lark.project.service.project.ProjectServiceImpl;
import com.lark.project.service.project_relation.ProjectRelationService;
import com.lark.project.service.project_relation.ProjectRelationServiceImpl;
import com.lark.project.service.role_conf.RoleConfService;
import com.lark.project.service.role_conf.RoleConfServiceImpl;
import com.lark.project.service.task.TaskService;
import com.lark.project.service.task.TaskServiceImpl;
import com.lark.project.service.user.UserService;
import com.lark.project.service.user.UserServiceImpl;
import com.lark.project.service.view.ViewService;
import com.lark.project.service.view.ViewServiceImpl;
import com.lark.project.service.workitem.WorkItemService;
import com.lark.project.service.workitem.WorkItemServiceImpl;
import com.lark.project.service.workitem_conf.WorkItemConfService;
import com.lark.project.service.workitem_conf.WorkItemConfServiceImpl;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;


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

    private ProjectRelationService projectRelation; // 空间关联

    private MeasureService measure; // 度量

    private RoleConfService roleConf; // 角色

    private AttachmentService attachment; //附件

    public static Builder newBuilder(String pluginId, String pluginSecret) {
        return new Builder(pluginId, pluginSecret);
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public PluginService getPluginService() {
        return plugin;
    }

    public ProjectService getProjectService() {
        return project;
    }

    public UserService getUserService() {
        return user;
    }

    public WorkItemService getWorkItemService() {
        return workItem;
    }

    public TaskService getTaskService() {
        return task;
    }

    public ViewService getViewService() {
        return view;
    }

    public FieldService getFieldService() {
        return field;
    }

    public ChatService getChatService() {
        return chat;
    }

    public CommentService getCommentService() {
        return comment;
    }

    public WorkItemConfService getWorkItemConfService() {
        return workItemConf;
    }

    public ProjectRelationService getProjectRelationService() {
        return projectRelation;
    }

    public MeasureService getMeasureService() {
        return measure;
    }

    public RoleConfService getRoleConfService() {
        return roleConf;
    }

    public AttachmentService getAttachmentService() {
        return attachment;
    }

    public static final class Builder {
        private Config config = new Config();

        public Builder(String pluginID, String pluginSecret) {
            config.setPluginID(pluginID);
            config.setPluginSecret(pluginSecret);
            config.setDisableTokenCache(false);
            config.setAccessTokenType(AccessTokenType.AccessTokenTypePlugin);
            config.setBaseUrl(Constants.BASE_URL);
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

        public Builder requestTimeout(long timeout) {
            config.setRequestTimeOut(timeout);
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
                    HttpClientBuilder builder = HttpClientBuilder.create();
                    RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout((int) config.getRequestTimeOut()).build();
                    builder.setDefaultRequestConfig(requestConfig);
                    config.setHttpTransport(new HttpTransport(builder.build()));
                } else {
                    config.setHttpTransport(new HttpTransport(HttpClients.createDefault()));
                }
            }
        }

        public Client build() {
            Client client = new Client();
            client.setConfig(config);
            initCache(config);
            initHttpTransport(config);
            client.plugin = new PluginServiceImpl(config);
            client.project = new ProjectServiceImpl(config);
            client.user = new UserServiceImpl(config);
            client.workItem = new WorkItemServiceImpl(config);
            client.task = new TaskServiceImpl(config);
            client.view = new ViewServiceImpl(config);
            client.field = new FieldServiceImpl(config);
            client.comment = new CommentServiceImpl(config);
            client.workItemConf = new WorkItemConfServiceImpl(config);
            client.chat = new ChatServiceImpl(config);
            client.projectRelation = new ProjectRelationServiceImpl(config);
            client.measure = new MeasureServiceImpl(config);
            client.roleConf = new RoleConfServiceImpl(config);
            client.attachment = new AttachmentServiceImpl(config);
            return client;
        }
    }
    
}

