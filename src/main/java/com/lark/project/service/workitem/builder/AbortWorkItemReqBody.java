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


public class AbortWorkItemReqBody {
    @SerializedName("is_aborted")
    private Boolean isAborted;
    @SerializedName("reason")
    private String reason;

    public Boolean getIsAborted() {
        return this.isAborted;
    }

    public void setIsAborted(Boolean isAborted) {
        this.isAborted = isAborted;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
