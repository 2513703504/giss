package com.ctbu.service;

import com.ctbu.entity.SanitationVehiclesPark;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :SanitationVehiclesParkService
 * @createTime : 2022/3/20 15:49
 */
public interface SanitationVehiclesParkService {

    /**
     * 查询所有环卫停车场
     * @return
     */
    List<SanitationVehiclesPark> getAllSvpService();

    /**
     * 分页查询环卫停车场
     * @param currPage
     * @return
     */
    List<SanitationVehiclesPark> getSvpByPageService(int currPage);

    /**
     * 条件查询
     * @param svp
     * @return
     */
    List<SanitationVehiclesPark> getSvpByConditionService(SanitationVehiclesPark svp);

    /**
     * 添加环卫停车场
     * @param svp
     * @return
     */
    int addSvpService(SanitationVehiclesPark svp);

    /**
     * 删除环卫停车场
     * @param id
     * @return
     */
    int deleteSvpService(int id);
}
