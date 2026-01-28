package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetMealDIshMapper {

    /**
     * 根据套餐ids查询对应的菜品ids
     * @param dishIds
     * @return
     */
    List<Long> getDishIdsBySetMealId(List<Long> dishIds);
}
