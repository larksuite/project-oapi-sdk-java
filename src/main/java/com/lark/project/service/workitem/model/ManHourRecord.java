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

package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;


public class ManHourRecord {
    /**
     *
     */
    @SerializedName("id")
    private Long id;

    /**
     *
     */
    @SerializedName("related_work_item_id")
    private Long relatedWorkItemID;

    /**
     *
     */
    @SerializedName("related_work_item_type_key")
    private String relatedWorkItemTypeKey;

    /**
     *
     */
    @SerializedName("related_work_item_name")
    private String relatedWorkItemName;

    /**
     *
     */
    @SerializedName("resource_type")
    private String resourceType;

    /**
     *
     */
    @SerializedName("resource_id")
    private String resourceID;

    /**
     *
     */
    @SerializedName("work_description")
    private String workDescription;

    /**
     *
     */
    @SerializedName("work_time")
    private Float workTime;

    /**
     *
     */
    @SerializedName("work_user_key")
    private String workUserKey;

    /**
     *
     */
    @SerializedName("created_at")
    private Long createdAt;

    /**
     *
     */
    @SerializedName("updated_at")
    private Long updatedAt;

    /**
     *
     */
    @SerializedName("resource_name")
    private String resourceName;

    /**
     *
     */
    @SerializedName("work_date")
    private Long workDate;

    public Long getID() {
        return this.id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public Long getRelatedWorkItemID() {
        return this.relatedWorkItemID;
    }

    public void setRelatedWorkItemID(Long relatedWorkItemID) {
        this.relatedWorkItemID = relatedWorkItemID;
    }

    public String getRelatedWorkItemTypeKey() {
        return this.relatedWorkItemTypeKey;
    }

    public void setRelatedWorkItemTypeKey(String relatedWorkItemTypeKey) {
        this.relatedWorkItemTypeKey = relatedWorkItemTypeKey;
    }

    public String getRelatedWorkItemName() {
        return this.relatedWorkItemName;
    }

    public void setRelatedWorkItemName(String relatedWorkItemName) {
        this.relatedWorkItemName = relatedWorkItemName;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceID() {
        return this.resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public String getWorkDescription() {
        return this.workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public Float getWorkTime() {
        return this.workTime;
    }

    public void setWorkTime(Float workTime) {
        this.workTime = workTime;
    }

    public String getWorkUserKey() {
        return this.workUserKey;
    }

    public void setWorkUserKey(String workUserKey) {
        this.workUserKey = workUserKey;
    }

    public Long getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Long getWorkDate() {
        return this.workDate;
    }

    public void setWorkDate(Long workDate) {
        this.workDate = workDate;
    }

}