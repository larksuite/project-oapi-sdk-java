package com.lark.project.service.plugin.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.core.request.BaseRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RefreshTokenReq extends BaseRequest {

    @Body
    private RefreshTokenReqBody body;


    public RefreshTokenReq() {
    }

    public RefreshTokenReq(RefreshTokenReq.Builder builder) {
        this.body = builder.body;
        this.setHeaders(builder.headers);
    }

    public static RefreshTokenReq.Builder newBuilder() {
        return new RefreshTokenReq.Builder();
    }

    public RefreshTokenReqBody getRefreshTokenReqBody() {
        return this.body;
    }

    public void setRefreshTokenReqBody(RefreshTokenReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private RefreshTokenReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new RefreshTokenReqBody();
        }

        public RefreshTokenReq.Builder refreshToken(String refreshToken) {
            this.body.setRefreshToken(refreshToken);
            return this;
        }

        public RefreshTokenReq.Builder type(int type) {
            this.body.setType(type);
            return this;
        }

        public RefreshTokenReq build() {
            return new RefreshTokenReq(this);
        }
    }
}
