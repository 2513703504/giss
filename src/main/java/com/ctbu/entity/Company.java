package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : TangHao
 * @description : 环卫公司
 * @ClassName :Company
 * @createTime : 2022/3/20 9:32
 * @updateTime : 2022/3/20 9:32
 * @updateRemark : [说明本次修改内容]
 */
public class Company {

    @Autowired
    private Integer id;
    private String companyName;
    private String companyAddress;
    private String lng;
    private String lat;

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }
    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }


}
