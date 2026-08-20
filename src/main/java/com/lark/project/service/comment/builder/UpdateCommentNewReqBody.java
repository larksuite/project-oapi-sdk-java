package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.comment.model.CommentContentReq;

public class UpdateCommentNewReqBody {
    @SerializedName("comment_id")
    private String commentId;
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("content")
    private CommentContentReq content;

    public String getCommentId() { return commentId; }
    public void setCommentId(String commentId) { this.commentId = commentId; }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
    public CommentContentReq getContent() { return content; }
    public void setContent(CommentContentReq content) { this.content = content; }
}
