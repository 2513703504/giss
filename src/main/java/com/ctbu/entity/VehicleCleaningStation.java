package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : TangHao
 * @description : 环卫洗车场
 * @ClassName :VehicleCleaningStation
 * @createTime : 2022/3/20 14:43
 * @updateTime : 2022/3/20 14:43
 * @updateRemark : [说明本次修改内容]
 */
public class VehicleCleaningStation {

    @Autowired
    private Integer id;
    private String vcsName;
    private String vcsAddress;
    private Double vcsArea;

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

    public String getVcsName() {
        return vcsName;
    }

    public void setVcsName(String vcsName) {
        this.vcsName = vcsName;
    }

    public String getVcsAddress() {
        return vcsAddress;
    }

    public void setVcsAddress(String vcsAddress) {
        this.vcsAddress = vcsAddress;
    }

    public Double getVcsArea() {
        return vcsArea;
    }

    public void setVcsArea(Double vcsArea) {
        this.vcsArea = vcsArea;
    }
}
