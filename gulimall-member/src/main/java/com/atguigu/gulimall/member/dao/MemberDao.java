package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hao
 * @email 739333160@gmail.com
 * @date 2021-02-22 20:40:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
