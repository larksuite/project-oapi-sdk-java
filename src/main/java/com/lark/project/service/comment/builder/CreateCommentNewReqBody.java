package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.comment.model.CommentContentReq;
import com.lark.project.service.comment.model.CommentObject;

public class CreateCommentNewReqBody {
    @SerializedName("object")
    private CommentObject object;
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("content")
    private CommentContentReq content;

    public CommentObject getObject() { return object; }
    public void setObject(CommentObject object) { this.object = object; }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
    public CommentContentReq getContent() { return content; }
    public void setContent(CommentContentReq content) { this.content = content; }
}
