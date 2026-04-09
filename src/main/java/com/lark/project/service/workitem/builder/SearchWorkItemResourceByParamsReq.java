package com.lark.project.service.workitem.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.service.workitem.model.ResourceDataSource;
import com.lark.project.service.workitem.model.SearchGroup;
import com.lark.project.service.workitem.model.UniversalSearchPagination;

import java.util.List;

public class SearchWorkItemResourceByParamsReq {
    @Body
    private SearchWorkItemResourceByParamsReqBody body;

    public SearchWorkItemResourceByParamsReq() {
    }

    public SearchWorkItemResourceByParamsReq(Builder builder) {
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SearchWorkItemResourceByParamsReqBody getSearchWorkItemResourceByParamsReqBody() {
        return this.body;
    }

    public void setSearchWorkItemResourceByParamsReqBody(SearchWorkItemResourceByParamsReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private SearchWorkItemResourceByParamsReqBody body;

        public Builder() {
            body = new SearchWorkItemResourceByParamsReqBody();
        }

        public Builder dataSources(List<ResourceDataSource> dataSources) {
            this.body.setDataSources(dataSources);
            return this;
        }

        public Builder searchGroup(SearchGroup searchGroup) {
            this.body.setSearchGroup(searchGroup);
            return this;
        }

        public Builder fieldSelected(List<String> fieldSelected) {
            this.body.setFieldSelected(fieldSelected);
            return this;
        }

        public Builder pagination(UniversalSearchPagination pagination) {
            this.body.setPagination(pagination);
            return this;
        }

        public SearchWorkItemResourceByParamsReq build() {
            return new SearchWorkItemResourceByParamsReq(this);
        }
    }
}