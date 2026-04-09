package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.workitem.model.UniversalSearchPagination;

import java.util.List;

public class SearchWorkItemResourceByParamsResp extends BaseResponse {
    @SerializedName("data")
    private List<SearchWorkItemResourceByParamsData> data;
    
    @SerializedName("pagination")
    private UniversalSearchPagination pagination;

    public List<SearchWorkItemResourceByParamsData> getData() {
        return this.data;
    }

    public void setData(List<SearchWorkItemResourceByParamsData> data) {
        this.data = data;
    }

    public UniversalSearchPagination getPagination() {
        return pagination;
    }

    public void setPagination(UniversalSearchPagination pagination) {
        this.pagination = pagination;
    }
}