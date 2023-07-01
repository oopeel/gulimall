package com.oopeel.gulimall.coupon.dao;

import com.oopeel.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 16:42:24
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
