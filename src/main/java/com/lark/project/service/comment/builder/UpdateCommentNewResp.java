package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

public class UpdateCommentNewResp extends BaseResponse {
    @SerializedName("data")
    private Object data;

    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
}
