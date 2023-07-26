package com.lark.meegooapi.service.plugin;

import com.lark.meegooapi.core.Config;
import com.lark.meegooapi.core.Transport;
import com.lark.meegooapi.core.request.RequestOptions;
import com.lark.meegooapi.core.response.RawResponse;
import com.lark.meegooapi.core.utils.Jsons;
import com.lark.meegooapi.core.utils.UnmarshalRespUtil;
import com.lark.meegooapi.service.plugin.builder.*;
import com.lark.meegooapi.service.project.ProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class PluginService {

    private static final Logger log = LoggerFactory.getLogger(ProjectService.class);

    private Config config;

    public PluginService(Config config) {
        this.config = config;
    }

    /* 获取plugin_token
     *
     */
    public GetPluginTokenResp GetPluginToken(GetPluginTokenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/authen/plugin_token"
                , true
                , req);

        // 反序列化
        GetPluginTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetPluginTokenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/projects"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /* 获取user_plugin_token
     *
     */
    public GetUserPluginTokenResp GetUserPluginToken(GetUserPluginTokenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/authen/user_plugin_token"
                , false
                , req);

        // 反序列化
        GetUserPluginTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserPluginTokenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/projects"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    /* 刷新Token（目前刷新token仅支持刷新user_plugin_token）
     *
     */
    public RefreshTokenResp RefreshToken(RefreshTokenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                , "/open_api/authen/refresh_token"
                , false
                , req);

        // 反序列化
        RefreshTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, RefreshTokenResp.class);
        if (resp == null) {
            log.error(String.format(
                    "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open_api/projects"
                    , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                    httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                            StandardCharsets.UTF_8)));
            throw new IllegalArgumentException("The result returned by the server is illegal");
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
