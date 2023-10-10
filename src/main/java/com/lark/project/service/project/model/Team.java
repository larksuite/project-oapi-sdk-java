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

package com.lark.project.service.project.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Team {
    @SerializedName("team_id")
    private Long teamID;

    @SerializedName("team_name")
    private String teamName;

    @SerializedName("user_keys")
    private List<String> userKeys;

    @SerializedName("administrators")
    private List<String> administrators;

    public Long getTeamID() {
        return this.teamID;
    }

    public void setTeamID(Long teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<String> getUserKeys() {
        return this.userKeys;
    }

    public void setUserKeys(List<String> userKeys) {
        this.userKeys = userKeys;
    }

    public List<String> getAdministrators() {
        return this.administrators;
    }

    public void setAdministrators(List<String> administrators) {
        this.administrators = administrators;
    }

}