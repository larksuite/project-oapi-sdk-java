package com.lark.project.service.plugin;

import com.lark.project.core.Config;
import com.lark.project.core.Transport;
import com.lark.project.core.exception.ErrConstants;
import com.lark.project.core.request.RequestOptions;
import com.lark.project.core.response.RawResponse;
import com.lark.project.core.utils.Logs;
import com.lark.project.core.utils.UnmarshalRespUtil;
import com.lark.project.service.plugin.builder.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PluginServiceImpl implements PluginService {

    private static final Logger log = LoggerFactory.getLogger(PluginServiceImpl.class);

    private Config config;

    public PluginServiceImpl(Config config) {
        this.config = config;
    }

    // 获取plugin_token
    public GetPluginTokenResp getPluginToken(GetPluginTokenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/authen/plugin_token"
                , true
                , req);

        // 反序列化
        GetPluginTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetPluginTokenResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/authen/plugin_token"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 获取user_plugin_token
    public GetUserPluginTokenResp getUserPluginToken(GetUserPluginTokenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/authen/user_plugin_token"
                , false
                , req);

        // 反序列化
        GetUserPluginTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, GetUserPluginTokenResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/authen/user_plugin_token"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }

    // 刷新Token（目前刷新token仅支持刷新user_plugin_token）
    public RefreshTokenResp refreshToken(RefreshTokenReq req, RequestOptions reqOptions) throws Exception {
        // 请求参数选项
        if (reqOptions == null) {
            reqOptions = new RequestOptions();
        }

        // 发起请求
        RawResponse httpResponse = Transport.doSend(config, reqOptions, "POST"
                , "/open_api/authen/refresh_token"
                , false
                , req);

        // 反序列化
        RefreshTokenResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, RefreshTokenResp.class);
        if (resp == null) {
            log.error(Logs.formatReq(req, httpResponse, "/open_api/authen/refresh_token"));
            throw new IllegalArgumentException(ErrConstants.RESULT_ILLEGAL);
        }

        resp.setRawResponse(httpResponse);
        resp.setRequest(req);

        return resp;
    }
}
