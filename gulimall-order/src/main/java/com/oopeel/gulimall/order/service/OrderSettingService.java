package com.oopeel.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oopeel.common.utils.PageUtils;
import com.oopeel.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 17:03:06
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

