package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;

public class CommentMentionUser {
    @SerializedName("id")
    private String id;
    @SerializedName("user_key")
    private String userKey;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getUserKey() { return userKey; }
    public void setUserKey(String userKey) { this.userKey = userKey; }
}
