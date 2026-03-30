package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ListWorkItemOpRecordRespData {
    @SerializedName("has_more")
    private Boolean hasMore;
    @SerializedName("start_from")
    private String startFrom;
    @SerializedName("op_records")
    private List<OpRecord> opRecords;
    @SerializedName("total")
    private Long total;

    public Boolean getHasMore() { return hasMore; }
    public void setHasMore(Boolean hasMore) { this.hasMore = hasMore; }

    public String getStartFrom() { return startFrom; }
    public void setStartFrom(String startFrom) { this.startFrom = startFrom; }

    public List<OpRecord> getOpRecords() { return opRecords; }
    public void setOpRecords(List<OpRecord> opRecords) { this.opRecords = opRecords; }

    public Long getTotal() { return total; }
    public void setTotal(Long total) { this.total = total; }
}
