package com.lark.meegooapi.service.plugin.builder;

import com.google.gson.annotations.SerializedName;

public class RefreshTokenReqBody {

    @SerializedName("refresh_token")
    private String refreshToken;

    @SerializedName("type")
    private int type;

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
