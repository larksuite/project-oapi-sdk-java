package com.bestzyx.larksuite.project.autoconfigure;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.SearchGroup;
import com.lark.project.service.workitem.model.SearchParam;

import static java.util.Collections.emptyList;
import static java.util.Objects.isNull;

/**
 * Created by zhangyongxiang on 2025/9/4 16:55
 *
 * @author zhangyongxiang
 */
public class SearchGroupBuilder {
    
    @SerializedName("search_params")
    private List<SearchParam> searchParams = new ArrayList<>();
    
    @SerializedName("conjunction")
    private String conjunction;
    
    @SerializedName("search_groups")
    private List<SearchGroup> searchGroups = new ArrayList<>();
    
    private SearchGroupBuilder() {}
    
    public static SearchGroupBuilder builder() {
        return new SearchGroupBuilder();
    }
    
    public SearchGroupBuilder searchParams(List<SearchParam> searchParams) {
        this.searchParams
                .addAll(isNull(searchParams) ? emptyList() : searchParams);
        return this;
    }
    
    public SearchGroupBuilder searchParam(SearchParam searchParam) {
        this.searchParams.add(searchParam);
        return this;
    }
    
    public SearchGroupBuilder conjunction(String conjunction) {
        this.conjunction = conjunction;
        return this;
    }
    
    public SearchGroupBuilder searchGroups(List<SearchGroup> searchGroups) {
        this.searchGroups
                .addAll(isNull(searchGroups) ? emptyList() : searchGroups);
        return this;
    }
    
    public SearchGroupBuilder searchGroup(SearchGroup searchGroup) {
        this.searchGroups.add(searchGroup);
        return this;
    }
    
    public SearchGroup build() {
        final SearchGroup searchGroup = new SearchGroup();
        searchGroup.setConjunction(this.conjunction);
        searchGroup.setSearchGroups(this.searchGroups);
        searchGroup.setSearchParams(this.searchParams);
        return searchGroup;
    }
}
