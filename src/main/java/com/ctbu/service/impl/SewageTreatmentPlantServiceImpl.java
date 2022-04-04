package com.ctbu.service.impl;

import com.ctbu.entity.SewageTreatmentPlant;
import com.ctbu.mapper.SewageTreatmentPlantMapper;
import com.ctbu.service.SewageTreatmentPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :SewageTreatmentPlantServiceImpl
 * @createTime : 2022/3/20 15:56
 * @updateTime : 2022/3/20 15:56
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class SewageTreatmentPlantServiceImpl implements SewageTreatmentPlantService {

    @Autowired
    private SewageTreatmentPlantMapper sewageTreatmentPlantMapper;

    /**
     * 查询所有污水处理厂
     *
     * @return
     */
    public List<SewageTreatmentPlant> getAllStpService() {
        return sewageTreatmentPlantMapper.getAllStp();
    }

    /**
     * 查询污水厂详细信息
     *
     * @param id
     * @return
     */
    public SewageTreatmentPlant getStpDetailService(int id) {
        return sewageTreatmentPlantMapper.getStpDetail(id);
    }
}
