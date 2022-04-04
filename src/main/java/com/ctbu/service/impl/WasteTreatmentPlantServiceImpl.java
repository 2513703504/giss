package com.ctbu.service.impl;

import com.ctbu.entity.WasteTreatmentPlant;
import com.ctbu.mapper.WasteTreatmentPlantMapper;
import com.ctbu.service.WasteTreatmentPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :WasteTreatmentPlantServiceImpl
 * @createTime : 2022/3/20 15:58
 * @updateTime : 2022/3/20 15:58
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class WasteTreatmentPlantServiceImpl implements WasteTreatmentPlantService {
    @Autowired
    private WasteTreatmentPlantMapper wasteTreatmentPlantMapper;

    /**
     * 查询所有粪便处理厂
     *
     * @return
     */
    public List<WasteTreatmentPlant> getAllWtpService() {
        return wasteTreatmentPlantMapper.getAllWtp();
    }

    /**
     * 显示粪便处理厂详细信息
     *
     * @param id
     * @return
     */
    public WasteTreatmentPlant getWtpDetailService(int id) {
        return wasteTreatmentPlantMapper.getWtpDetail(id);
    }
}
