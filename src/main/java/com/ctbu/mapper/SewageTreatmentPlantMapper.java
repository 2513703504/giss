package com.ctbu.mapper;

import com.ctbu.entity.SewageTreatmentPlant;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :SewageTreatmentPlantMapper
 * @createTime : 2022/3/20 15:43
 */
public interface SewageTreatmentPlantMapper {

    /**
     * 查询所有污水处理场
     * @return
     */
    List<SewageTreatmentPlant> getAllStp();

    /**
     * 查询污水处理厂详细信息
     * @param id
     * @return
     */
    SewageTreatmentPlant getStpDetail(int id);
}
