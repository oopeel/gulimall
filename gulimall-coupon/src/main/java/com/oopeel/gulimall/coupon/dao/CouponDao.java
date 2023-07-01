package com.oopeel.gulimall.coupon.dao;

import com.oopeel.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 16:42:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
