package com.bestzyx.larksuite.project.autoconfigure;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import com.lark.project.service.workitem.builder.FilterReq;
import com.lark.project.service.workitem.builder.FilterResp;
import com.lark.project.service.workitem.builder.NodeStateChangeReq;
import com.lark.project.service.workitem.builder.NodeStateChangeResp;
import com.lark.project.service.workitem.builder.QueryWorkItemDetailReq;
import com.lark.project.service.workitem.builder.QueryWorkItemDetailResp;
import com.lark.project.service.workitem.builder.SearchByParamsReq;
import com.lark.project.service.workitem.builder.SearchByParamsResp;
import com.lark.project.service.workitem.model.SearchParam;
import com.lark.project.service.workitem.model.WorkItemInfo;

import static com.bestzyx.prism.utils.StringUtils.isNotBlank;
import static com.lark.project.core.utils.Jsons.DEFAULT;
import static java.util.Collections.emptyList;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toList;

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
    
    private final Client larksuiteProjectClient;
    
    private final int maxRetryTimes;
    
    public DefaultSimpleLarksuiteProjectService(Client larksuiteProjectClient,
            int maxRetryTimes) {
        this.larksuiteProjectClient = larksuiteProjectClient;
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
            String fieldValueMsg = DEFAULT.toJson(fieldValuePairs);
            try {
                final CreateWorkItemResp resp = this.larksuiteProjectClient
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
                    String errorMsg = DEFAULT.toJson(resp.getErr());
                    log.warn("Failed to create work item. "
                            + "request: projectKey={}, workItemTypeKey={}, templateId={}, name={}, fieldValuePairs={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={}, detail err={}",
                            projectKey, workItemTypeKey, templateId, name,
                            fieldValueMsg, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg);
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to create work item. "
                                    + "request: projectKey={0}, workItemTypeKey={1}, templateId={2}, name={3}, fieldValuePairs={4}, userKey={5}"
                                    + ", response: http status={6}, code={7}, msg={8}, requestId={9},detail err={10}",
                            projectKey, workItemTypeKey, templateId, name,
                            fieldValueMsg, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg));
                } else {
                    log.info(
                            "Successfully created larksuite project work item. "
                                    + "request: projectKey={}, workItemTypeKey={}, templateId={}, name={}, fieldValuePairs={}, userKey={}"
                                    + ", response: workItemId={}",
                            projectKey, workItemTypeKey, templateId, name,
                            fieldValueMsg, userKey, resp.getData());
                    return resp.getData();
                }
            } catch (final Exception e) {
                log.warn("Failed to create work item. "
                        + "request: projectKey={}, workItemTypeKey={}, templateId={}, name={}, fieldValuePairs={}, userKey={}",
                        projectKey, workItemTypeKey, templateId, name,
                        fieldValueMsg, userKey);
                retryTimes++;
                exception = new IllegalArgumentException(MessageFormat.format(
                        "Failed to create work item. "
                                + "request: projectKey={0}, workItemTypeKey={1}, templateId={2}, name={3}, fieldValuePairs={4}, userKey={5}",
                        projectKey, workItemTypeKey, templateId, name,
                        fieldValueMsg, userKey), e);
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
                final NodeStateChangeResp resp = this.larksuiteProjectClient
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
                    String error = DEFAULT.toJson(resp.getErr());
                    log.warn("Failed to change work item status. "
                            + "request: projectKey={}, workItemTypeKey={}, workItemId={}, transitionId={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={}, detail err={}",
                            projectKey, workItemTypeKey, workItemId,
                            transitionId, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), error);
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to change work item status. "
                                    + "request: projectKey={0}, workItemTypeKey={1}, workItemId={2}, transitionId={3}, userKey={4}"
                                    + ", response: http status={5}, code={6}, msg={7}, requestId={8},detail err={9}",
                            projectKey, workItemTypeKey, workItemId,
                            transitionId, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), error));
                } else {
                    String respMsg = DEFAULT.toJson(resp);
                    log.info(
                            "Successfully changed larksuite project work item status. "
                                    + "request: projectKey={}, workItemTypeKey={}, workItemId={}, transitionId={}, userKey={}"
                                    + ", response: workItemId={}",
                            projectKey, workItemTypeKey, workItemId,
                            transitionId, userKey, respMsg);
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
                    final QueryUserDetailResp resp = this.larksuiteProjectClient
                            .getUserService()
                            .queryUserDetail(QueryUserDetailReq.newBuilder()
                                    .emails(Arrays.asList(emails)).build(),
                                    RequestOptions.newBuilder().userKey(userKey)
                                            .build());
                    if (!resp.success()) {
                        
                        String errorMsg = DEFAULT.toJson(resp.getErr());
                        log.warn("Failed to query users. "
                                + "request: projectKey={}, emails={}, userKey={}"
                                + ", response: http status={}, code={}, msg={}, requestId={},detail err={}",
                                projectKey, emails, userKey,
                                resp.getRawResponse().getStatusCode(),
                                resp.getErrCode(), resp.getErrMsg(),
                                resp.getRequestId(), errorMsg);
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
                                resp.getRequestId(), errorMsg));
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
                final SearchUserResp resp = this.larksuiteProjectClient
                        .getUserService()
                        .searchUser(SearchUserReq.newBuilder()
                                .projectKey(projectKey).query(keyword).build(),
                                RequestOptions.newBuilder().userKey(userKey)
                                        .build());
                if (!resp.success()) {
                    String errorMsg = DEFAULT.toJson(resp.getErr());
                    log.warn("Failed to search users. "
                            + "request: projectKey={}, keyword={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={},detail err={}",
                            projectKey, keyword, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg);
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to search users. "
                                    + "request: projectKey={0}, keyword={1}, userKey={2}"
                                    + ", response: http status={3}, code={4}, msg={5}, requestId={6},detail err={7}",
                            projectKey, keyword, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg));
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
    
    @Override
    public Optional<WorkItemInfo> findWorkItem(final String projectKey,
            final String userKey, final String workItemTypeKey,
            final Long workItemId) {
        int retryTimes = 0;
        RuntimeException exception;
        do {
            try {
                final QueryWorkItemDetailResp resp = this.larksuiteProjectClient
                        .getWorkItemService()
                        .queryWorkItemDetail(QueryWorkItemDetailReq.newBuilder()
                                .projectKey(projectKey)
                                .workItemTypeKey(workItemTypeKey)
                                .workItemIDs(List.of(workItemId)).build(),
                                RequestOptions.newBuilder().userKey(userKey)
                                        .build());
                if (resp.success()) {
                    log.info("Successfully find work item. "
                            + "request: projectKey={}, workItemTypeKey={}, workItemId={}, userKey={}"
                            + ", response: {}", projectKey, workItemTypeKey,
                            workItemId, userKey, resp.getData());
                    return resp.getData().isEmpty() ? Optional.empty()
                            : Optional.of(resp.getData().getFirst());
                } else {
                    String errorMsg = DEFAULT.toJson(resp.getErr());
                    log.warn("Failed to find work item. "
                            + "request: projectKey={}, workItemTypeKey={}, workItemId={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={}, detail err={}",
                            projectKey, workItemTypeKey, workItemId, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg);
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to find work item. "
                                    + "request: projectKey={0}, workItemTypeKey={1}, workItemId={2}, userKey={3}"
                                    + ", response: http status={4}, code={5}, msg={6}, requestId={7},detail err={8}",
                            projectKey, workItemTypeKey, workItemId, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg));
                }
            } catch (final Exception e) {
                log.warn("Failed to find work item. "
                        + "request: projectKey={}, workItemTypeKey={}, workItemId={}, userKey={}",
                        projectKey, workItemTypeKey, workItemId, userKey);
                retryTimes++;
                exception = new IllegalArgumentException(MessageFormat.format(
                        "Failed to find work item. "
                                + "request: projectKey={0}, workItemTypeKey={1}, workItemId={2}, userKey={3}",
                        projectKey, workItemTypeKey, workItemId, userKey), e);
            }
        } while (retryTimes < this.maxRetryTimes);
        throw exception;
    }
    
    @Override
    public FilterResp searchWorkItems(final String projectKey,
            final String userKey, final String workItemTypeKey,
            final Collection<String> workItemStatus, String workItemName,
            long pageNo, long pageSize) {
        if (pageNo < 1) {
            throw new IllegalArgumentException(
                    "pageNo must be greater than or equal to 1.");
        }
        if (pageSize > 200 || pageSize < 1) {
            throw new IllegalArgumentException(
                    "pageSize must be greater than or equal to 1");
        }
        int retryTimes = 0;
        RuntimeException exception;
        do {
            try {
                FilterReq.Builder builder = FilterReq.newBuilder()
                        .projectKey(projectKey)
                        .workItemTypeKeys(List.of(workItemTypeKey))
                        .pageNum(pageNo).pageSize(pageSize);
                if (workItemStatus != null && !workItemStatus.isEmpty()) {
                    builder.workItemStatus(workItemStatus.stream()
                            .map(value -> WorkItemStatusBuilder.builder()
                                    .stateKey(value).build())
                            .collect(toList()));
                }
                if (isNotBlank(workItemName)) {
                    builder.workItemName(workItemName);
                }
                final FilterResp resp = this.larksuiteProjectClient
                        .getWorkItemService()
                        .filter(builder.build(), RequestOptions.newBuilder()
                                .userKey(userKey).build());
                if (resp.success()) {
                    log.info("Successfully search work items. "
                            + "request: projectKey={}, workItemTypeKey={}, workItemStatus={}, userKey={}"
                            + ", response: {}", projectKey, userKey,
                            workItemStatus, userKey, resp.getData());
                    return resp;
                } else {
                    String errorMsg = DEFAULT.toJson(resp.getErr());
                    log.warn("Failed to search work items. "
                            + "request: projectKey={}, workItemTypeKey={}, workItemStatus={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={}, detail err={}",
                            projectKey, userKey, workItemStatus, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg);
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to find work item. "
                                    + "request: projectKey={0}, workItemTypeKey={1}, workItemStatus={2}, userKey={3}"
                                    + ", response: http status={4}, code={5}, msg={6}, requestId={7},detail err={8}",
                            projectKey, userKey, workItemStatus, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg));
                }
            } catch (final Exception e) {
                log.warn("Failed to search work items. "
                        + "request: projectKey={}, workItemTypeKey={}, workItemStatus={}, userKey={}",
                        projectKey, userKey, workItemStatus, userKey);
                retryTimes++;
                exception = new IllegalArgumentException(MessageFormat.format(
                        "Failed to search work items. "
                                + "request: projectKey={0}, workItemTypeKey={1}, workItemStatus={2}, userKey={3}",
                        projectKey, userKey, workItemStatus, userKey), e);
            }
        } while (retryTimes < this.maxRetryTimes);
        throw exception;
    }
    
    public SearchByParamsResp searchWorkItems(final String projectKey,
            final String userKey, final String workItemTypeKey,
            List<SearchParam> searchParams, long pageNo, long pageSize) {
        if (pageNo < 1) {
            throw new IllegalArgumentException(
                    "pageNo must be greater than or equal to 1.");
        }
        if (pageSize > 200 || pageSize < 1) {
            throw new IllegalArgumentException(
                    "pageSize must be greater than or equal to 1");
        }
        int retryTimes = 0;
        RuntimeException exception;
        do {
            try {
                final SearchByParamsResp resp = this.larksuiteProjectClient
                        .getWorkItemService()
                        .searchByParams(SearchByParamsReq.newBuilder()
                                .projectKey(projectKey)
                                .workItemTypeKey(workItemTypeKey)
                                .searchGroup(SearchGroupBuilder.builder()
                                        .searchParams(searchParams).build())
                                .pageNum(pageNo).pageSize(pageSize).build(),
                                RequestOptions.newBuilder().userKey(userKey)
                                        .build());
                if (resp.success()) {
                    log.info("Successfully search work items. "
                            + "request: projectKey={}, workItemTypeKey={}, searchParams={}, userKey={}"
                            + ", response: {}", projectKey, userKey,
                            searchParams, userKey, resp.getData());
                    return resp;
                } else {
                    String errorMsg = DEFAULT.toJson(resp.getErr());
                    log.warn("Failed to search work items. "
                            + "request: projectKey={}, workItemTypeKey={}, searchParams={}, userKey={}"
                            + ", response: http status={}, code={}, msg={}, requestId={}, detail err={}",
                            projectKey, userKey, searchParams, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg);
                    throw new IllegalStateException(MessageFormat.format(
                            "Failed to find work item. "
                                    + "request: projectKey={0}, workItemTypeKey={1}, searchParams={2}, userKey={3}"
                                    + ", response: http status={4}, code={5}, msg={6}, requestId={7},detail err={8}",
                            projectKey, userKey, searchParams, userKey,
                            resp.getRawResponse().getStatusCode(),
                            resp.getErrCode(), resp.getErrMsg(),
                            resp.getRequestId(), errorMsg));
                }
            } catch (final Exception e) {
                log.warn("Failed to search work items. "
                        + "request: projectKey={}, workItemTypeKey={}, searchParams={}, userKey={}",
                        projectKey, userKey, searchParams, userKey);
                retryTimes++;
                exception = new IllegalArgumentException(MessageFormat.format(
                        "Failed to search work items. "
                                + "request: projectKey={0}, workItemTypeKey={1}, searchParams={2}, userKey={3}",
                        projectKey, userKey, searchParams, userKey), e);
            }
        } while (retryTimes < this.maxRetryTimes);
        throw exception;
    }
}
