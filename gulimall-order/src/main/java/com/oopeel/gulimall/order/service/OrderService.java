package com.oopeel.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oopeel.common.utils.PageUtils;
import com.oopeel.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 17:03:07
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

