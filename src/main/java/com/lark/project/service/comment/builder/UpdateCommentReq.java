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

package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.annotation.Body;
import com.lark.project.core.annotation.Path;

public class UpdateCommentReq {
    @Path
    @SerializedName("project_key")
    private String projectKey;
    @Path
    @SerializedName("work_item_id")
    private Long workItemID;
    @Path
    @SerializedName("comment_id")
    private Long commentID;
    @Path
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @Body
    private UpdateCommentReqBody body;


    public UpdateCommentReq() {
    }

    public UpdateCommentReq(Builder builder) {
        this.projectKey = builder.projectKey;
        this.workItemID = builder.workItemID;
        this.commentID = builder.commentID;
        this.workItemTypeKey = builder.workItemTypeKey;
        this.body = builder.body;

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

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public Long getCommentID() {
        return this.commentID;
    }

    public void setCommentID(Long commentID) {
        this.commentID = commentID;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public UpdateCommentReqBody getUpdateCommentReqBody() {
        return this.body;
    }

    public void setUpdateCommentReqBody(UpdateCommentReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String projectKey;
        private Long workItemID;
        private Long commentID;
        private String workItemTypeKey;
        private UpdateCommentReqBody body;

        public Builder() {
            body = new UpdateCommentReqBody();
        }

        public Builder projectKey(String projectKey) {
            this.projectKey = projectKey;
            return this;
        }

        public Builder workItemID(Long workItemID) {
            this.workItemID = workItemID;
            return this;
        }

        public Builder commentID(Long commentID) {
            this.commentID = commentID;
            return this;
        }

        public Builder workItemTypeKey(String workItemTypeKey) {
            this.workItemTypeKey = workItemTypeKey;
            return this;
        }

        public Builder content(String content) {
            this.body.setContent(content);
            return this;
        }

        public UpdateCommentReq build() {
            return new UpdateCommentReq(this);
        }

    }
}