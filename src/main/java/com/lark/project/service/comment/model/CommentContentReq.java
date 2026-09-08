package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CommentContentReq {
    @SerializedName("text")
    private String text;
    @SerializedName("type")
    private String type;
    @SerializedName("markdown")
    private String markdown;
    @SerializedName("rich_text")
    private List<Object> richText;
    @SerializedName("file_token")
    private String fileToken;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getMarkdown() { return markdown; }
    public void setMarkdown(String markdown) { this.markdown = markdown; }
    public List<Object> getRichText() { return richText; }
    public void setRichText(List<Object> richText) { this.richText = richText; }
    public String getFileToken() { return fileToken; }
    public void setFileToken(String fileToken) { this.fileToken = fileToken; }
}
