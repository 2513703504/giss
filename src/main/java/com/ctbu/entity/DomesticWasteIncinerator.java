package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 垃圾焚烧发电厂
 * @ClassName :DomesticWasteIncinerator
 * @createTime : 2022/3/20 10:24
 * @updateTime : 2022/3/20 10:24
 * @updateRemark : [说明本次修改内容]
 */
public class DomesticWasteIncinerator {


    @Autowired
    private Integer id;
    private String dwiName;
    private String dwiAddress;
    private double dwiArea;
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

    public String getDwiName() {
        return dwiName;
    }

    public void setDwiName(String dwiName) {
        this.dwiName = dwiName;
    }

    public String getDwiAddress() {
        return dwiAddress;
    }

    public void setDwiAddress(String dwiAddress) {
        this.dwiAddress = dwiAddress;
    }

    public double getDwiArea() {
        return dwiArea;
    }

    public void setDwiArea(double dwiArea) {
        this.dwiArea = dwiArea;
    }

    public List<SanitationCar> getCars() {
        return cars;
    }

    public void setCars(List<SanitationCar> cars) {
        this.cars = cars;
    }
}
