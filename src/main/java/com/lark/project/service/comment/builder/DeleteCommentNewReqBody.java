package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;

public class DeleteCommentNewReqBody {
    @SerializedName("comment_id")
    private String commentId;
    @SerializedName("project_key")
    private String projectKey;

    public String getCommentId() { return commentId; }
    public void setCommentId(String commentId) { this.commentId = commentId; }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
}
