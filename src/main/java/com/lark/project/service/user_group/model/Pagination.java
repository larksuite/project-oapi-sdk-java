package com.lark.project.service.user_group.model;

import com.google.gson.annotations.SerializedName;

public class Pagination {
    @SerializedName("has_more")
    private Boolean hasMore;
    @SerializedName("page_num")
    private Long pageNum;
    @SerializedName("page_size")
    private Long pageSize;

    public Boolean getHasMore() { return hasMore; }
    public void setHasMore(Boolean hasMore) { this.hasMore = hasMore; }
    public Long getPageNum() { return pageNum; }
    public void setPageNum(Long pageNum) { this.pageNum = pageNum; }
    public Long getPageSize() { return pageSize; }
    public void setPageSize(Long pageSize) { this.pageSize = pageSize; }
}
