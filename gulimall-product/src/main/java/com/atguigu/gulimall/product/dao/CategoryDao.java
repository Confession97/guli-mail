package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiangxiao
 * @email 244847243@qq.com
 * @date 2022-01-04 09:18:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
