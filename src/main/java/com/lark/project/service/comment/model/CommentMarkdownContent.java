package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CommentMarkdownContent {
    @SerializedName("markdown")
    private String markdown;
    @SerializedName("mention_user_keys")
    private List<CommentMentionUser> mentionUserKeys;

    public String getMarkdown() { return markdown; }
    public void setMarkdown(String markdown) { this.markdown = markdown; }
    public List<CommentMentionUser> getMentionUserKeys() { return mentionUserKeys; }
    public void setMentionUserKeys(List<CommentMentionUser> mentionUserKeys) { this.mentionUserKeys = mentionUserKeys; }
}
