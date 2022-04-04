package com.ctbu.service.impl;

import com.ctbu.entity.SanitationVehiclesPark;
import com.ctbu.mapper.SanitationVehiclesParkMapper;
import com.ctbu.service.SanitationCarService;
import com.ctbu.service.SanitationVehiclesParkService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :SanitationVehiclesParkServiceImpl
 * @createTime : 2022/3/20 15:55
 * @updateTime : 2022/3/20 15:55
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class SanitationVehiclesParkServiceImpl implements SanitationVehiclesParkService {

    @Autowired
    private SanitationVehiclesParkMapper sanitationVehiclesParkMapper;

    /**
     * 查询所有环卫停车场
     *
     * @return
     */
    public List<SanitationVehiclesPark> getAllSvpService() {
        return sanitationVehiclesParkMapper.getAllSvp();
    }

    /**
     * 分页查询环卫停车场
     *
     * @param currPage
     * @return
     */
    public List<SanitationVehiclesPark> getSvpByPageService(int currPage) {
        PageHelper.startPage(currPage,8);

        return sanitationVehiclesParkMapper.getSvpByPage();
    }

    /**
     * 条件查询
     *
     * @param svp
     * @return
     */
    public List<SanitationVehiclesPark> getSvpByConditionService(SanitationVehiclesPark svp) {
        return sanitationVehiclesParkMapper.getSvpByCondition(svp);
    }

    /**
     * 添加环卫停车场
     *
     * @param svp
     * @return
     */
    public int addSvpService(SanitationVehiclesPark svp) {
        return sanitationVehiclesParkMapper.addSvp(svp);
    }

    /**
     * 删除环卫停车场
     *
     * @param id
     * @return
     */
    public int deleteSvpService(int id) {
        return sanitationVehiclesParkMapper.deleteSvp(id);
    }
}
