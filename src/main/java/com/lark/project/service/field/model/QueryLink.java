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

package com.lark.project.service.field.model;

import com.google.gson.annotations.SerializedName;


public class QueryLink {
    /**
     *
     */
    @SerializedName("url")
    private String url;

    /**
     *
     */
    @SerializedName("method")
    private String method;

    /**
     *
     */
    @SerializedName("headers")
    private Object headers;

    /**
     *
     */
    @SerializedName("body")
    private Object body;

    /**
     *
     */
    @SerializedName("params")
    private Object params;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Object getHeaders() {
        return this.headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public Object getBody() {
        return this.body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public Object getParams() {
        return this.params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

}