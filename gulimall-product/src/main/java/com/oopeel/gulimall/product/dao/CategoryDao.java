package com.oopeel.gulimall.product.dao;

import com.oopeel.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author oopeel
 * @email oopeel@163.com
 * @date 2023-06-30 19:23:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
