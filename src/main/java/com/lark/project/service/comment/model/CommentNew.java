package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;

public class CommentNew {
    @SerializedName("object")
    private CommentObject object;
    @SerializedName("status")
    private String status;
    @SerializedName("content")
    private CommentContentResp content;
    @SerializedName("creator")
    private String creator;
    @SerializedName("comment_id")
    private String commentId;
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("sequence_id")
    private String sequenceId;
    @SerializedName("has_more_children")
    private Boolean hasMoreChildren;

    public CommentObject getObject() { return object; }
    public void setObject(CommentObject object) { this.object = object; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public CommentContentResp getContent() { return content; }
    public void setContent(CommentContentResp content) { this.content = content; }
    public String getCreator() { return creator; }
    public void setCreator(String creator) { this.creator = creator; }
    public String getCommentId() { return commentId; }
    public void setCommentId(String commentId) { this.commentId = commentId; }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
    public String getSequenceId() { return sequenceId; }
    public void setSequenceId(String sequenceId) { this.sequenceId = sequenceId; }
    public Boolean getHasMoreChildren() { return hasMoreChildren; }
    public void setHasMoreChildren(Boolean hasMoreChildren) { this.hasMoreChildren = hasMoreChildren; }
}
