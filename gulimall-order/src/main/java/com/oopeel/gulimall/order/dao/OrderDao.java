package com.oopeel.gulimall.order.dao;

import com.oopeel.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 17:03:07
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
