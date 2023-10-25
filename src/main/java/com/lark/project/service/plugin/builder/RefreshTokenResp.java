package com.lark.project.service.plugin.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.RawResponse;
import com.lark.project.service.plugin.model.RefreshToken;
import com.lark.project.service.plugin.model.TokenErr;

public class RefreshTokenResp {

    @SerializedName("data")
    private RefreshToken data;

    @SerializedName("error")
    private TokenErr err;

    private RawResponse rawResponse;
    private Object request;

    public RefreshToken getData() {
        return data;
    }

    public void setData(RefreshToken data) {
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
