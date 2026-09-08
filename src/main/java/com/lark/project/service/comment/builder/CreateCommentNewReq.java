package com.lark.project.service.comment.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.comment.model.CommentContentReq;
import com.lark.project.service.comment.model.CommentObject;

public class CreateCommentNewReq {
    @Body
    private CreateCommentNewReqBody body;

    public CreateCommentNewReq() {}

    public CreateCommentNewReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() { return new Builder(); }

    public CreateCommentNewReqBody getCreateCommentNewReqBody() { return this.body; }
    public void setCreateCommentNewReqBody(CreateCommentNewReqBody body) { this.body = body; }

    public static class Builder {
        private CreateCommentNewReqBody body;

        public Builder() {
            body = new CreateCommentNewReqBody();
        }

        public Builder object(CommentObject object) {
            this.body.setObject(object);
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

        public CreateCommentNewReq build() {
            return new CreateCommentNewReq(this);
        }
    }
}
