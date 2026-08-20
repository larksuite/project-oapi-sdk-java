package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.comment.model.CommentNew;
import java.util.List;

public class QueryCommentNewRespData {
    @SerializedName("comments")
    private List<CommentNew> comments;
    @SerializedName("next_cursor")
    private String nextCursor;

    public List<CommentNew> getComments() { return comments; }
    public void setComments(List<CommentNew> comments) { this.comments = comments; }
    public String getNextCursor() { return nextCursor; }
    public void setNextCursor(String nextCursor) { this.nextCursor = nextCursor; }
}
