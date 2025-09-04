package com.bestzyx.larksuite.project.autoconfigure;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.WorkItemStatus;

/**
 * Created by zhangyongxiang on 2025/9/4 11:05
 *
 * @author zhangyongxiang
 */
public class WorkItemStatusBuilder {
    
    private WorkItemStatusBuilder() {}
    
    @SerializedName("state_key")
    private String stateKey;
    
    @SerializedName("is_archived_state")
    private Boolean isArchivedState;
    
    @SerializedName("is_init_state")
    private Boolean isInitState;
    
    @SerializedName("updated_at")
    private Long updatedAt;
    
    @SerializedName("updated_by")
    private String updatedBy;
    
    @SerializedName("history")
    private List<WorkItemStatus> history = new ArrayList<>();
    
    public static WorkItemStatusBuilder builder() {
        return new WorkItemStatusBuilder();
    }
    
    public WorkItemStatusBuilder stateKey(final String stateKey) {
        this.stateKey = stateKey;
        return this;
    }
    
    public WorkItemStatusBuilder isArchivedState(
            final Boolean isArchivedState) {
        this.isArchivedState = isArchivedState;
        return this;
    }
    
    public WorkItemStatusBuilder isInitState(final Boolean isInitState) {
        this.isInitState = isInitState;
        return this;
    }
    
    public WorkItemStatusBuilder updatedAt(final Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public WorkItemStatusBuilder updatedBy(final String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    
    public WorkItemStatusBuilder history(final List<WorkItemStatus> history) {
        this.history = history;
        return this;
    }
    
    public WorkItemStatusBuilder addHistory(final WorkItemStatus history) {
        this.history.add(history);
        return this;
    }
    
    public WorkItemStatus build() {
        final WorkItemStatus workItemStatus = new WorkItemStatus();
        workItemStatus.setStateKey(this.stateKey);
        workItemStatus.setIsArchivedState(this.isArchivedState);
        workItemStatus.setIsInitState(this.isInitState);
        workItemStatus.setUpdatedAt(this.updatedAt);
        workItemStatus.setUpdatedBy(this.updatedBy);
        workItemStatus.setHistory(this.history);
        return workItemStatus;
    }
}
