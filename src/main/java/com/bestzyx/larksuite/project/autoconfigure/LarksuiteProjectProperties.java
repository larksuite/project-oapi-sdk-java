package com.bestzyx.larksuite.project.autoconfigure;

import java.time.Duration;
import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.lark.project.core.token.AccessTokenType;

import static com.lark.project.core.token.AccessTokenType.AccessTokenTypePlugin;

/**
 * Created by zhangyongxiang on 2025/5/15 16:50
 *
 * @author zhangyongxiang
 */
@ConfigurationProperties(prefix = "larksuite.project.client")
public class LarksuiteProjectProperties {
    
    /**
     * larksuite project plugin id
     */
    private String pluginId;
    
    /**
     * larksuite project plugin secret
     */
    private String pluginSecret;
    
    /**
     * larksuite project access token type
     */
    private AccessTokenType accessTokenType = AccessTokenTypePlugin;
    
    /**
     * larksuite base url
     */
    private String baseUrl = "https://project.larksuite.com";
    
    /**
     * request timeout
     */
    private Duration requestTimeout = Duration.ofMinutes(3);
    
    /**
     * log request at debug level
     */
    private boolean logReqAtDebug = false;
    
    public String getPluginId() {
        return this.pluginId;
    }
    
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }
    
    public String getPluginSecret() {
        return this.pluginSecret;
    }
    
    public void setPluginSecret(String pluginSecret) {
        this.pluginSecret = pluginSecret;
    }
    
    public AccessTokenType getAccessTokenType() {
        return this.accessTokenType;
    }
    
    public void setAccessTokenType(AccessTokenType accessTokenType) {
        this.accessTokenType = accessTokenType;
    }
    
    public String getBaseUrl() {
        return this.baseUrl;
    }
    
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
    
    public Duration getRequestTimeout() {
        return this.requestTimeout;
    }
    
    public void setRequestTimeout(Duration requestTimeout) {
        this.requestTimeout = requestTimeout;
    }
    
    public boolean isLogReqAtDebug() {
        return this.logReqAtDebug;
    }
    
    public void setLogReqAtDebug(boolean logReqAtDebug) {
        this.logReqAtDebug = logReqAtDebug;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LarksuiteProjectProperties that = (LarksuiteProjectProperties) o;
        return this.accessTokenType == that.accessTokenType
                && this.logReqAtDebug == that.logReqAtDebug
                && Objects.equals(this.pluginId, that.pluginId)
                && Objects.equals(this.pluginSecret, that.pluginSecret)
                && Objects.equals(this.baseUrl, that.baseUrl)
                && Objects.equals(this.requestTimeout, that.requestTimeout);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.pluginId, this.pluginSecret,
                this.accessTokenType, this.baseUrl, this.requestTimeout,
                this.logReqAtDebug);
    }
    
    @Override
    public String toString() {
        return "LarksuiteProperties{" + "appId='" + this.pluginId + '\''
                + ", appSecret='" + this.pluginSecret + '\''
                + ", marketplaceApp=" + this.accessTokenType + ", baseUrl='"
                + this.baseUrl + '\'' + ", requestTimeout="
                + this.requestTimeout + ", logReqAtDebug=" + this.logReqAtDebug
                + '}';
    }
}
