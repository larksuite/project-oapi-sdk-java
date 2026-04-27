package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class QueryWorkItemConclusionOptionReqBody {
    @SerializedName("project_key")
    private String projectKey;

    @SerializedName("work_item_id")
    private Long workItemId;

    @SerializedName("node_ids")
    private List<String> nodeIds;

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(Long workItemId) {
        this.workItemId = workItemId;
    }

    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String projectKey;
        private Long workItemId;
        private List<String> nodeIds;

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemId(Long workItemId) {
            this.workItemId = workItemId;
            return this;
        }

        public Builder nodeIds(List<String> nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }

        public QueryWorkItemConclusionOptionReqBody build() {
            QueryWorkItemConclusionOptionReqBody body = new QueryWorkItemConclusionOptionReqBody();
            body.setProjectKey(projectKey);
            body.setWorkItemId(workItemId);
            body.setNodeIds(nodeIds);
            return body;
        }
    }
}
