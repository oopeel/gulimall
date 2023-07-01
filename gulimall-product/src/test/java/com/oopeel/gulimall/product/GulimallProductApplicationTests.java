package com.oopeel.gulimall.product;

import com.oopeel.gulimall.product.entity.BrandEntity;
import com.oopeel.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService service;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setDescript("测试用");
        entity.setName("测试品牌名用");
        service.save(entity);
        System.out.println("保存成功");
    }

}
