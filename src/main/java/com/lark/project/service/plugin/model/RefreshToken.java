package com.lark.project.service.plugin.model;

import com.google.gson.annotations.SerializedName;

public class RefreshToken {

    @SerializedName("expire_time")
    private int expireTime;

    @SerializedName("token")
    private String token;

    @SerializedName("refresh_token")
    private String refreshToken;

    @SerializedName("refresh_token_expire_time")
    private int refreshTokenExpireTime;

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

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public int getRefreshTokenExpireTime() {
        return refreshTokenExpireTime;
    }

    public void setRefreshTokenExpireTime(int refreshTokenExpireTime) {
        this.refreshTokenExpireTime = refreshTokenExpireTime;
    }
}
