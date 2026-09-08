package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CommentRichTextResp {
    @SerializedName("doc")
    private String doc;
    @SerializedName("doc_img")
    private List<String> docImg;
    @SerializedName("doc_html")
    private String docHtml;
    @SerializedName("doc_text")
    private String docText;
    @SerializedName("is_empty")
    private Boolean isEmpty;
    @SerializedName("markdown_content")
    private CommentMarkdownContent markdownContent;

    public String getDoc() { return doc; }
    public void setDoc(String doc) { this.doc = doc; }
    public List<String> getDocImg() { return docImg; }
    public void setDocImg(List<String> docImg) { this.docImg = docImg; }
    public String getDocHtml() { return docHtml; }
    public void setDocHtml(String docHtml) { this.docHtml = docHtml; }
    public String getDocText() { return docText; }
    public void setDocText(String docText) { this.docText = docText; }
    public Boolean getIsEmpty() { return isEmpty; }
    public void setIsEmpty(Boolean isEmpty) { this.isEmpty = isEmpty; }
    public CommentMarkdownContent getMarkdownContent() { return markdownContent; }
    public void setMarkdownContent(CommentMarkdownContent markdownContent) { this.markdownContent = markdownContent; }
}
