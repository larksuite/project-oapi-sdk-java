package com.lark.project.service.plugin.model;

import com.google.gson.annotations.SerializedName;

public class PluginToken {
    @SerializedName("expire_time")
    private int expireTime;

    @SerializedName("token")
    private String token;

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
