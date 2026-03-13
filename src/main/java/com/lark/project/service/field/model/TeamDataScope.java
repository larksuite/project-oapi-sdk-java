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

public class TeamDataScope {
    @SerializedName("team_id")
    private String teamID;
    @SerializedName("cascade")
    private Boolean cascade;

    public String getTeamID() {
        return this.teamID;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public Boolean getCascade() {
        return this.cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }
}
