package com.ctbu.controller;

import com.ctbu.entity.Bin;
import com.ctbu.service.BinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :BinController
 * @createTime : 2022/3/20 16:10
 * @updateTime : 2022/3/20 16:10
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class BinController {

    @Autowired
    private BinService binService;

    @RequestMapping("/listBins")
    @ResponseBody
    public List<Bin> getAllBins(){
        return binService.getAllBinsService();
    }
}
