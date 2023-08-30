package com.lark.project.service.plugin.builder;

import com.google.gson.annotations.SerializedName;

public class GetUserPluginTokenReqBody {

    @SerializedName("code")
    private String code;

    @SerializedName("grant_type")
    private String grantType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }
}
