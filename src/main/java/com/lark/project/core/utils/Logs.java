package com.lark.project.core.utils;

import com.lark.project.core.response.RawResponse;

import java.nio.charset.StandardCharsets;

public class Logs {

    public static String formatReq(Object req, RawResponse httpResponse){
        return String.format(
                "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/:project_key/work_item/:work_item_id/bot_join_chat"
                , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                        StandardCharsets.UTF_8));
    }
}
