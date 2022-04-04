package com.ctbu.controller;

import com.ctbu.entity.Landfill;
import com.ctbu.service.LandfillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :LandfillController
 * @createTime : 2022/3/20 11:09
 * @updateTime : 2022/3/20 11:09
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class LandfillController {
    @Autowired
    private LandfillService landfillService;

    @RequestMapping("/listLandfills")
    @ResponseBody
    public List<Landfill> getAllLandfills(){
        return landfillService.getAllLandfillService();
    }

    @RequestMapping("/getLandfillDetail")
    @ResponseBody
    public Landfill getLandFillDetail(int id){
        return landfillService.getLandfillDetailService(id);
    }
}
