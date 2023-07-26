package com.lark.meegooapi.service.plugin.builder;

import com.google.gson.annotations.SerializedName;

public class GetPluginTokenReqBody {

    @SerializedName("plugin_id")
    private String pluginID;
    @SerializedName("plugin_secret")
    private String pluginSecret;
    @SerializedName("type")
    private int type;

    public String getPluginID() {
        return pluginID;
    }

    public void setPluginID(String pluginID) {
        this.pluginID = pluginID;
    }

    public String getPluginSecret() {
        return pluginSecret;
    }

    public void setPluginSecret(String pluginSecret) {
        this.pluginSecret = pluginSecret;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
