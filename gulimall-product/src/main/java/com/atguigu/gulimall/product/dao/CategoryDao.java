package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hao
 * @email 739333160@gmail.com
 * @date 2021-02-22 16:45:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
