package com.ctbu.controller;

import com.ctbu.entity.WasteTreatmentPlant;
import com.ctbu.service.WasteTreatmentPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :WasteTreatmentPlantController
 * @createTime : 2022/3/20 16:13
 * @updateTime : 2022/3/20 16:13
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class WasteTreatmentPlantController {

    @Autowired
    private WasteTreatmentPlantService wasteTreatmentPlantService;

    @RequestMapping("/listWtp")
    @ResponseBody
    public List<WasteTreatmentPlant> getAllWtp(){
        return wasteTreatmentPlantService.getAllWtpService();
    }

    @RequestMapping("/getWtpDetail")
    @ResponseBody
    public WasteTreatmentPlant getWtpDetail(int id){
        return wasteTreatmentPlantService.getWtpDetailService(id);
    }

}
