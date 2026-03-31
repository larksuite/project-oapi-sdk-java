package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BotJoinChatRespBody {

    @SerializedName("chat_id")
    private String chatId;

    @SerializedName("failed_members")
    private List<String> failedMembers;

    @SerializedName("success_members")
    private List<String> successMembers;

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public List<String> getFailedMembers() {
        return failedMembers;
    }

    public void setFailedMembers(List<String> failedMembers) {
        this.failedMembers = failedMembers;
    }

    public List<String> getSuccessMembers() {
        return successMembers;
    }

    public void setSuccessMembers(List<String> successMembers) {
        this.successMembers = successMembers;
    }
}
