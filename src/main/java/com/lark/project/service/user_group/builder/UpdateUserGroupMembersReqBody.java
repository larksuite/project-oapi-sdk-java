package com.lark.project.service.user_group.builder;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UpdateUserGroupMembersReqBody {
    @SerializedName("user_group_type")
    private String userGroupType;
    @SerializedName("user_group_id")
    private String userGroupId;
    @SerializedName("add_users")
    private List<String> addUsers;
    @SerializedName("delete_users")
    private List<String> deleteUsers;
    @SerializedName("replace_users")
    private List<String> replaceUsers;

    public String getUserGroupType() { return userGroupType; }
    public void setUserGroupType(String userGroupType) { this.userGroupType = userGroupType; }
    public String getUserGroupId() { return userGroupId; }
    public void setUserGroupId(String userGroupId) { this.userGroupId = userGroupId; }
    public List<String> getAddUsers() { return addUsers; }
    public void setAddUsers(List<String> addUsers) { this.addUsers = addUsers; }
    public List<String> getDeleteUsers() { return deleteUsers; }
    public void setDeleteUsers(List<String> deleteUsers) { this.deleteUsers = deleteUsers; }
    public List<String> getReplaceUsers() { return replaceUsers; }
    public void setReplaceUsers(List<String> replaceUsers) { this.replaceUsers = replaceUsers; }
}
