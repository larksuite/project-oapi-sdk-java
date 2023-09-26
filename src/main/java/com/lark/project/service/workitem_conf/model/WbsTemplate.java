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

package com.lark.project.service.workitem_conf.model;

import com.google.gson.annotations.SerializedName;


public class WbsTemplate {
    /**
     *
     */
    @SerializedName("template_key")
    private String templateKey;

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
    @SerializedName("is_disabled")
    private Boolean isDisabled;

    /**
     *
     */
    @SerializedName("version")
    private Long version;

    /**
     *
     */
    @SerializedName("workflow_conf")
    private WorkflowConf workflowConf;

    public String getTemplateKey() {
        return this.templateKey;
    }

    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
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

    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public WorkflowConf getWorkflowConf() {
        return this.workflowConf;
    }

    public void setWorkflowConf(WorkflowConf workflowConf) {
        this.workflowConf = workflowConf;
    }

}