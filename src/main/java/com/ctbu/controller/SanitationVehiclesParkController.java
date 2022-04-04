package com.ctbu.controller;

import com.ctbu.entity.SanitationVehiclesPark;
import com.ctbu.service.SanitationVehiclesParkService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.MapAccessor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :SanitationVehiclesParkController
 * @createTime : 2022/3/20 16:12
 * @updateTime : 2022/3/20 16:12
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class SanitationVehiclesParkController {

    @Autowired
    private SanitationVehiclesParkService sanitationVehiclesParkService;

    @RequestMapping("/listSvp")
    @ResponseBody
    public List<SanitationVehiclesPark> getAllSvp(){
        return sanitationVehiclesParkService.getAllSvpService();
    }

    @RequestMapping("/listSvpByPage")
    @ResponseBody
    public Map<Object,Object> getSvpByPage(int currPage){
        Map<Object,Object> map=new HashMap<Object, Object>();
        List<SanitationVehiclesPark> parks=sanitationVehiclesParkService.getSvpByPageService(currPage);

        if(parks.size()==0){
            parks=sanitationVehiclesParkService.getSvpByPageService(currPage-1);
        }
        PageInfo pageInfo=new PageInfo(parks);
        map.put("parks",parks);
        map.put("pageInfo",pageInfo);
        map.put("status",true);
        return map;
    }

    @RequestMapping("/listSvpByCondition")
    @ResponseBody
    public Map<Object,Object> getSvpByCondition(String svpName,String svpAddress){
        Map<Object,Object> map=new HashMap<Object, Object>();
        SanitationVehiclesPark svp=new SanitationVehiclesPark();
        if(!svpName.equals("")){
            svp.setSvpName(svpName);
        }
        if(!svpAddress.equals("")){
            svp.setSvpAddress(svpAddress);
        }
        List<SanitationVehiclesPark> parks=sanitationVehiclesParkService.getSvpByConditionService(svp);
        map.put("parks",parks);
        map.put("status",false);
        return map;
    }

    @RequestMapping("/insertSvp")
    @ResponseBody
    public Map<Object,Object> addSvp(@RequestBody Map<String,Object> map){

        SanitationVehiclesPark svp=new SanitationVehiclesPark();
        svp.setSvpName((String) map.get("svpName"));
        svp.setSvpAddress((String)map.get("svpAddress"));
        svp.setSvpArea(Double.valueOf((String)map.get("svpArea")));
        svp.setLng((String)map.get("lag"));
        svp.setLat((String)map.get("lat"));

        int row=sanitationVehiclesParkService.addSvpService(svp);
        Map<Object,Object> map1=new HashMap<Object, Object>();
        if(row>0){
            map1.put("result",true);
        }else {
            map1.put("result",false);
        }

        return map1;
    }

    @RequestMapping("/deleteSvp")
    @ResponseBody
    public Map<Object,Object> deleteSvp(int id) {
        int row=sanitationVehiclesParkService.deleteSvpService(id);
        Map<Object,Object> map1=new HashMap<Object, Object>();
        if(row>0){
            map1.put("result",true);
        }else {
            map1.put("result",false);
        }
        return map1;
    }
}
