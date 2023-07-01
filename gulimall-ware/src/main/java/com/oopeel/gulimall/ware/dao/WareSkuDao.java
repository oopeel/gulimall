package com.oopeel.gulimall.ware.dao;

import com.oopeel.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-07-01 17:06:50
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
