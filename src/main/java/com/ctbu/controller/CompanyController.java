package com.ctbu.controller;

import com.ctbu.entity.Company;
import com.ctbu.service.CompanyService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :CompanyController
 * @createTime : 2022/3/20 9:49
 * @updateTime : 2022/3/20 9:49
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/listCompany")
    @ResponseBody
    public List<Company> getAllCompany(){
        return companyService.getAllCompanyService();
    }

    @RequestMapping("/listCompanyByPage")
    @ResponseBody
    public Map<Object,Object> getCompanyByPage(int currPage){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<Company> companies = companyService.getCompanyByPageService(currPage);
        if(companies.size()==0){
            companies=companyService.getCompanyByPageService(currPage-1);
        }
        map.put("companies",companies);
        PageInfo pageInfo=new PageInfo(companies);
        map.put("pageInfo",pageInfo);
        map.put("status",true);

        return map;
    }

    @RequestMapping("/listCompanyByCondition")
    @ResponseBody
    public Map<Object,Object> getCompanyByCondition(String companyName,String companyAddress){

        Map<Object,Object> map=new HashMap<Object, Object>();
        Company company=new Company();
        if(!companyName.equals("")) {
            company.setCompanyName(companyName);
        }
        if(!companyAddress.equals("")){
            company.setCompanyAddress(companyAddress);
        }
        List<Company> companies = companyService.getCompanyByConditionService(company);
        map.put("companies",companies);
        map.put("status",false);
        return map;
    }

    @RequestMapping("/insertCompany")
    @ResponseBody
    public Map<Object,Object> addCompany(@RequestBody Map<String,Object> map){
        Map<Object,Object> map1=new HashMap<Object, Object>();
        Company company=new Company();
        company.setCompanyName((String)map.get("companyName"));
        company.setCompanyAddress((String)map.get("companyAddress"));
        company.setLng((String)map.get("lng"));
        company.setLat((String)map.get("lat"));

        int row=companyService.addCompanyService(company);

        if(row>0){
            map1.put("result",true);
        }else {
            map1.put("result",false);
        }

        return map1;
    }

    @RequestMapping("/deleteCompany")
    @ResponseBody
    public Map<Object,Object> deleteCompany(int id){
        Map<Object,Object> map1=new HashMap<Object, Object>();
        int row=companyService.deleteCompanyService(id);
        if(row>0){
            map1.put("result",true);
        }else {
            map1.put("result",false);
        }
        return map1;
    }

    @RequestMapping("/updateCompany")
    @ResponseBody
    public Map<Object,Object> updateCompany(@RequestBody Map<String,Object> map){
        Map<Object,Object> map1=new HashMap<Object, Object>();
        Company company=new Company();
        company.setId(((Integer) map.get("id")));
        company.setCompanyName((String)map.get("companyName"));
        company.setCompanyAddress((String)map.get("companyAddress"));
        company.setLng((String)map.get("lng"));
        company.setLat((String)map.get("lat"));

        System.out.println(company);
        int row=companyService.updateCompanyService(company);

        if(row>0){
            map1.put("result",true);
        }else {
            map1.put("result",false);
        }

        return map1;
    }

}
