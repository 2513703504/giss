package com.ctbu.service;

import com.ctbu.entity.VehicleCleaningStation;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :VehicleCleaningStationService
 * @createTime : 2022/3/20 15:50
 */
public interface VehicleCleaningStationService {

    /**
     * 查询所有车辆清洗站
     * @return
     */
    List<VehicleCleaningStation> getAllVcsService();
}
