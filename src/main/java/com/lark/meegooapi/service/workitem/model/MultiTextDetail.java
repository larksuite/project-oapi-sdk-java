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

package com.lark.meegooapi.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MultiTextDetail {
    /**
     *
     */
    @SerializedName("doc")
    private String doc;

    /**
     *
     */
    @SerializedName("doc_text")
    private String docText;

    /**
     *
     */
    @SerializedName("is_empty")
    private Boolean isEmpty;

    /**
     *
     */
    @SerializedName("notify_user_list")
    private List<String> notifyUserList;

    /**
     *
     */
    @SerializedName("notify_user_type")
    private String notifyUserType;

    /**
     *
     */
    @SerializedName("doc_html")
    private String docHTML;

    public String getDoc() {
        return this.doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getDocText() {
        return this.docText;
    }

    public void setDocText(String docText) {
        this.docText = docText;
    }

    public Boolean getIsEmpty() {
        return this.isEmpty;
    }

    public void setIsEmpty(Boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public List<String> getNotifyUserList() {
        return this.notifyUserList;
    }

    public void setNotifyUserList(List<String> notifyUserList) {
        this.notifyUserList = notifyUserList;
    }

    public String getNotifyUserType() {
        return this.notifyUserType;
    }

    public void setNotifyUserType(String notifyUserType) {
        this.notifyUserType = notifyUserType;
    }

    public String getDocHTML() {
        return this.docHTML;
    }

    public void setDocHTML(String docHTML) {
        this.docHTML = docHTML;
    }

}