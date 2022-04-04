package com.ctbu.service.impl;

import com.ctbu.entity.VehicleCleaningStation;
import com.ctbu.mapper.VehicleCleaningStationMapper;
import com.ctbu.service.VehicleCleaningStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :VehicleCleaningStationServiceImpl
 * @createTime : 2022/3/20 15:57
 * @updateTime : 2022/3/20 15:57
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class VehicleCleaningStationServiceImpl implements VehicleCleaningStationService {

    @Autowired
    private VehicleCleaningStationMapper vehicleCleaningStationMapper;

    /**
     * 查询所有车辆清洗站
     *
     * @return
     */
    public List<VehicleCleaningStation> getAllVcsService() {
        return vehicleCleaningStationMapper.getAllVcs();
    }
}
