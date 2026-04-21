package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.ResourceDataSource;
import com.lark.project.service.workitem.model.SearchGroup;
import com.lark.project.service.workitem.model.UniversalSearchPagination;

import java.util.List;

public class SearchWorkItemResourceByParamsReqBody {
    @SerializedName("data_sources")
    private List<ResourceDataSource> dataSources;
    @SerializedName("search_group")
    private SearchGroup searchGroup;
    @SerializedName("field_selected")
    private List<String> fieldSelected;
    @SerializedName("pagination")
    private UniversalSearchPagination pagination;

    public List<ResourceDataSource> getDataSources() {
        return dataSources;
    }

    public void setDataSources(List<ResourceDataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public SearchGroup getSearchGroup() {
        return searchGroup;
    }

    public void setSearchGroup(SearchGroup searchGroup) {
        this.searchGroup = searchGroup;
    }

    public List<String> getFieldSelected() {
        return fieldSelected;
    }

    public void setFieldSelected(List<String> fieldSelected) {
        this.fieldSelected = fieldSelected;
    }

    public UniversalSearchPagination getPagination() {
        return pagination;
    }

    public void setPagination(UniversalSearchPagination pagination) {
        this.pagination = pagination;
    }
}