/*
 * Copyright (c) 2023 Lark Technologies Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lark.project.core;


import com.lark.project.core.cache.ICache;
import com.lark.project.core.httpclient.IHttpTransport;
import com.lark.project.core.token.AccessTokenType;

public class Config {

    private String baseUrl;
    private long requestTimeOut;
    private ICache cache;
    private boolean disableTokenCache;
    private String tokenCache;
    private String pluginID;
    private String pluginSecret;
    private IHttpTransport httpTransport;
    private boolean logReqAtDebug;
    private AccessTokenType accessTokenType;

    public Config() {
    }

    public IHttpTransport getHttpTransport() {
        return httpTransport;
    }

    public void setHttpTransport(IHttpTransport httpTransport) {
        this.httpTransport = httpTransport;
    }

    public boolean isLogReqAtDebug() {
        return logReqAtDebug;
    }

    public void setLogReqAtDebug(boolean logReqAtDebug) {
        this.logReqAtDebug = logReqAtDebug;
    }

    public long getRequestTimeOut() {
        return requestTimeOut;
    }

    public void setRequestTimeOut(long requestTimeOut) {
        this.requestTimeOut = requestTimeOut;
    }

    public ICache getCache() {
        return cache;
    }

    public void setCache(ICache cache) {
        this.cache = cache;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public boolean isDisableTokenCache() {
        return disableTokenCache;
    }

    public void setDisableTokenCache(boolean disableTokenCache) {
        this.disableTokenCache = disableTokenCache;
    }

    public String getTokenCache() {
        return tokenCache;
    }

    public void setTokenCache(String tokenCache) {
        this.tokenCache = tokenCache;
    }

    public String getPluginID() {
        return pluginID;
    }

    public void setPluginID(String pluginID) {
        this.pluginID = pluginID;
    }

    public String getPluginSecret() {
        return pluginSecret;
    }

    public void setPluginSecret(String pluginSecret) {
        this.pluginSecret = pluginSecret;
    }

    public AccessTokenType getAccessTokenType() {
        return accessTokenType;
    }

    public void setAccessTokenType(AccessTokenType accessTokenType) {
        this.accessTokenType = accessTokenType;
    }
}