package com.ctbu.service;

import com.ctbu.entity.SewageTreatmentPlant;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :SewageTreatmentPlantService
 * @createTime : 2022/3/20 15:49
 */

public interface SewageTreatmentPlantService {
    /**
     * 查询所有污水处理厂
     * @return
     */
    List<SewageTreatmentPlant> getAllStpService();

    /**
     * 查询污水厂详细信息
     * @param id
     * @return
     */
    SewageTreatmentPlant getStpDetailService(int id);
}
