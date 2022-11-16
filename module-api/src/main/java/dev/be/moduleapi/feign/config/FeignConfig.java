package dev.be.moduleapi.feign.config;

import dev.be.moduleapi.feign.custom.logger.FeignCustomLogger;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    // Global Feign 설정

    @Bean
    public Logger feignLogger() {
        return new FeignCustomLogger();
    }
}
