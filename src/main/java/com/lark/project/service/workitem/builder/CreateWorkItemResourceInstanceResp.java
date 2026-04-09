package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

import java.util.List;

public class CreateWorkItemResourceInstanceResp extends BaseResponse {
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return this.data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        @SerializedName("work_item_id")
        private Long workItemID;
        
        @SerializedName("ignore_create_info")
        private IgnoreCreateInfo ignoreCreateInfo;

        public Long getWorkItemID() {
            return workItemID;
        }

        public void setWorkItemID(Long workItemID) {
            this.workItemID = workItemID;
        }

        public IgnoreCreateInfo getIgnoreCreateInfo() {
            return ignoreCreateInfo;
        }

        public void setIgnoreCreateInfo(IgnoreCreateInfo ignoreCreateInfo) {
            this.ignoreCreateInfo = ignoreCreateInfo;
        }
    }

    public static class IgnoreCreateInfo {
        @SerializedName("role_ids")
        private List<String> roleIds;
        
        @SerializedName("field_keys")
        private List<String> fieldKeys;

        public List<String> getRoleIds() {
            return roleIds;
        }

        public void setRoleIds(List<String> roleIds) {
            this.roleIds = roleIds;
        }

        public List<String> getFieldKeys() {
            return fieldKeys;
        }

        public void setFieldKeys(List<String> fieldKeys) {
            this.fieldKeys = fieldKeys;
        }
    }
}