package com.lark.meegooapi.service.plugin.model;

import com.google.gson.annotations.SerializedName;

public class UserPluginToken {

    @SerializedName("expire_time")
    private int expireTime;

    @SerializedName("token")
    private String token;

    @SerializedName("refresh_token")
    private String refreshToken;

    @SerializedName("refresh_token_expire_time")
    private int refreshTokenExpireTime;

    @SerializedName("user_key")
    private String userKey;

    @SerializedName("tenant_key")
    private String tenantKey;

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

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getTenantKey() {
        return tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }
}
