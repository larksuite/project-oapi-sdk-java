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

package com.lark.project.service.workitem.builder;

import com.google.gson.annotations.SerializedName;
import com.lark.project.service.workitem.model.CreateWorkingHourRecord;

import java.util.List;


public class CreateWorkingHourRecordReqBody {
    @SerializedName("work_begin_date")
    private Long workBeginDate;
    @SerializedName("work_end_date")
    private Long workEndDate;
    @SerializedName("include_holidays")
    private Boolean includeHolidays;
    @SerializedName("working_hour_records")
    private List<CreateWorkingHourRecord> workingHourRecords;

    public Long getWorkBeginDate() {
        return this.workBeginDate;
    }

    public void setWorkBeginDate(Long workBeginDate) {
        this.workBeginDate = workBeginDate;
    }

    public Long getWorkEndDate() {
        return this.workEndDate;
    }

    public void setWorkEndDate(Long workEndDate) {
        this.workEndDate = workEndDate;
    }

    public Boolean getIncludeHolidays() {
        return this.includeHolidays;
    }

    public void setIncludeHolidays(Boolean includeHolidays) {
        this.includeHolidays = includeHolidays;
    }

    public List<CreateWorkingHourRecord> getWorkingHourRecords() {
        return this.workingHourRecords;
    }

    public void setWorkingHourRecords(List<CreateWorkingHourRecord> workingHourRecords) {
        this.workingHourRecords = workingHourRecords;
    }
}
