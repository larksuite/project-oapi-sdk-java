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
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.user.model.RoleOwner;

import java.util.List;
import java.util.Map;


public class WBSWorkItem {
    /**
     *
     */
    @SerializedName("node_uuid")
    private String nodeUUID;

    /**
     *
     */
    @SerializedName("work_item_id")
    private Long workItemID;

    /**
     *
     */
    @SerializedName("type")
    private String type;

    /**
     *
     */
    @SerializedName("wbs_status")
    private String wbsStatus;

    /**
     *
     */
    @SerializedName("wbs_status_map")
    private Map<String, String> wbsStatusMap;

    /**
     *
     */
    @SerializedName("sub_work_item")
    private List<WBSWorkItem> subWorkItem;

    /**
     *
     */
    @SerializedName("name")
    private String name;

    /**
     *
     */
    @SerializedName("deliverable")
    private List<FieldValuePair> deliverable;

    /**
     *
     */
    @SerializedName("schedule")
    private Schedule schedule;

    /**
     *
     */
    @SerializedName("schedules")
    private List<Schedule> schedules;

    /**
     *
     */
    @SerializedName("points")
    private Float points;

    /**
     *
     */
    @SerializedName("role_owners")
    private List<RoleOwner> roleOwners;

    /**
     *
     */
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;

    /**
     *
     */
    @SerializedName("milestone")
    private Boolean milestone;

    public String getNodeUUID() {
        return this.nodeUUID;
    }

    public void setNodeUUID(String nodeUUID) {
        this.nodeUUID = nodeUUID;
    }

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWbsStatus() {
        return this.wbsStatus;
    }

    public void setWbsStatus(String wbsStatus) {
        this.wbsStatus = wbsStatus;
    }

    public Map<String, String> getWbsStatusMap() {
        return this.wbsStatusMap;
    }

    public void setWbsStatusMap(Map<String, String> wbsStatusMap) {
        this.wbsStatusMap = wbsStatusMap;
    }

    public List<WBSWorkItem> getSubWorkItem() {
        return this.subWorkItem;
    }

    public void setSubWorkItem(List<WBSWorkItem> subWorkItem) {
        this.subWorkItem = subWorkItem;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FieldValuePair> getDeliverable() {
        return this.deliverable;
    }

    public void setDeliverable(List<FieldValuePair> deliverable) {
        this.deliverable = deliverable;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Schedule> getSchedules() {
        return this.schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Float getPoints() {
        return this.points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public List<RoleOwner> getRoleOwners() {
        return this.roleOwners;
    }

    public void setRoleOwners(List<RoleOwner> roleOwners) {
        this.roleOwners = roleOwners;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public Boolean getMilestone() {
        return this.milestone;
    }

    public void setMilestone(Boolean milestone) {
        this.milestone = milestone;
    }

}