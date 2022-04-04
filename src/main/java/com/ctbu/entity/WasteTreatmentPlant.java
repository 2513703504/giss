package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 粪便处理场
 * @ClassName :WasteTreatmentPlant
 * @createTime : 2022/3/20 14:44
 * @updateTime : 2022/3/20 14:44
 * @updateRemark : [说明本次修改内容]
 */
public class WasteTreatmentPlant {

    @Autowired
    private Integer id;
    private String wtpName;
    private String wtpAddress;
    private Double wtpArea;
    private List<SanitationCar> cars;

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

    public String getWtpName() {
        return wtpName;
    }

    public void setWtpName(String wtpName) {
        this.wtpName = wtpName;
    }

    public String getWtpAddress() {
        return wtpAddress;
    }

    public void setWtpAddress(String wtpAddress) {
        this.wtpAddress = wtpAddress;
    }

    public Double getWtpArea() {
        return wtpArea;
    }

    public void setWtpArea(Double wtpArea) {
        this.wtpArea = wtpArea;
    }

    public List<SanitationCar> getCars() {
        return cars;
    }

    public void setCars(List<SanitationCar> cars) {
        this.cars = cars;
    }
}
