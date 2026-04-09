package com.lark.project.service.role_conf.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.role_conf.model.RoleConfUpdate;

public class UpdateRoleConfReqBody {
    @SerializedName("role_id")
    private String roleId;
    @SerializedName("role_alias")
    private String roleAlias;
    @SerializedName("role")
    private RoleConfUpdate role;

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

    public RoleConfUpdate getRole() {
        return role;
    }

    public void setRole(RoleConfUpdate role) {
        this.role = role;
    }
}
