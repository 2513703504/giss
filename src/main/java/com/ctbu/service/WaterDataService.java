package com.ctbu.service;

import com.ctbu.entity.WaterData;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :WaterDataService
 * @createTime : 2022/4/14 9:33
 */
public interface WaterDataService {
    /**
     * 所有数据
     * @return
     */
    List<WaterData> getDataService();
}
