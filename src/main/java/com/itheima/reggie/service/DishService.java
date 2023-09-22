package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;


public interface DishService extends IService<Dish> {
    /**
     * 新增菜品，同时保存对应的口味数据
     * @param dishDto
     */
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表
    public void saveWithFlavor(DishDto dishDto);

    /**
     * 根据id查菜品信息和对应的口味信息
     * @return
     */
    public DishDto getByIdWithFlavor(Long id);

    /**
     * 更新菜品，同时更新对应的口味信息
     * @param dishDto
     */
    public void updateWithFlavor(DishDto dishDto);
}
