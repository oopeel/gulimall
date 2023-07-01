package com.oopeel.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oopeel.common.utils.PageUtils;
import com.oopeel.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 16:42:24
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

