package com.ctbu.controller;

import com.ctbu.entity.PublicLavatory;
import com.ctbu.service.PublicLavatoryService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :PublicLavatoryController
 * @createTime : 2022/3/20 16:10
 * @updateTime : 2022/3/20 16:10
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class PublicLavatoryController {


    @Autowired
    private PublicLavatoryService publicLavatoryService;

    @RequestMapping("/listPl")
    @ResponseBody
    public List<PublicLavatory> getAllPl(){
        return publicLavatoryService.getPlService();
    }

    @RequestMapping("/listPlByPage")
    @ResponseBody
    public Map<Object, Object> getPlByPage(int currPage){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<PublicLavatory> publicLavatories=publicLavatoryService.getPlByPageService(currPage);
        if(publicLavatories.size()==0){
            publicLavatories=publicLavatoryService.getPlByPageService(currPage-1);
        }
        PageInfo pageInfo=new PageInfo(publicLavatories);
        map.put("publicLavatories",publicLavatories);
        map.put("status",true);
        map.put("pageInfo",pageInfo);
        return map;

    }

    @RequestMapping("/listPlByCondition")
    @ResponseBody
    public Map<Object, Object> getPlByCondition(String  plAddress){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<PublicLavatory> publicLavatories=publicLavatoryService.getPlByConditionService(plAddress);
        map.put("publicLavatories",publicLavatories);
        map.put("status",false);
        return map;
    }

    @RequestMapping("/getPlDetail")
    @ResponseBody
    public PublicLavatory getPlDetail(int id){
        return publicLavatoryService.getPlDetailService(id);
    }

    @RequestMapping("/deleteOnePl")
    @ResponseBody
    public Map<Object,Object> deleteOnePl(Integer id){
        Map<Object,Object> map=new HashMap<Object, Object>();
        int row = publicLavatoryService.deleteOnePlService(id);
        if(row>0){
            map.put("result",true);
        }else {
            map.put("result",false);
        }
        return map;
    }

    @RequestMapping(value = "/insertPl",method =RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Map<Object,Object> insertPl(@RequestBody  Map<String,Object> map){
        String plName=(String) map.get("plName");
        String plAddress =(String) map.get("plAddress");
        String plArea = (String) map.get("plArea");
        String lng=(String) map.get("lng");
        String lat=(String) map.get("lat");

        PublicLavatory publicLavatory = new PublicLavatory();
        publicLavatory.setPlName(plName);
        publicLavatory.setPlAddress(plAddress);
        publicLavatory.setPlArea(Double.valueOf(plArea));
        publicLavatory.setLng(lng);
        publicLavatory.setLat(lat);

        System.out.println(publicLavatory);
        Map<Object,Object> map2=new HashMap<Object, Object>();
        int row = publicLavatoryService.insertPlService(publicLavatory);
        if(row>0){
            map2.put("result",true);
        }else {
            map2.put("result",false);
        }
        return map2;
    }
}
