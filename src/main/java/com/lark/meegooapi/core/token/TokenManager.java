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

package com.lark.meegooapi.core.token;

import com.lark.meegooapi.core.Config;
import com.lark.meegooapi.core.Transport;
import com.lark.meegooapi.core.cache.ICache;
import com.lark.meegooapi.core.response.GetAccessTokenResp;
import com.lark.meegooapi.core.response.RawResponse;
import com.lark.meegooapi.core.utils.Jsons;
import com.lark.meegooapi.core.utils.Strings;
import com.lark.meegooapi.core.utils.UnmarshalRespUtil;
import com.lark.meegooapi.service.plugin.builder.GetPluginTokenReq;
import com.lark.meegooapi.service.plugin.builder.GetPluginTokenResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class TokenManager {

    private static final Logger log = LoggerFactory.getLogger(TokenManager.class);
    private static final int expiryDeltaOfSecond = 3 * 60;
    private static final String pluginAccessTokenKeyPrefix = "plugin_access_token";
    private static final String virtualPluginAccessTokenKeyPrefix = "virtual_plugin_access_token";

    private ICache cache;

    public TokenManager(ICache cache) {
        this.cache = cache;
    }

    private String getPluginAccessTokenKey(String pluginID) {
        return String.format("%s-%s", pluginAccessTokenKeyPrefix, pluginID);
    }

    public String getPluginAccessTokenThenCache(Config config) throws Exception {
        // 缓存里存在则直接返回
        String token = cache.get(getPluginAccessTokenKey(config.getPluginID()));
        if (Strings.isNotEmpty(token)) {
            return token;
        }

        GetAccessTokenResp resp = getInternalAccessToken(config, 0);
        token = resp.getToken();
        int timeOut = resp.getExpireTime();
        // 缓存
        cache.set(getPluginAccessTokenKey(config.getPluginID()), token, timeOut - expiryDeltaOfSecond,
                TimeUnit.SECONDS);
        return token;
    }

    private String getVirtualPluginAccessTokenKey(String pluginID) {
        return String.format("%s-%s", virtualPluginAccessTokenKeyPrefix, pluginID);
    }

    public String getVirtualPluginAccessTokenThenCache(Config config) throws Exception {
        // 缓存中存在，则直接返回
        String token = cache.get(getVirtualPluginAccessTokenKey(config.getPluginID()));
        if (Strings.isNotEmpty(token)) {
            return token;
        }

        GetAccessTokenResp resp = getInternalAccessToken(config, 1);
        token = resp.getToken();
        int timeOut = resp.getExpireTime();
        cache.set(getVirtualPluginAccessTokenKey(config.getPluginID()), token,
                timeOut - expiryDeltaOfSecond, TimeUnit.SECONDS);
        return token;
    }

    public GetAccessTokenResp getInternalAccessToken(Config config, int type) throws Exception {

        // 创建请求对象
        GetPluginTokenReq req = GetPluginTokenReq.newBuilder()
                .pluginID(config.getPluginID())
                .pluginSecret(config.getPluginSecret())
                .type(type)
                .build();
        RawResponse httpResponse = Transport.send(config, null, "POST"
                , "/open_api/authen/plugin_token"
                , true
                , req);

        // 反序列化
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
