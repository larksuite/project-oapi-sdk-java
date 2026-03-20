package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.core.response.BaseResponse;

public class BotJoinChatResp extends BaseResponse {
    @SerializedName("data")
    private BotJoinChatRespBody data;

    public BotJoinChatRespBody getData() {
        return this.data;
    }

    public void setData(BotJoinChatRespBody data) {
        this.data = data;
    }
}
