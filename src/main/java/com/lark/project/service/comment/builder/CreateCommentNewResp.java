package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

public class CreateCommentNewResp extends BaseResponse {
    @SerializedName("data")
    private CreateCommentNewRespData data;

    public CreateCommentNewRespData getData() { return data; }
    public void setData(CreateCommentNewRespData data) { this.data = data; }
}
