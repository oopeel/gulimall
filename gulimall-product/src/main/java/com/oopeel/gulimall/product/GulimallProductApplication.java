package com.oopeel.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合mybatis-plus
 * 1. 导入依赖
 * 2. 配置Mybatis-Plus
 *  1) 配置数据源
 *      1> 导入数据库驱动
 *      2> 配置数据源 resources/application.yml
 *  2) 配置Mybatis-Plus 相关信息
 *      1> 使用@MapperScan 注解在主程序类上指明程序要扫描的mapper 文件的路径
 *      2> 配置mapper.xml 映射文件位置 resource/application.yml.mapper-locations 属性
 *      3> 配置数据库映射实体类id 自增
 */
@MapperScan("com.oopeel.gulimall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
