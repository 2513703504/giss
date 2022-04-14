package com.ctbu.controller;

import com.ctbu.entity.WaterData;
import com.ctbu.service.WaterDataService;
import com.ctbu.utils.DataPredict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :WaterDataController
 * @createTime : 2022/4/14 9:36
 * @updateTime : 2022/4/14 9:36
 * @updateRemark : [说明本次修改内容]
 */
@Controller
@ResponseBody
@CrossOrigin
public class WaterDataController {

    @Autowired
    private WaterDataService waterDataService;

    @RequestMapping("/getWaterData")
    public Map<Object,Object> getWaterData(){
        Map<Object,Object> map=new HashMap<Object, Object>();

        WaterData waterData=waterDataService.getDataService();
        System.out.println(waterData);
        List<Integer> numbers=waterData.getNumber();

        List<Integer> years=waterData.getYear();

        int[] predictResult = DataPredict.predict(numbers,years);

        numbers.add(predictResult[0]);
        years.add(predictResult[1]);

        map.put("numbers",numbers);
        map.put("years",years);

        return map;
    }
}
