package com.ctbu.controller;

import com.ctbu.entity.SanitationCar;
import com.ctbu.service.SanitationCarService;
import com.ctbu.service.SanitationVehiclesParkService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :SanitationCarController
 * @createTime : 2022/3/20 16:11
 * @updateTime : 2022/3/20 16:11
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class SanitationCarController {

    @Autowired
    private SanitationCarService sanitationCarService;

    @RequestMapping("/listSc")
    @ResponseBody
    public List<SanitationCar> getAllSc(){
        return sanitationCarService.getAllScService();
    }

    @RequestMapping("/listCarByPage")
    @ResponseBody
    public Map<Object,Object> getScByPage(int currPage){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<SanitationCar> cars=sanitationCarService.getScByPageService(currPage);

        if(cars.size()==0){
            cars=sanitationCarService.getScByPageService(currPage-1);
        }

        PageInfo pageInfo=new PageInfo(cars);

        map.put("cars",cars);
        map.put("pageInfo",pageInfo);
        map.put("status",true);

        return map;
    }

    @RequestMapping("/listCarByCondition")
    @ResponseBody
    public Map<Object,Object> getScByConditionService(String scType){
        Map<Object,Object> map=new HashMap<Object, Object>();

        SanitationCar car=new SanitationCar();
        if(!scType.equals("")){
            car.setScType(scType);
        }
        List<SanitationCar> cars=sanitationCarService.getScByConditionService(car);
        map.put("cars",cars);
        map.put("status",false);
        return map;
    }


}
