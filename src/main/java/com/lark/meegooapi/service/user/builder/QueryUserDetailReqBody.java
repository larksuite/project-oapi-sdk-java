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

package com.lark.meegooapi.service.user.builder;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class QueryUserDetailReqBody {
    @SerializedName("user_keys")
    private List<String> userKeys;
    @SerializedName("usernames")
    private List<String> usernames;
    @SerializedName("out_ids")
    private List<String> outIDs;
    @SerializedName("emails")
    private List<String> emails;

    public List<String> getUserKeys() {
        return this.userKeys;
    }

    public void setUserKeys(List<String> userKeys) {
        this.userKeys = userKeys;
    }

    public List<String> getUsernames() {
        return this.usernames;
    }

    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }

    public List<String> getOutIDs() {
        return this.outIDs;
    }

    public void setOutIDs(List<String> outIDs) {
        this.outIDs = outIDs;
    }

    public List<String> getEmails() {
        return this.emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
