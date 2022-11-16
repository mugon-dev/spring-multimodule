package dev.be.moduleapi.feign.custom.config;

import dev.be.moduleapi.feign.custom.interceptor.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {
    // 특정 Feign client용
    @Bean
    public DemoFeignInterceptor feignInterceptor(){
        // static name에 of 넣어줬을때 of 함수 사용가능
        return DemoFeignInterceptor.of();
    }
}
