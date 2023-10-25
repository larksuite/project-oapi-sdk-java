package com.lark.project.service.plugin;

import com.lark.project.core.request.RequestOptions;
import com.lark.project.service.plugin.builder.*;

public interface PluginService {
    // 获取plugin_token
    public GetPluginTokenResp getPluginToken(GetPluginTokenReq req, RequestOptions reqOptions) throws Exception;

    // 获取user_plugin_token
    public GetUserPluginTokenResp getUserPluginToken(GetUserPluginTokenReq req, RequestOptions reqOptions) throws Exception;

    // 刷新Token（目前刷新token仅支持刷新user_plugin_token）
    public RefreshTokenResp refreshToken(RefreshTokenReq req, RequestOptions reqOptions) throws Exception;
}
