package dev.be.moduleapi.feign.config;

import dev.be.moduleapi.feign.custom.interceptor.DemoFeignInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public DemoFeignInterceptor feignInterceptor(){
        // static name에 of 넣어줬을때 of 함수 사용가능
        return DemoFeignInterceptor.of();
    }

}
