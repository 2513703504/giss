package com.ctbu.controller;

import com.ctbu.entity.WaterData;
import com.ctbu.service.WaterDataService;
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
 * @ClassName :WaterDataController
 * @createTime : 2022/4/14 9:36
 * @updateTime : 2022/4/14 9:36
 * @updateRemark : [说明本次修改内容]
 */
@Controller
@ResponseBody
@CrossOrigin
@SuppressWarnings("all")
public class WaterDataController {

    @Autowired
    private WaterDataService waterDataService;

    @RequestMapping("/getWaterData")
    public Map<Object,Object> getWaterData(){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<WaterData> waterDatas=waterDataService.getDataService();
        List<Integer> numbers=new ArrayList<Integer>();

        List<Integer> years=new ArrayList<Integer>();

        for (WaterData wd: waterDatas) {
            numbers.add(wd.getNumber());
            years.add(wd.getYear());
        }
        int[] predictResult = DataPredict.predict(numbers,years);

        numbers.add(predictResult[0]);
        years.add(predictResult[1]);

        map.put("numbers",numbers);
        map.put("years",years);

        return map;
    }
}
