package com.lark.project.service.comment.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.comment.model.CommentContentReq;

public class UpdateCommentNewReq {
    @Body
    private UpdateCommentNewReqBody body;

    public UpdateCommentNewReq() {}

    public UpdateCommentNewReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() { return new Builder(); }

    public UpdateCommentNewReqBody getUpdateCommentNewReqBody() { return this.body; }
    public void setUpdateCommentNewReqBody(UpdateCommentNewReqBody body) { this.body = body; }

    public static class Builder {
        private UpdateCommentNewReqBody body;

        public Builder() {
            body = new UpdateCommentNewReqBody();
        }

        public Builder commentId(String commentId) {
            this.body.setCommentId(commentId);
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder content(CommentContentReq content) {
            this.body.setContent(content);
            return this;
        }

        public UpdateCommentNewReq build() {
            return new UpdateCommentNewReq(this);
        }
    }
}
