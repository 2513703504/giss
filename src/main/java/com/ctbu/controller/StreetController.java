package com.ctbu.controller;

import com.ctbu.entity.Street;
import com.ctbu.service.StreetService;
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
 * @ClassName :StreetController
 * @createTime : 2022/3/20 16:12
 * @updateTime : 2022/3/20 16:12
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class StreetController {

    @Autowired
    private StreetService streetService;

    @RequestMapping("/listStreet")
    @ResponseBody
    public List<Street> getAllStreet(){
        return streetService.getAllStreetService();
    }

    @RequestMapping("/listStreetByPage")
    @ResponseBody
    public Map<Object,Object> getStreetByPage(int currPage){
        Map<Object,Object> map=new HashMap<Object, Object>();
        List<Street> streets=streetService.getStreetByPageService(currPage);
        if(streets.size()==0){
            streets=streetService.getStreetByPageService(currPage-1);
        }

        PageInfo pageInfo=new PageInfo(streets);

        map.put("streets",streets);
        map.put("pageInfo",pageInfo);
        map.put("status",true);
        return map;
    }

    @RequestMapping("/listStreetByCondition")
    @ResponseBody
    public Map<Object,Object> getStreetByCondition(String streetName,String streetAddress){
        Map<Object,Object> map=new HashMap<Object, Object>();
        Street street=new Street();
        if(!streetName.equals("")){
            street.setStreetName(streetName);
        }
        if(!streetAddress.equals("")){
            street.setStreetAddress(streetAddress);
        }
        List<Street> streets=streetService.getStreetByConditionService(street);
        map.put("streets",streets);
        map.put("status",false);
        return map;
    }

    @RequestMapping("/getStreetDetail")
    @ResponseBody
    public Street getStreetDetail(int id){
        return streetService.getStreetDetailService(id);
    }
}
