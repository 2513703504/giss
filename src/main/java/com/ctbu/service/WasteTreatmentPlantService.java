package com.ctbu.service;

import com.ctbu.entity.WasteTreatmentPlant;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :WasteTreatmentPlantService
 * @createTime : 2022/3/20 15:51
 */
public interface WasteTreatmentPlantService {

    /**
     * 查询所有粪便处理厂
     * @return
     */
    List<WasteTreatmentPlant> getAllWtpService();

    /**
     * 显示粪便处理厂详细信息
     * @param id
     * @return
     */
    WasteTreatmentPlant getWtpDetailService(int id);
}
