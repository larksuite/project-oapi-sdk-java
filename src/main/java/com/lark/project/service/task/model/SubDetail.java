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

package com.lark.project.service.task.model;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.SubTask;


public class SubDetail {
    @SerializedName("work_item_id")
    private Long workItemID;

    @SerializedName("work_item_name")
    private String workItemName;

    @SerializedName("node_id")
    private String nodeID;

    @SerializedName("sub_task")
    private SubTask subTask;

    public Long getWorkItemID() {
        return this.workItemID;
    }

    public void setWorkItemID(Long workItemID) {
        this.workItemID = workItemID;
    }

    public String getWorkItemName() {
        return this.workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    public String getNodeID() {
        return this.nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public SubTask getSubTask() {
        return this.subTask;
    }

    public void setSubTask(SubTask subTask) {
        this.subTask = subTask;
    }

}