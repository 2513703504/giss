package com.ctbu.controller;

import com.ctbu.entity.VehicleCleaningStation;
import com.ctbu.service.VehicleCleaningStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :VehicleCleaningStationController
 * @createTime : 2022/3/20 16:12
 * @updateTime : 2022/3/20 16:12
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class VehicleCleaningStationController {

    @Autowired
    private VehicleCleaningStationService vehicleCleaningStationService;

    @RequestMapping("/listVcs")
    @ResponseBody
    public List<VehicleCleaningStation> getAllVcs(){
        return vehicleCleaningStationService.getAllVcsService();
    }

}
