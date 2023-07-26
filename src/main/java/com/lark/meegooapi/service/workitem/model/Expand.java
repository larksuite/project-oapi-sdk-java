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


public class Expand {
    /**
     *
     */
    @SerializedName("need_workflow")
    private Boolean needWorkflow;

    /**
     *
     */
    @SerializedName("relation_fields_detail")
    private Boolean relationFieldsDetail;

    /**
     *
     */
    @SerializedName("need_multi_text")
    private Boolean needMultiText;

    /**
     *
     */
    @SerializedName("need_user_detail")
    private Boolean needUserDetail;

    /**
     *
     */
    @SerializedName("need_sub_task_parent")
    private Boolean needSubTaskParent;

    public Boolean getNeedWorkflow() {
        return this.needWorkflow;
    }

    public void setNeedWorkflow(Boolean needWorkflow) {
        this.needWorkflow = needWorkflow;
    }

    public Boolean getRelationFieldsDetail() {
        return this.relationFieldsDetail;
    }

    public void setRelationFieldsDetail(Boolean relationFieldsDetail) {
        this.relationFieldsDetail = relationFieldsDetail;
    }

    public Boolean getNeedMultiText() {
        return this.needMultiText;
    }

    public void setNeedMultiText(Boolean needMultiText) {
        this.needMultiText = needMultiText;
    }

    public Boolean getNeedUserDetail() {
        return this.needUserDetail;
    }

    public void setNeedUserDetail(Boolean needUserDetail) {
        this.needUserDetail = needUserDetail;
    }

    public Boolean getNeedSubTaskParent() {
        return this.needSubTaskParent;
    }

    public void setNeedSubTaskParent(Boolean needSubTaskParent) {
        this.needSubTaskParent = needSubTaskParent;
    }

}