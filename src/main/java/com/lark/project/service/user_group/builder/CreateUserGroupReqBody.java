package com.lark.project.service.user_group.builder;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CreateUserGroupReqBody {
    @SerializedName("name")
    private String name;
    @SerializedName("users")
    private List<String> users;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<String> getUsers() { return users; }
    public void setUsers(List<String> users) { this.users = users; }
}
