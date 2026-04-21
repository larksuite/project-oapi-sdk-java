package com.lark.project.service.user.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UserGroup {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("user_count")
    private Long userCount;
    @SerializedName("user_members")
    private List<String> userMembers;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getUserCount() { return userCount; }
    public void setUserCount(Long userCount) { this.userCount = userCount; }
    public List<String> getUserMembers() { return userMembers; }
    public void setUserMembers(List<String> userMembers) { this.userMembers = userMembers; }
}
