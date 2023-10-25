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

import java.util.List;


public class DeleteWorkingHourRecordReqBody {
    @SerializedName("working_hour_record_ids")
    private List<Long> workingHourRecordIDs;

    public List<Long> getWorkingHourRecordIDs() {
        return this.workingHourRecordIDs;
    }

    public void setWorkingHourRecordIDs(List<Long> workingHourRecordIDs) {
        this.workingHourRecordIDs = workingHourRecordIDs;
    }
}
