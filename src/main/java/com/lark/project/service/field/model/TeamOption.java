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

package com.lark.project.service.field.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamOption {
    @SerializedName("team_data_scopes")
    private List<TeamDataScope> teamDataScopes;
    @SerializedName("team_mode")
    private String teamMode;

    public List<TeamDataScope> getTeamDataScopes() {
        return this.teamDataScopes;
    }

    public void setTeamDataScopes(List<TeamDataScope> teamDataScopes) {
        this.teamDataScopes = teamDataScopes;
    }

    public String getTeamMode() {
        return this.teamMode;
    }

    public void setTeamMode(String teamMode) {
        this.teamMode = teamMode;
    }
}
