package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hao
 * @email 739333160@gmail.com
 * @date 2021-02-22 20:50:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
