package com.ctbu.controller;

import com.ctbu.entity.DomesticWasteIncinerator;
import com.ctbu.service.DomesticWasteIncineratorService;
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
 * @ClassName :DomesticWasteIncineratorController
 * @createTime : 2022/3/20 10:44
 * @updateTime : 2022/3/20 10:44
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class DomesticWasteIncineratorController {

    @Autowired
    private DomesticWasteIncineratorService domesticWasteIncineratorService;

    @RequestMapping("/listDwi")
    @ResponseBody
    public List<DomesticWasteIncinerator> getAllDwi(){
        return domesticWasteIncineratorService.getAllDwiService();
    }

    @RequestMapping("/listDwiByPage")
    @ResponseBody
    public Map<Object,Object> getCompanyByPage(int currPage){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<DomesticWasteIncinerator> dwi = domesticWasteIncineratorService.getDwiByPageService(currPage);
        if(dwi.size()==0){
            dwi= domesticWasteIncineratorService.getDwiByPageService(currPage-1);
        }
        map.put("dwi",dwi);
        PageInfo pageInfo=new PageInfo(dwi);
        map.put("pageInfo",pageInfo);

        return map;
    }

    @RequestMapping("/getDwiDetail")
    @ResponseBody
    public DomesticWasteIncinerator getDwiDetail(int id){
        return domesticWasteIncineratorService.getDwiDetailService(id);
    }
}
