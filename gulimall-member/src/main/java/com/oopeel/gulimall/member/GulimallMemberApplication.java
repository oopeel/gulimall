package com.oopeel.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 会员系统
 * 通过Feign远程调用别的服务的步骤
 * 1 在当前项目中引入 open-feign
 * 2 编写一个接口,告诉SpringCloud 这个接口需要调用远程服务 CouponFeignService.java
 *  1) 声明接口的每一个方法都是调用哪个远程服务的哪个请求
 * 3 开启远程调用功能, 使用@EnableFeignClients注解
 * @author oopeel
 * @date 2023/7/1 17:11
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.oopeel.gulimall.member.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
