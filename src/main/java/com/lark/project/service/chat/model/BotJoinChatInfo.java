/*
 * Copyright (c) 2023 Lark Technologies Pte. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lark.project.service.chat.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class BotJoinChatInfo {
    @SerializedName("chat_id")
    private String chatID;

    @SerializedName("success_members")
    private List<String> successMembers;

    @SerializedName("failed_members")
    private List<String> failedMembers;

    public String getChatID() {
        return this.chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }

    public List<String> getSuccessMembers() {
        return this.successMembers;
    }

    public void setSuccessMembers(List<String> successMembers) {
        this.successMembers = successMembers;
    }

    public List<String> getFailedMembers() {
        return this.failedMembers;
    }

    public void setFailedMembers(List<String> failedMembers) {
        this.failedMembers = failedMembers;
    }

}