package com.bestzyx.larksuite.project.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lark.project.Client;

/**
 * Created by zhangyongxiang on 2025/5/15 20:20
 *
 * @author zhangyongxiang
 */
@Configuration
@EnableConfigurationProperties(LarksuiteProjectProperties.class)
public class LarksuiteProjectAutoConfiguration {
    
    private static final Logger log = LoggerFactory
            .getLogger(LarksuiteProjectAutoConfiguration.class);
    
    @Bean
    @ConditionalOnMissingBean
    public Client larksuiteProjectClient(
            LarksuiteProjectProperties larksuiteProjectProperties,
            ObjectProvider<LarksuiteProjectPropertiesCustomizer> customizers) {
        customizers.orderedStream().forEach(
                customizer -> customizer.customize(larksuiteProjectProperties));
        var builder = Client.newBuilder(
                larksuiteProjectProperties.getPluginId(),
                larksuiteProjectProperties.getPluginSecret());
        builder.accessTokenType(
                larksuiteProjectProperties.getAccessTokenType());
        var client = builder
                .openBaseUrl(larksuiteProjectProperties.getBaseUrl())
                .requestTimeout(larksuiteProjectProperties.getRequestTimeout()
                        .toMillis())
                .logReqAtDebug(larksuiteProjectProperties.isLogReqAtDebug())
                .build();
        if (log.isDebugEnabled()) {
            log.debug(
                    "larksuite project client created with base url: {}, appId: {}",
                    larksuiteProjectProperties.getBaseUrl(),
                    larksuiteProjectProperties.getPluginId());
        } else {
            log.info("larksuite project client created with base url: {}",
                    larksuiteProjectProperties.getBaseUrl());
        }
        return client;
    }
    
    @Bean
    @ConditionalOnMissingBean
    public SimpleLarksuiteProjectService simpleLarksuiteProjectService(
            LarksuiteProjectProperties larksuiteProjectProperties,
            Client client) {
        return new DefaultSimpleLarksuiteProjectService(client,
                larksuiteProjectProperties.getMaxRetryTimes() < 0 ? 3
                        : larksuiteProjectProperties.getMaxRetryTimes());
    }
}
