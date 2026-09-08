package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;

public class CommentContentResp {
    @SerializedName("type")
    private String type;
    @SerializedName("rich_text")
    private CommentRichTextResp richText;
    @SerializedName("file_token")
    private String fileToken;
    @SerializedName("create_time")
    private Long createTime;
    @SerializedName("update_time")
    private Long updateTime;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public CommentRichTextResp getRichText() { return richText; }
    public void setRichText(CommentRichTextResp richText) { this.richText = richText; }
    public String getFileToken() { return fileToken; }
    public void setFileToken(String fileToken) { this.fileToken = fileToken; }
    public Long getCreateTime() { return createTime; }
    public void setCreateTime(Long createTime) { this.createTime = createTime; }
    public Long getUpdateTime() { return updateTime; }
    public void setUpdateTime(Long updateTime) { this.updateTime = updateTime; }
}
