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

package com.lark.project.core;

public interface Constants {

    String CONTENT_DISPOSITION = "Content-Disposition";
    String CONTENT_TYPE = "Content-Type";
    String APPLICATION_JSON = "application/json";
    String JSON_CONTENT_TYPE = APPLICATION_JSON + "; charset=utf-8";
    String HTTP_HEADER_KEY_REQUEST_ID = "X-Request-Id";
    String HTTP_HEADER_KEY_LOG_ID = "X-Tt-Logid";

    String HTTP_HEADER_USER_KEY = "X-USER-KEY";

    String HTTP_HEADER_ACCESS_TOKEN = "X-PLUGIN-TOKEN";

    String HTTP_HEADER_IDEM_UUID = "X-IDEM-UUID";
    String VERSION = "1.0.19";

    String BASE_URL = "https://project.feishu.cn";


}
