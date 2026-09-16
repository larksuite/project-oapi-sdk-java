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
import com.lark.project.service.field.model.FieldValuePair;
import com.lark.project.service.workitem.model.ParentProduct;
import com.lark.project.service.workitem.model.ContainedWorkItems;

import java.util.List;


public class UpdateWorkItemReqBody {
    @SerializedName("update_fields")
    private List<FieldValuePair> updateFields;
    @SerializedName("parent_product")
    private ParentProduct parentProduct;
    @SerializedName("contained_work_items")
    private ContainedWorkItems containedWorkItems;

    public List<FieldValuePair> getUpdateFields() {
        return this.updateFields;
    }

    public void setUpdateFields(List<FieldValuePair> updateFields) {
        this.updateFields = updateFields;
    }

    public ParentProduct getParentProduct() {
        return parentProduct;
    }

    public void setParentProduct(ParentProduct parentProduct) {
        this.parentProduct = parentProduct;
    }

    public ContainedWorkItems getContainedWorkItems() {
        return containedWorkItems;
    }

    public void setContainedWorkItems(ContainedWorkItems containedWorkItems) {
        this.containedWorkItems = containedWorkItems;
    }
}
