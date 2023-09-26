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

import com.lark.project.core.Constants;
import com.lark.project.core.utils.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RequestOptions {
    private boolean supportUpload;

    private boolean supportDownLoad;

    private Map<String, List<String>> headers;

    public RequestOptions() {
        this.headers = new HashMap<>();
    }

    public RequestOptions(Builder builder) {
        this.supportDownLoad = builder.supportDownLoad;
        this.supportUpload = builder.supportUpload;
        this.headers = builder.headers;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }

    public static final class Builder {

        private boolean supportUpload;
        private boolean supportDownLoad;
        private Map<String, List<String>> headers;

        private Builder() {
            headers = new HashMap<>();
        }

        public Builder headers(Map<String, List<String>> headers) {
            if (headers != null) {
                for (Map.Entry<String, List<String>> header : headers.entrySet()) {
                    List<String> values = this.headers.get(header.getKey());
                    if (values == null) {
                        values = new ArrayList<>();
                        this.headers.put(header.getKey(), values);
                    }
                    for (String value : header.getValue()) {
                        values.add(value);
                    }
                }
            }
            return this;
        }

        public Builder userKey(String userKey) {
            headers.put(Constants.HTTP_HEADER_USER_KEY, Lists.newArrayList(userKey));
            return this;
        }

        public Builder accessToken(String accessToken) {
            headers.put(Constants.HTTP_HEADER_ACCESS_TOKEN, Lists.newArrayList(accessToken));
            return this;
        }

        public Builder idemUUID(String idemUUID) {
            headers.put(Constants.HTTP_HEADER_IDEM_UUID, Lists.newArrayList(idemUUID));
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

        public RequestOptions build() {
            return new RequestOptions(this);
        }
    }

}
