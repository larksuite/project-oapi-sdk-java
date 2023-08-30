package com.lark.project.service.plugin.builder;

import com.lark.project.core.annotation.Body;
import com.lark.project.core.request.BaseRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetPluginTokenReq extends BaseRequest {
    @Body
    private GetPluginTokenReqBody body;


    public GetPluginTokenReq() {
    }

    public GetPluginTokenReq(GetPluginTokenReq.Builder builder) {
        this.body = builder.body;
        this.setHeaders(builder.headers);
    }

    public static GetPluginTokenReq.Builder newBuilder() {
        return new GetPluginTokenReq.Builder();
    }

    public GetPluginTokenReqBody getGetAccessTokenReqBody() {
        return this.body;
    }

    public void setGetAccessTokenReqBody(GetPluginTokenReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private Map<String, List<String>> headers;
        private GetPluginTokenReqBody body;

        public Builder() {
            headers = new HashMap<>();
            body = new GetPluginTokenReqBody();
        }

        public GetPluginTokenReq.Builder pluginID(String pluginID) {
            this.body.setPluginID(pluginID);
            return this;
        }

        public GetPluginTokenReq.Builder pluginSecret(String pluginSecret) {
            this.body.setPluginSecret(pluginSecret);
            return this;
        }

        public GetPluginTokenReq.Builder type(int type) {
            this.body.setType(type);
            return this;
        }

        public GetPluginTokenReq build() {
            return new GetPluginTokenReq(this);
        }
    }
}
