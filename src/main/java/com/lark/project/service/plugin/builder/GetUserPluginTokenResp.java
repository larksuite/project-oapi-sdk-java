package com.lark.project.service.plugin.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.RawResponse;
import com.lark.project.service.plugin.model.TokenErr;
import com.lark.project.service.plugin.model.UserPluginToken;

public class GetUserPluginTokenResp {

    @SerializedName("data")
    private UserPluginToken data;

    @SerializedName("error")
    private TokenErr err;

    private RawResponse rawResponse;
    private Object request;

    public UserPluginToken getData() {
        return data;
    }

    public void setData(UserPluginToken data) {
        this.data = data;
    }

    public TokenErr getErr() {
        return err;
    }

    public void setErr(TokenErr err) {
        this.err = err;
    }

    public RawResponse getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(RawResponse rawResponse) {
        this.rawResponse = rawResponse;
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }
}
