package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : TangHao
 * @description : 环卫停车场
 * @ClassName :SanitationVehiclesPark
 * @createTime : 2022/3/20 14:12
 * @updateTime : 2022/3/20 14:12
 * @updateRemark : [说明本次修改内容]
 */
public class SanitationVehiclesPark {

    @Autowired
    private Integer id;
    private String svpName;
    private String svpAddress;
    private Double svpArea;

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

    public String getSvpName() {
        return svpName;
    }

    public void setSvpName(String svpName) {
        this.svpName = svpName;
    }

    public String getSvpAddress() {
        return svpAddress;
    }

    public void setSvpAddress(String svpAddress) {
        this.svpAddress = svpAddress;
    }

    public Double getSvpArea() {
        return svpArea;
    }

    public void setSvpArea(Double svpArea) {
        this.svpArea = svpArea;
    }
}
