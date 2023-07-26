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

package com.lark.meegooapi.service.user.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class UserBasicInfo {
    /**
     *
     */
    @SerializedName("user_id")
    private Long userID;

    /**
     *
     */
    @SerializedName("user_key")
    private String userKey;

    /**
     *
     */
    @SerializedName("username")
    private String username;

    /**
     *
     */
    @SerializedName("email")
    private String email;

    /**
     *
     */
    @SerializedName("avatar_url")
    private String avatarUrl;

    /**
     *
     */
    @SerializedName("name_cn")
    private String nameCn;

    /**
     *
     */
    @SerializedName("name_en")
    private String nameEn;

    /**
     *
     */
    @SerializedName("out_id")
    private String outID;

    /**
     *
     */
    @SerializedName("channels")
    private List<Channel> channels;

    /**
     *
     */
    @SerializedName("status")
    private String status;

    public Long getUserID() {
        return this.userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserKey() {
        return this.userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getNameCn() {
        return this.nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return this.nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getOutID() {
        return this.outID;
    }

    public void setOutID(String outID) {
        this.outID = outID;
    }

    public List<Channel> getChannels() {
        return this.channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}