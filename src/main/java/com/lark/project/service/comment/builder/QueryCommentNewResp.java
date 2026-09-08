package com.lark.project.service.comment.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

public class QueryCommentNewResp extends BaseResponse {
    @SerializedName("data")
    private QueryCommentNewRespData data;

    public QueryCommentNewRespData getData() { return data; }
    public void setData(QueryCommentNewRespData data) { this.data = data; }
}
