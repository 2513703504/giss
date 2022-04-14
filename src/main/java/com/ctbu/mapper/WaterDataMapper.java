package com.ctbu.mapper;

import com.ctbu.entity.WaterData;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :WaterDataMapper
 * @createTime : 2022/4/14 9:30
 */
public interface WaterDataMapper {
    /**
     * 获取历年污水排放
     * @return
     */
    WaterData getData();
}
