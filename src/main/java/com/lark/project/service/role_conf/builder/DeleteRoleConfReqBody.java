package com.lark.project.service.role_conf.builder;

import com.google.gson.annotations.SerializedName;

public class DeleteRoleConfReqBody {
    @SerializedName("role_id")
    private String roleId;
    @SerializedName("role_alias")
    private String roleAlias;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleAlias() {
        return roleAlias;
    }

    public void setRoleAlias(String roleAlias) {
        this.roleAlias = roleAlias;
    }
}
