package com.lark.project.service.project.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Path;
import com.lark.project.core.annotation.Query;

public class ListProjectTeamReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;

    @Query
    @SerializedName("offset")
    private Long offset;

    @Query
    @SerializedName("limit")
    private Long limit;

    public ListProjectTeamReq() {
    }

    public ListProjectTeamReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.offset = builder.offset;
        this.limit = builder.limit;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public static class Builder {
        private String projectKey;
        private Long offset;
        private Long limit;

        public Builder() {
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public ListProjectTeamReq build() {
            return new ListProjectTeamReq(this);
        }
    }
}
