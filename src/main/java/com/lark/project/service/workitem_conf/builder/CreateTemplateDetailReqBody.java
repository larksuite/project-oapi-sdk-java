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

package com.lark.project.service.workitem_conf.builder;

import com.google.gson.annotations.SerializedName;


public class CreateTemplateDetailReqBody {
    @SerializedName("project_key")
    private String projectKey;
    @SerializedName("work_item_type_key")
    private String workItemTypeKey;
    @SerializedName("template_name")
    private String templateName;
    @SerializedName("copy_template_id")
    private Long copyTemplateID;

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getWorkItemTypeKey() {
        return this.workItemTypeKey;
    }

    public void setWorkItemTypeKey(String workItemTypeKey) {
        this.workItemTypeKey = workItemTypeKey;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Long getCopyTemplateID() {
        return this.copyTemplateID;
    }

    public void setCopyTemplateID(Long copyTemplateID) {
        this.copyTemplateID = copyTemplateID;
    }
}
