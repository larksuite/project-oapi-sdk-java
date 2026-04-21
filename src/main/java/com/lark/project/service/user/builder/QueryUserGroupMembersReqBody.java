package com.lark.project.service.user.builder;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class QueryUserGroupMembersReqBody {
    @SerializedName("user_group_type")
    private String userGroupType;
    @SerializedName("user_group_ids")
    private List<String> userGroupIds;
    @SerializedName("page_num")
    private Long pageNum;
    @SerializedName("page_size")
    private Long pageSize;

    public String getUserGroupType() { return userGroupType; }
    public void setUserGroupType(String userGroupType) { this.userGroupType = userGroupType; }
    public List<String> getUserGroupIds() { return userGroupIds; }
    public void setUserGroupIds(List<String> userGroupIds) { this.userGroupIds = userGroupIds; }
    public Long getPageNum() { return pageNum; }
    public void setPageNum(Long pageNum) { this.pageNum = pageNum; }
    public Long getPageSize() { return pageSize; }
    public void setPageSize(Long pageSize) { this.pageSize = pageSize; }
}
