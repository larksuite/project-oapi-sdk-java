package com.lark.project.core.utils;

import com.lark.project.core.response.RawResponse;

import java.nio.charset.StandardCharsets;

public class Logs {

    public static String formatReq(Object req, RawResponse httpResponse, String path) {
        return String.format(
                "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", path
                , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                        StandardCharsets.UTF_8));
    }
}
