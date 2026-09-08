package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.comment.model.CommentObject;
import com.lark.project.service.comment.model.CommentPaginator;

public class QueryCommentNewReqBody {
    @SerializedName("object")
    private CommentObject object;
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("paginator")
    private CommentPaginator paginator;
    @SerializedName("need_rich_text_mark_down")
    private Boolean needRichTextMarkDown;

    public CommentObject getObject() { return object; }
    public void setObject(CommentObject object) { this.object = object; }
    public String getProjectKey() { return projectKey; }
    public void setProjectKey(String projectKey) { this.projectKey = projectKey; }
    public CommentPaginator getPaginator() { return paginator; }
    public void setPaginator(CommentPaginator paginator) { this.paginator = paginator; }
    public Boolean getNeedRichTextMarkDown() { return needRichTextMarkDown; }
    public void setNeedRichTextMarkDown(Boolean needRichTextMarkDown) { this.needRichTextMarkDown = needRichTextMarkDown; }
}
