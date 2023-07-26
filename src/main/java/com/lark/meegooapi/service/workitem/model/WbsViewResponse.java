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
import com.lark.meegooapi.service.common.model.UserDetail;

import java.util.List;


public class WbsViewResponse {
    /**
     *
     */
    @SerializedName("template_key")
    private String templateKey;

    /**
     *
     */
    @SerializedName("related_sub_work_items")
    private List<WBSWorkItem> relatedSubWorkItems;

    /**
     *
     */
    @SerializedName("template_version")
    private Long templateVersion;

    /**
     *
     */
    @SerializedName("template_name")
    private String templateName;

    /**
     *
     */
    @SerializedName("template_id")
    private String templateID;

    /**
     *
     */
    @SerializedName("related_parent_work_item")
    private WBSParentWorkItem relatedParentWorkItem;

    /**
     *
     */
    @SerializedName("user_details")
    private List<UserDetail> userDetails;

    public String getTemplateKey() {
        return this.templateKey;
    }

    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    public List<WBSWorkItem> getRelatedSubWorkItems() {
        return this.relatedSubWorkItems;
    }

    public void setRelatedSubWorkItems(List<WBSWorkItem> relatedSubWorkItems) {
        this.relatedSubWorkItems = relatedSubWorkItems;
    }

    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public void setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateID() {
        return this.templateID;
    }

    public void setTemplateID(String templateID) {
        this.templateID = templateID;
    }

    public WBSParentWorkItem getRelatedParentWorkItem() {
        return this.relatedParentWorkItem;
    }

    public void setRelatedParentWorkItem(WBSParentWorkItem relatedParentWorkItem) {
        this.relatedParentWorkItem = relatedParentWorkItem;
    }

    public List<UserDetail> getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(List<UserDetail> userDetails) {
        this.userDetails = userDetails;
    }

}