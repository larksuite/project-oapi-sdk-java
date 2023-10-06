/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.project.core.token;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.cache.ICache;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.GetAccessTokenResp;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Jsons;
import com.lark.project.core.utils.Strings;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.plugin.builder.GetPluginTokenReq;
import com.lark.project.service.plugin.builder.GetPluginTokenResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class TokenManager {

    private static final Logger log = LoggerFactory.getLogger(TokenManager.class);
    private static final int EXPIRY_DELTA_OF_SECOND = 3 * 60;
    private static final String ACCESS_TOKEN_KEY_PREFIX = "access_token";

    private ICache cache;

    public TokenManager(ICache cache) {
        this.cache = cache;
    }

    private String getAccessTokenKey(String pluginID) {
        return String.format("%s-%s", ACCESS_TOKEN_KEY_PREFIX, pluginID);
    }

    public String getAccessTokenThenCache(Config config) throws Exception {
        String token = cache.get(getAccessTokenKey(config.getPluginID()));
        if (Strings.isNotEmpty(token)) {
            return token;
        }

        GetAccessTokenResp resp = getInternalAccessToken(config, config.getAccessTokenType().getValue());
        token = resp.getToken();
        int timeOut = resp.getExpireTime();
        cache.set(getAccessTokenKey(config.getPluginID()), token, timeOut - EXPIRY_DELTA_OF_SECOND,
                TimeUnit.SECONDS);
        return token;
    }

    public GetAccessTokenResp getInternalAccessToken(Config config, int type) throws Exception {

        GetPluginTokenReq req = GetPluginTokenReq.newBuilder()
                .pluginID(config.getPluginID())
                .pluginSecret(config.getPluginSecret())
                .type(type)
                .build();
        RawResponse httpResponse = Transport.doSend(config, new RequestOptions(), "POST"
                , "/open_api/authen/plugin_token"
                , true
                , req);

        GetPluginTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetPluginTokenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/projects"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }
        GetAccessTokenResp getAccessTokenResp = new GetAccessTokenResp();
        getAccessTokenResp.setToken(resp.getData().getToken());
        getAccessTokenResp.setExpireTime(resp.getData().getExpireTime());
        return getAccessTokenResp;
    }

}
