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


public class MultiSignalDetail {
    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("status")
    private String status;

    @SerializedName("view_link")
    private String viewLink;

    @SerializedName("query_link")
    private QueryLink queryLink;

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getViewLink() {
        return this.viewLink;
    }

    public void setViewLink(String viewLink) {
        this.viewLink = viewLink;
    }

    public QueryLink getQueryLink() {
        return this.queryLink;
    }

    public void setQueryLink(QueryLink queryLink) {
        this.queryLink = queryLink;
    }

}