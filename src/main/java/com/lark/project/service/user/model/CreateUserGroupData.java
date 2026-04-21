package com.lark.project.service.user.model;

import com.google.gson.annotations.SerializedName;

public class CreateUserGroupData {
    @SerializedName("id")
    private String id;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}
