package com.ctbu.controller;

import com.ctbu.entity.SewageTreatmentPlant;
import com.ctbu.service.SewageTreatmentPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :SewageTreatmentPlantController
 * @createTime : 2022/3/20 16:12
 * @updateTime : 2022/3/20 16:12
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class SewageTreatmentPlantController {
    @Autowired
    private SewageTreatmentPlantService sewageTreatmentPlantService;

    @RequestMapping("/listStp")
    @ResponseBody
    public List<SewageTreatmentPlant> getAllStp(){
        return sewageTreatmentPlantService.getAllStpService();
    }

    @RequestMapping("/getStpDetail")
    @ResponseBody
    public SewageTreatmentPlant getStpDetail(int id){
        return sewageTreatmentPlantService.getStpDetailService(id);
    }

}
