package com.lark.project.service.comment.builder;

import com.lark.project.core.annotation.Body;

public class DeleteCommentNewReq {
    @Body
    private DeleteCommentNewReqBody body;

    public DeleteCommentNewReq() {}

    public DeleteCommentNewReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() { return new Builder(); }

    public DeleteCommentNewReqBody getDeleteCommentNewReqBody() { return this.body; }
    public void setDeleteCommentNewReqBody(DeleteCommentNewReqBody body) { this.body = body; }

    public static class Builder {
        private DeleteCommentNewReqBody body;

        public Builder() {
            body = new DeleteCommentNewReqBody();
        }

        public Builder commentId(String commentId) {
            this.body.setCommentId(commentId);
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public DeleteCommentNewReq build() {
            return new DeleteCommentNewReq(this);
        }
    }
}
