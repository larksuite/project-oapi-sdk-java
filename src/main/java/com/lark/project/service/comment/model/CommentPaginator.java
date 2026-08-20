package com.lark.project.service.comment.model;

import com.google.gson.annotations.SerializedName;

public class CommentPaginator {
    @SerializedName("cursor")
    private String cursor;
    @SerializedName("direction")
    private String direction;
    @SerializedName("page_size")
    private Integer pageSize;

    public String getCursor() { return cursor; }
    public void setCursor(String cursor) { this.cursor = cursor; }
    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }
    public Integer getPageSize() { return pageSize; }
    public void setPageSize(Integer pageSize) { this.pageSize = pageSize; }
}
