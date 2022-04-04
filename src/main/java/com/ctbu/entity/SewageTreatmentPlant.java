package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 污水处理厂
 * @ClassName :SewageTreatmentPlant
 * @createTime : 2022/3/20 14:14
 * @updateTime : 2022/3/20 14:14
 * @updateRemark : [说明本次修改内容]
 */
public class SewageTreatmentPlant {
    @Autowired
    private Integer id;
    private String stpName;
    private String stpAddress;
    private Double stpArea;
    private String lng;
    private String lat;
    private List<SanitationCar> cars;
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

    public String getStpName() {
        return stpName;
    }

    public void setStpName(String stpName) {
        this.stpName = stpName;
    }

    public String getStpAddress() {
        return stpAddress;
    }

    public void setStpAddress(String stpAddress) {
        this.stpAddress = stpAddress;
    }

    public Double getStpArea() {
        return stpArea;
    }

    public void setStpArea(Double stpArea) {
        this.stpArea = stpArea;
    }

    public List<SanitationCar> getCars() {
        return cars;
    }

    public void setCars(List<SanitationCar> cars) {
        this.cars = cars;
    }
}
