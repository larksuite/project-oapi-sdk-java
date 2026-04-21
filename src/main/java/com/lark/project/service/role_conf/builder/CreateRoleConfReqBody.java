package com.lark.project.service.role_conf.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.role_conf.model.RoleConfCreate;

public class CreateRoleConfReqBody {
    @SerializedName("role")
    private RoleConfCreate role;

    public RoleConfCreate getRole() {
        return role;
    }

    public void setRole(RoleConfCreate role) {
        this.role = role;
    }
}
