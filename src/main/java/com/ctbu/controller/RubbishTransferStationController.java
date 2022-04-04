package com.ctbu.controller;

import com.ctbu.entity.DomesticWasteIncinerator;
import com.ctbu.entity.RubbishTransferStation;
import com.ctbu.service.RubbishTransferStationService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :RubbishTransferStationController
 * @createTime : 2022/3/20 16:11
 * @updateTime : 2022/3/20 16:11
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class RubbishTransferStationController {

    @Autowired
    private RubbishTransferStationService rubbishTransferStationService;

    @RequestMapping("/listRts")
    @ResponseBody
    public List<RubbishTransferStation> getAllRts(){
        return rubbishTransferStationService.getAllRtsService();
    }

    @RequestMapping("/listRtsByPage")
    @ResponseBody
    public Map<Object,Object> getRtsByPage(int currPage){

        Map<Object,Object> map=new HashMap<Object, Object>();
        List<RubbishTransferStation> rts = rubbishTransferStationService.getRtsByPageService(currPage);
        if(rts.size()==0){
            rts=rubbishTransferStationService.getRtsByPageService(currPage-1);
        }
        map.put("rts",rts);
        PageInfo pageInfo=new PageInfo(rts);
        map.put("pageInfo",pageInfo);
        map.put("status",true);

        return map;
    }

    @RequestMapping("/listRtsByCondition")
    @ResponseBody
    public Map<Object,Object> getRtsByCondition(String rtsName,String rtsAddress){

        Map<Object,Object> map=new HashMap<Object, Object>();
        RubbishTransferStation rts1=new RubbishTransferStation();
        if(!rtsName.equals("")) {
            rts1.setRtsName(rtsName);
        }
        if(!rtsAddress.equals("")){
            rts1.setRtsAddress(rtsAddress);
        }
        List<RubbishTransferStation> rts = rubbishTransferStationService.getRtsByConditionService(rts1);
        map.put("rts",rts);
        map.put("status",false);

        return map;
    }

    @RequestMapping("/getRtsDetail")
    @ResponseBody
    public RubbishTransferStation getRtsDetail(int id){
        return rubbishTransferStationService.getRtsDetailService(id);
    }

    @RequestMapping("/insertRts")
    @ResponseBody
    public Map<Object,Object> addRts(@RequestBody Map<String,Object> map){
        RubbishTransferStation rts=new RubbishTransferStation();
        rts.setRtsName((String) map.get("rtsName"));
        rts.setRtsAddress((String)map.get("rtsAddress"));
        rts.setRtsArea(Double.valueOf((String) map.get("rtsArea")));
        rts.setLng((String)map.get("lng"));
        rts.setLat((String)map.get("lat"));

        Map<Object,Object> map1=new HashMap<Object, Object>();

        int row=rubbishTransferStationService.addRtsService(rts);
        if(row>0){
            map1.put("result",true);
        }else {
            map1.put("result",false);
        }

        return map1;
    }

    @RequestMapping("/deleteOneRts")
    @ResponseBody
    public Map<Object,Object> deleteRts(int id){
        Map<Object,Object> map=new HashMap<Object, Object>();
        int row=rubbishTransferStationService.deleteRtsService(id);
        if(row>0){
            map.put("result",true);
        }else {
            map.put("result",false);
        }
        return map;
    }
}
