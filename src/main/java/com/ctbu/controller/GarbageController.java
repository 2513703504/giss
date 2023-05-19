package com.ctbu.controller;

import com.ctbu.entity.GarbageData;
import com.ctbu.service.GarbageDataService;
import com.ctbu.utils.DataPredict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :GarbageController
 * @createTime : 2022/4/14 10:44
 * @updateTime : 2022/4/14 10:44
 * @updateRemark : [说明本次修改内容]
 */
@CrossOrigin
@Controller
@ResponseBody
@SuppressWarnings("all")
public class GarbageController {

    @Autowired
    private GarbageDataService garbageDataService;

    @RequestMapping("/getGarbageData")
    public Map<Object,Object> getGarbageData(){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<GarbageData> garbageDatas=garbageDataService.getDataService();


        List<Integer> numbers=new ArrayList<Integer>();

        List<Integer> years=new ArrayList<Integer>();
        for (GarbageData gd :garbageDatas) {
            numbers.add(gd.getNumber());
            years.add(gd.getYear());
        }
        int[] predictResult = DataPredict.predict(numbers,years);

        numbers.add(predictResult[0]);
        years.add(predictResult[1]);

        map.put("numbers",numbers);
        map.put("years",years);

        return map;
    }
}
