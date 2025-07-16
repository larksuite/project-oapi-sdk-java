package com.bestzyx.larksuite.project.autoconfigure;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lark.project.Client;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.builder.QueryUserDetailReq;
import com.lark.project.service.user.builder.QueryUserDetailResp;
import com.lark.project.service.user.builder.SearchUserReq;
import com.lark.project.service.user.builder.SearchUserResp;
import com.lark.project.service.user.model.UserBasicInfo;
import com.lark.project.service.workitem.builder.CreateWorkItemReq;
import com.lark.project.service.workitem.builder.CreateWorkItemResp;
import com.lark.project.service.workitem.builder.NodeStateChangeReq;
import com.lark.project.service.workitem.builder.NodeStateChangeResp;

import static com.lark.project.core.utils.Jsons.DEFAULT;
import static java.util.Collections.emptyList;
import static java.util.Objects.nonNull;

/**
 * Created by zhangyongxiang on 2025/7/16 19:05
 *
 * @author zhangyongxiang
 */
public class DefaultSimpleLarksuiteProjectService
        implements SimpleLarksuiteProjectService {
    
    private static final Logger log = LoggerFactory
            .getLogger(DefaultSimpleLarksuiteProjectService.class);
    
    public static final int USER_NOT_FOUND_CODE = 30006;
    
    private final Client larkProjectClient;
    
    private final int maxRetryTimes;
    
    public DefaultSimpleLarksuiteProjectService(Client larkProjectClient,
            int maxRetryTimes) {
        this.larkProjectClient = larkProjectClient;
        this.maxRetryTimes = maxRetryTimes;
    }
    
    @Override
    public long createWorkItem(final String projectKey,
            final String workItemTypeKey, final long templateId,
            final String name, final List<FieldValuePair> fieldValuePairs,
            final String userKey) {
        int retryTimes = 0;
        RuntimeException exception;
        do {
            try {
                final CreateWorkItemResp resp = this.larkProjectClient
                        .getWorkItemService().createWorkItem(
                                CreateWorkItemReq.newBuilder()
                                        .workItemTypeKey(workItemTypeKey)
                                        .projectKey(projectKey).name(name)
                                        .fieldValuePairs(fieldValuePairs)
                                        .templateID(templateId).build(),
                                RequestOptions.newBuilder().userKey(userKey)
                                        .build());
                // 处理服务端错误
                if (!resp.success()) {
                    log.warn("Failed to create work item. "
                            + "request: projectKey={}, workItemTypeKey={}, templateId={}, name={}, fieldValuePairs={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={}, detail err={}",
                            projectKey, workItemTypeKey, templateId, name,
                            DEFAULT.toJson(fieldValuePairs), userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), DEFAULT.toJson(resp.getErr()));
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to create work item. "
                                    + "request: projectKey={0}, workItemTypeKey={1}, templateId={2}, name={3}, fieldValuePairs={4}, userKey={5}"
                                    + ", response: http status={6}, code={7}, msg={8}, requestId={9},detail err={10}",
                            projectKey, workItemTypeKey, templateId, name,
                            DEFAULT.toJson(fieldValuePairs), userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(),
                            DEFAULT.toJson(resp.getErr())));
                } else {
                    log.info("Successfully created larksuite project work item. "
                            + "request: projectKey={}, workItemTypeKey={}, templateId={}, name={}, fieldValuePairs={}, userKey={}"
                            + ", response: workItemId={}", projectKey,
                            workItemTypeKey, templateId, name,
                            DEFAULT.toJson(fieldValuePairs), userKey,
                            resp.getData());
                    return resp.getData();
                }
            } catch (final Exception e) {
                log.warn("Failed to create work item. "
                        + "request: projectKey={}, workItemTypeKey={}, templateId={}, name={}, fieldValuePairs={}, userKey={}",
                        projectKey, workItemTypeKey, templateId, name,
                        DEFAULT.toJson(fieldValuePairs), userKey);
                retryTimes++;
                exception = new IllegalArgumentException(MessageFormat.format(
                        "Failed to create work item. "
                                + "request: projectKey={0}, workItemTypeKey={1}, templateId={2}, name={3}, fieldValuePairs={4}, userKey={5}",
                        projectKey, workItemTypeKey, templateId, name,
                        DEFAULT.toJson(fieldValuePairs), userKey), e);
            }
        } while (retryTimes < this.maxRetryTimes);
        throw exception;
    }
    
    @Override
    public void changeWorkItemStatus(final String projectKey,
            final String workItemTypeKey, final long workItemId,
            final long transitionId, final String userKey) {
        int retryTimes = 0;
        RuntimeException exception;
        do {
            try {
                final NodeStateChangeResp resp = this.larkProjectClient
                        .getWorkItemService().nodeStateChange(
                                NodeStateChangeReq.newBuilder()
                                        .projectKey(projectKey)
                                        .workItemTypeKey(workItemTypeKey)
                                        .workItemID(workItemId)
                                        .transitionID(transitionId).build(),
                                RequestOptions.newBuilder().userKey(userKey)// 传递用户token
                                        .build());
                // 处理服务端错误
                if (!resp.success()) {
                    log.warn("Failed to change work item status. "
                            + "request: projectKey={}, workItemTypeKey={}, workItemId={}, transitionId={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={}, detail err={}",
                            projectKey, workItemTypeKey, workItemId,
                            transitionId, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), DEFAULT.toJson(resp.getErr()));
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to change work item status. "
                                    + "request: projectKey={0}, workItemTypeKey={1}, workItemId={2}, transitionId={3}, userKey={4}"
                                    + ", response: http status={5}, code={6}, msg={7}, requestId={8},detail err={9}",
                            projectKey, workItemTypeKey, workItemId,
                            transitionId, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(),
                            DEFAULT.toJson(resp.getErr())));
                } else {
                    log.info("Successfully changed larksuite project work item status. "
                            + "request: projectKey={}, workItemTypeKey={}, workItemId={}, transitionId={}, userKey={}"
                            + ", response: workItemId={}", projectKey,
                            workItemTypeKey, workItemId, transitionId, userKey,
                            DEFAULT.toJson(resp));
                    return;
                }
            } catch (final Exception e) {
                log.warn("Failed to change work item status. "
                        + "request: projectKey={}, workItemTypeKey={}, workItemId={}, transitionId={}, userKey={}",
                        projectKey, workItemTypeKey, workItemId, transitionId,
                        userKey);
                retryTimes++;
                exception = new IllegalArgumentException(MessageFormat.format(
                        "Failed to create work item. "
                                + "request: projectKey={0}, workItemTypeKey={1}, workItemId={2}, transitionId={3}, userKey={4}",
                        projectKey, workItemTypeKey, workItemId, transitionId,
                        userKey), e);
            }
        } while (retryTimes < this.maxRetryTimes);
        throw exception;
    }
    
    @Override
    public List<UserBasicInfo> queryUsers(final String projectKey,
            final String userKey, final String... emails) {
        if (nonNull(emails) && emails.length > 0) {
            int retryTimes = 0;
            RuntimeException exception;
            do {
                try {
                    final QueryUserDetailResp resp = this.larkProjectClient
                            .getUserService()
                            .queryUserDetail(QueryUserDetailReq.newBuilder()
                                    .emails(Arrays.asList(emails)).build(),
                                    RequestOptions.newBuilder().userKey(userKey)
                                            .build());
                    if (!resp.success()) {
                        
                        log.warn("Failed to query users. "
                                + "request: projectKey={}, emails={}, userKey={}"
                                + ", response: http status={}, code={}, msg={}, requestId={},detail err={}",
                                projectKey, emails, userKey,
                                resp.getRawResponse().getStatusCode(),
                                resp.getErrCode(), resp.getErrMsg(),
                                resp.getRequestId(),
                                DEFAULT.toJson(resp.getErr()));
                        if (resp.getErrCode() == USER_NOT_FOUND_CODE) {
                            return emptyList();
                        }
                        throw new IllegalStateException(MessageFormat.format(
                                "Failed to query users. "
                                        + "request: projectKey={0}, emails={1}, userKey={2}"
                                        + ", response: http status={3}, code={4}, msg={5}, requestId={6},detail err={7}",
                                projectKey, emails, userKey,
                                resp.getRawResponse().getStatusCode(),
                                resp.getErrCode(), resp.getErrMsg(),
                                resp.getRequestId(),
                                DEFAULT.toJson(resp.getErr())));
                    } else {
                        return resp.getData();
                    }
                } catch (final Exception e) {
                    log.warn("Failed to query users. "
                            + "request: projectKey={}, emails={}, userKey={}",
                            projectKey, emails, userKey);
                    retryTimes++;
                    exception = new IllegalArgumentException(
                            MessageFormat.format("Failed to query users. "
                                    + "request: projectKey={0}, emails={1}, userKey={2}",
                                    projectKey, emails, userKey),
                            e);
                }
            } while (retryTimes < this.maxRetryTimes);
            throw exception;
        }
        return List.of();
    }
    
    @Override
    public List<UserBasicInfo> searchUsers(final String projectKey,
            final String userKey, final String keyword) {
        int retryTimes = 0;
        RuntimeException exception;
        do {
            try {
                final SearchUserResp resp = this.larkProjectClient
                        .getUserService()
                        .searchUser(SearchUserReq.newBuilder()
                                .projectKey(projectKey).query(keyword).build(),
                                RequestOptions.newBuilder().userKey(userKey)
                                        .build());
                if (!resp.success()) {
                    log.warn("Failed to search users. "
                            + "request: projectKey={}, keyword={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={},detail err={}",
                            projectKey, keyword, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), DEFAULT.toJson(resp.getErr()));
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to search users. "
                                    + "request: projectKey={0}, keyword={1}, userKey={2}"
                                    + ", response: http status={3}, code={4}, msg={5}, requestId={6},detail err={7}",
                            projectKey, keyword, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(),
                            DEFAULT.toJson(resp.getErr())));
                } else {
                    return resp.getData();
                }
            } catch (final Exception e) {
                log.warn("Failed to search users. "
                        + "request: projectKey={}, keyword={}, userKey={}",
                        projectKey, keyword, userKey);
                retryTimes++;
                exception = new IllegalArgumentException(MessageFormat.format(
                        "Failed to search users. "
                                + "request: projectKey={0}, keyword={1}, userKey={2}",
                        projectKey, keyword, userKey), e);
            }
            // 碰撞时间
        } while (retryTimes < this.maxRetryTimes);
        throw exception;
    }
    
    @Override
    public Optional<UserBasicInfo> findUserByUsername(final String projectKey,
            final String userKey, final String username) {
        final var users = searchUsers(projectKey, userKey, username);
        if (!users.isEmpty()) {
            return Optional.of(users.get(0));
        } else {
            return Optional.empty();
        }
    }
    
    @Override
    public List<UserBasicInfo> findUserByUsernames(final String projectKey,
            final String userKey, final String... usernames) {
        final var users = new ArrayList<UserBasicInfo>();
        if (nonNull(usernames)) {
            for (final String username : usernames) {
                final var user = searchUsers(projectKey, userKey, username);
                if (!user.isEmpty()) {
                    users.add(user.get(0));
                }
            }
        }
        return users;
    }
    
    @Override
    public Optional<UserBasicInfo> findUserByEmail(final String projectKey,
            final String userKey, final String email) {
        final var users = queryUsers(projectKey, userKey, email);
        if (!users.isEmpty()) {
            return Optional.of(users.get(0));
        } else {
            return Optional.empty();
        }
    }
    
}
