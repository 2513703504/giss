package com.ctbu.mapper;

import com.ctbu.entity.VehicleCleaningStation;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :VehicleCleaningStationMapper
 * @createTime : 2022/3/20 15:44
 */
public interface VehicleCleaningStationMapper {

    /**
     * 查询所有清洗站
     * @return
     */
    List<VehicleCleaningStation> getAllVcs();
}
