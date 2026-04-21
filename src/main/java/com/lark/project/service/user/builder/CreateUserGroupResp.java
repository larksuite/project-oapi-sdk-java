package com.lark.project.service.user.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;
import com.lark.project.service.user.model.CreateUserGroupData;

public class CreateUserGroupResp extends BaseResponse {
    @SerializedName("data")
    private CreateUserGroupData data;

    public CreateUserGroupData getData() { return data; }
    public void setData(CreateUserGroupData data) { this.data = data; }
}
