package com.oopeel.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oopeel.common.utils.PageUtils;
import com.oopeel.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 16:42:23
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

