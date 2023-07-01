package com.oopeel.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oopeel.common.utils.PageUtils;
import com.oopeel.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-06-30 19:23:15
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

