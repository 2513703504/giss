package com.ctbu.mapper;

import com.ctbu.entity.SanitationVehiclesPark;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :SanitationVehiclesParkMapper
 * @createTime : 2022/3/20 15:42
 */
public interface SanitationVehiclesParkMapper {

    /**
     * 查询所有环卫停车场
     * @return
     */
    List<SanitationVehiclesPark> getAllSvp();

    /**
     * 分页查询停车场
     * @return
     */
    List<SanitationVehiclesPark> getSvpByPage();

    /**
     * 条件查询
     * @param svp
     * @return
     */
    List<SanitationVehiclesPark> getSvpByCondition(SanitationVehiclesPark svp);

    /**
     * 添加环卫停车场
     * @param svp
     * @return
     */
    int addSvp(SanitationVehiclesPark svp);

    /**
     * 删除环卫停车场
     * @param id
     * @return
     */
    int deleteSvp(int id);
}
