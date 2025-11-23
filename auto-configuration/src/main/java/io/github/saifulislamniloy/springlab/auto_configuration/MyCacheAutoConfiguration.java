package io.github.saifulislamniloy.springlab.auto_configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyCacheProperties.class)
public class MyCacheAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix="spring.mycache", name="enabled", havingValue="true", matchIfMissing=true)
    public MyCache myCache() {
        return new MyCache();
    }
}
