package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;

public class CreateCommentNewRespData {
    @SerializedName("comment_id")
    private String commentId;

    public String getCommentId() { return commentId; }
    public void setCommentId(String commentId) { this.commentId = commentId; }
}
