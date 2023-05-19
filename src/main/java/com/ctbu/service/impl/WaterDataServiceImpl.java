package com.ctbu.service.impl;

import com.ctbu.entity.WaterData;
import com.ctbu.mapper.WaterDataMapper;
import com.ctbu.service.WaterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :WaterDataServiceImpl
 * @createTime : 2022/4/14 9:33
 * @updateTime : 2022/4/14 9:33
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class WaterDataServiceImpl implements WaterDataService {

    @Autowired
    private WaterDataMapper waterDataMapper;

    public List<WaterData> getDataService() {
        return waterDataMapper.getData();
    }
}
