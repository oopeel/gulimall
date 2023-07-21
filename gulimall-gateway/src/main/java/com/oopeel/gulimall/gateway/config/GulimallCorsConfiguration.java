package com.oopeel.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 跨域处理
 * @author oopeel
 * @date 2023/7/7
 */
@Configuration
public class GulimallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 配置跨域
        // 允许哪些请求头跨域
        corsConfiguration.addAllowedHeader("*");
        // 允许哪些请求方式跨域
        corsConfiguration.addAllowedMethod("*");
        // 允许哪些请求来源进行跨域
        corsConfiguration.addAllowedOrigin("*");
        // 是否允许携带cookie 进行跨域
        corsConfiguration.setAllowCredentials(true);

        // /** 表示所有请求
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsWebFilter(source);
    }
}
