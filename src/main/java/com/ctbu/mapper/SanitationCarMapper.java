package com.ctbu.mapper;

import com.ctbu.entity.SanitationCar;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :SanitationCarMapper
 * @createTime : 2022/3/20 15:42
 */
public interface SanitationCarMapper {

    /**
     *查询所有环卫车
     * @return
     */
    List<SanitationCar> getAllSc();

    /**
     * 分页显示环卫车辆
     * @return
     */
    List<SanitationCar> getScByPage();

    /**
     * 条件查询环卫车辆
     * @param car
     * @return
     */
    List<SanitationCar> getScByCondition(SanitationCar car);
}
