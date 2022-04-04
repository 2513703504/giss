package com.ctbu.mapper;

import com.ctbu.entity.WasteTreatmentPlant;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :WasteTreatmentPlantMapper
 * @createTime : 2022/3/20 15:44
 */
public interface WasteTreatmentPlantMapper {

    /**
     * 查询所有粪便处理厂
     * @return
     */
    List<WasteTreatmentPlant> getAllWtp();

    /**
     * 显示粪便处理厂详细信息
     * @param id
     * @return
     */
    WasteTreatmentPlant getWtpDetail(int id);
}
