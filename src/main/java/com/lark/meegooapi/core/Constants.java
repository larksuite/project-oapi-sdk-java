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

package com.lark.meegooapi.core;

public interface Constants {

    String CONTENT_DISPOSITION = "Content-Disposition";
    String CONTENT_TYPE = "Content-Type";
    String APPLICATION_JSON = "application/json";
    String JSON_CONTENT_TYPE = APPLICATION_JSON + "; charset=utf-8";

    String HTTP_HEADER = "HTTP_HEADER";
    String HTTP_HEADER_KEY_REQUEST_ID = "X-Request-Id";
    String HTTP_HEADER_REQUEST_ID = "Request-Id";
    String HTTP_HEADER_KEY_LOG_ID = "X-Tt-Logid";
    String HTTP_KEY_STATUS_CODE = "http_status_code";
    String URL_VERIFICATION = "url_verification";
    String CUSTOM_REQUEST_ID = "Oapi-Sdk-Request-Id";


    public static final String X_LARK_REQUEST_TIMESTAMP = "X-Lark-Request-Timestamp";
    public static final String X_LARK_REQUEST_NONCE = "X-Lark-Request-Nonce";
    public static final String X_LARK_SIGNATURE = "X-Lark-Signature";
    public static final String X_REFRESH_TOKEN = "X-Refresh-Token";
    String VERSION = "v1.0.0";

}
