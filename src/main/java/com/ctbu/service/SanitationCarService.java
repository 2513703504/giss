package com.ctbu.service;

import com.ctbu.entity.SanitationCar;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :SanitationCarService
 * @createTime : 2022/3/20 15:48
 */
public interface SanitationCarService {

    /**
     * 查询所有环卫车辆
     * @return
     */
    List<SanitationCar> getAllScService();

    /**
     * 分页显示环卫车辆
     * @param currPage
     * @return
     */
    List<SanitationCar> getScByPageService(int currPage);

    /**
     * 条件查询环卫车辆
     * @param car
     * @return
     */
    List<SanitationCar> getScByConditionService(SanitationCar car);
}
