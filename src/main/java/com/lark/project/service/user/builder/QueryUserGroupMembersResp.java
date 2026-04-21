package com.lark.project.service.user.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.user.model.QueryUserGroupMembersData;

public class QueryUserGroupMembersResp extends BaseResponse {
    @SerializedName("data")
    private QueryUserGroupMembersData data;

    public QueryUserGroupMembersData getData() { return data; }
    public void setData(QueryUserGroupMembersData data) { this.data = data; }
}
