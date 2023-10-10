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

package com.lark.project.service.workitem.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Schedule {
    @SerializedName("points")
    private Float points;

    @SerializedName("estimate_start_date")
    private Long estimateStartDate;

    @SerializedName("estimate_end_date")
    private Long estimateEndDate;

    @SerializedName("owners")
    private List<String> owners;

    @SerializedName("actual_work_time")
    private Float actualWorkTime;

    public Float getPoints() {
        return this.points;
    }

    public void setPoints(Float points) {
        this.points = points;
    }

    public Long getEstimateStartDate() {
        return this.estimateStartDate;
    }

    public void setEstimateStartDate(Long estimateStartDate) {
        this.estimateStartDate = estimateStartDate;
    }

    public Long getEstimateEndDate() {
        return this.estimateEndDate;
    }

    public void setEstimateEndDate(Long estimateEndDate) {
        this.estimateEndDate = estimateEndDate;
    }

    public List<String> getOwners() {
        return this.owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
    }

    public Float getActualWorkTime() {
        return this.actualWorkTime;
    }

    public void setActualWorkTime(Float actualWorkTime) {
        this.actualWorkTime = actualWorkTime;
    }

}