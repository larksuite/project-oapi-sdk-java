package com.bestzyx.larksuite.project.autoconfigure;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.UserBasicInfo;
import com.lark.project.service.workitem.builder.FilterResp;
import com.lark.project.service.workitem.model.WorkItemInfo;

/**
 * Created by zhangyongxiang on 2025/7/16 19:04
 *
 * @author zhangyongxiang
 */
public interface SimpleLarksuiteProjectService {
    
    long createWorkItem(String projectKey, String workItemTypeKey,
            long templateId, String name, List<FieldValuePair> fieldValuePairs,
            String userKey);
    
    void changeWorkItemStatus(String projectKey, String workItemTypeKey,
            long workItemId, long transitionId, String userKey);
    
    List<UserBasicInfo> queryUsers(final String projectKey, String userKey,
            String... emails);
    
    List<UserBasicInfo> searchUsers(final String projectKey,
            final String userKey, final String keyword);
    
    Optional<UserBasicInfo> findUserByEmail(final String projectKey,
            String userKey, String email);
    
    Optional<UserBasicInfo> findUserByUsername(final String projectKey,
            String userKey, String username);
    
    List<UserBasicInfo> findUserByUsernames(final String projectKey,
            final String userKey, final String... usernames);
    
    Optional<WorkItemInfo> findWorkItem(final String projectKey,
            final String userKey, final String workItemTypeKey,
            final Long workItemId);
    
    FilterResp searchWorkItems(final String projectKey, final String userKey,
            final String workItemTypeKey,
            final Collection<String> workItemStatus, String workItemName,
            long pageNo, long pageSize);
    
}
