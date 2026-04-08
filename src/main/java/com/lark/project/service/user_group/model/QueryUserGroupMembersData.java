package com.lark.project.service.user_group.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class QueryUserGroupMembersData {
    @SerializedName("list")
    private List<UserGroup> list;
    @SerializedName("pagination")
    private Pagination pagination;

    public List<UserGroup> getList() { return list; }
    public void setList(List<UserGroup> list) { this.list = list; }
    public Pagination getPagination() { return pagination; }
    public void setPagination(Pagination pagination) { this.pagination = pagination; }
}
