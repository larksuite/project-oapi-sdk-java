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

package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.Expand;


public class SearchByRelationReqBody {
    @SerializedName("relation_work_item_type_key")
    private String relationWorkItemTypeKey;
    @SerializedName("relation_key")
    private String relationKey;
    @SerializedName("page_num")
    private Long pageNum;
    @SerializedName("page_size")
    private Long pageSize;
    @SerializedName("relation_type")
    private Integer relationType;
    @SerializedName("expand")
    private Expand expand;

    public String getRelationWorkItemTypeKey() {
        return this.relationWorkItemTypeKey;
    }

    public void setRelationWorkItemTypeKey(String relationWorkItemTypeKey) {
        this.relationWorkItemTypeKey = relationWorkItemTypeKey;
    }

    public String getRelationKey() {
        return this.relationKey;
    }

    public void setRelationKey(String relationKey) {
        this.relationKey = relationKey;
    }

    public Long getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Long pageNum) {
        this.pageNum = pageNum;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getRelationType() {
        return this.relationType;
    }

    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public Expand getExpand() {
        return this.expand;
    }

    public void setExpand(Expand expand) {
        this.expand = expand;
    }
}
