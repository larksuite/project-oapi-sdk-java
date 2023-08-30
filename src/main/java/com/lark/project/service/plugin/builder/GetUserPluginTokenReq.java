package com.lark.project.service.plugin.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.core.request.BaseRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetUserPluginTokenReq extends BaseRequest {

    @Body
    private GetUserPluginTokenReqBody body;


    public GetUserPluginTokenReq() {
    }

    public GetUserPluginTokenReq(GetUserPluginTokenReq.Builder builder) {
        this.body = builder.body;
        this.setHeaders(builder.headers);
    }

    public static GetUserPluginTokenReq.Builder newBuilder() {
        return new GetUserPluginTokenReq.Builder();
    }

    public GetUserPluginTokenReqBody getGetUserPluginTokenReqBody() {
        return this.body;
    }

    public void setGetUserPluginTokenReqBody(GetUserPluginTokenReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private GetUserPluginTokenReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new GetUserPluginTokenReqBody();
        }

        public GetUserPluginTokenReq.Builder code(String code) {
            this.body.setCode(code);
            return this;
        }

        public GetUserPluginTokenReq.Builder grantType(String grantType) {
            this.body.setGrantType(grantType);
            return this;
        }

        public GetUserPluginTokenReq build() {
            return new GetUserPluginTokenReq(this);
        }
    }
}
