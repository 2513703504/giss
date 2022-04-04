package com.ctbu.service.impl;

import com.ctbu.entity.SanitationCar;
import com.ctbu.mapper.SanitationCarMapper;
import com.ctbu.mapper.SanitationVehiclesParkMapper;
import com.ctbu.service.SanitationCarService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :SanitationCarServiceImpl
 * @createTime : 2022/3/20 15:54
 * @updateTime : 2022/3/20 15:54
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class SanitationCarServiceImpl implements SanitationCarService {

    @Autowired
    private SanitationCarMapper sanitationCarMapper;

    /**
     * 查询所有垃圾转运站
     *
     * @return
     */
    public List<SanitationCar> getAllScService() {
        return sanitationCarMapper.getAllSc();
    }

    /**
     * 分页显示环卫车辆
     *
     * @param currPage
     * @return
     */
    public List<SanitationCar> getScByPageService(int currPage) {

        PageHelper.startPage(currPage,8);
        return sanitationCarMapper.getScByPage();
    }

    /**
     * 条件查询环卫车辆
     *
     * @param car
     * @return
     */
    public List<SanitationCar> getScByConditionService(SanitationCar car) {
        return sanitationCarMapper.getScByCondition(car);
    }
}
