package com.lark.project.service.comment.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.comment.model.CommentObject;
import com.lark.project.service.comment.model.CommentPaginator;

public class QueryCommentNewReq {
    @Body
    private QueryCommentNewReqBody body;

    public QueryCommentNewReq() {}

    public QueryCommentNewReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() { return new Builder(); }

    public QueryCommentNewReqBody getQueryCommentNewReqBody() { return this.body; }
    public void setQueryCommentNewReqBody(QueryCommentNewReqBody body) { this.body = body; }

    public static class Builder {
        private QueryCommentNewReqBody body;

        public Builder() {
            body = new QueryCommentNewReqBody();
        }

        public Builder object(CommentObject object) {
            this.body.setObject(object);
            return this;
        }

        public Builder projectKey(String projectKey) {
            this.body.setProjectKey(projectKey);
            return this;
        }

        public Builder paginator(CommentPaginator paginator) {
            this.body.setPaginator(paginator);
            return this;
        }

        public Builder needRichTextMarkDown(Boolean needRichTextMarkDown) {
            this.body.setNeedRichTextMarkDown(needRichTextMarkDown);
            return this;
        }

        public QueryCommentNewReq build() {
            return new QueryCommentNewReq(this);
        }
    }
}
