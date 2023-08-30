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

package com.lark.project.core.request;

import java.util.List;
import java.util.Map;

public class RequestOptions {

    private String pluginAccessToken;
    private String virtualPluginAccessToken;
    private String userPluginAccessToken;
    private String requestId;
    private boolean supportUpload;
    private boolean supportDownLoad;
    private Boolean supportLong2String;
    private Map<String, List<String>> headers;

    public RequestOptions() {
    }

    public RequestOptions(Builder builder) {
        this.pluginAccessToken = builder.pluginAccessToken;
        this.virtualPluginAccessToken = builder.virtualPluginAccessToken;
        this.userPluginAccessToken = builder.userPluginAccessToken;
        this.requestId = builder.requestId;
        this.supportDownLoad = builder.supportDownLoad;
        this.supportUpload = builder.supportUpload;
        this.headers = builder.headers;
        this.supportLong2String = builder.supportLong2String;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public void setSupportLong2String(boolean supportLong2String) {
        this.supportLong2String = supportLong2String;
    }

    public Boolean isSupportLong2String() {
        return supportLong2String;
    }

    public boolean isSupportUpload() {
        return supportUpload;
    }

    public void setSupportUpload(boolean supportUpload) {
        this.supportUpload = supportUpload;
    }

    public boolean isSupportDownLoad() {
        return supportDownLoad;
    }

    public void setSupportDownLoad(boolean supportDownLoad) {
        this.supportDownLoad = supportDownLoad;
    }

    public String getPluginAccessToken() {
        return pluginAccessToken;
    }

    public void setPluginAccessToken(String pluginAccessToken) {
        this.pluginAccessToken = pluginAccessToken;
    }

    public String getVirtualPluginAccessToken() {
        return virtualPluginAccessToken;
    }

    public void setVirtualPluginAccessToken(String virtualPluginAccessToken) {
        this.virtualPluginAccessToken = virtualPluginAccessToken;
    }

    public String getUserPluginAccessToken() {
        return userPluginAccessToken;
    }

    public void setUserPluginAccessToken(String appAccessToken) {
        this.userPluginAccessToken = userPluginAccessToken;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }

    public static final class Builder {

        private String pluginAccessToken;
        private String virtualPluginAccessToken;
        private String userPluginAccessToken;
        private String requestId;
        private boolean supportUpload;
        private boolean supportDownLoad;
        private Boolean supportLong2String;
        private Map<String, List<String>> headers;

        public Builder supportLong2String(Boolean supportLong2String) {
            this.supportLong2String = supportLong2String;
            return this;
        }

        public Builder pluginAccessToken(String pluginAccessToken) {
            this.pluginAccessToken = pluginAccessToken;
            return this;
        }

        public Builder virtualPluginAccessToken(String virtualPluginAccessToken) {
            this.virtualPluginAccessToken = virtualPluginAccessToken;
            return this;
        }

        public Builder userPluginAccessToken(String userPluginAccessToken) {
            this.userPluginAccessToken = userPluginAccessToken;
            return this;
        }

        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder supportUpload() {
            this.supportUpload = true;
            return this;
        }

        public Builder supportDownLoad() {
            this.supportDownLoad = true;
            return this;
        }

        public Builder headers(Map<String, List<String>> headers) {
            this.headers = headers;
            return this;
        }

        public RequestOptions build() {
            return new RequestOptions(this);
        }
    }

}
