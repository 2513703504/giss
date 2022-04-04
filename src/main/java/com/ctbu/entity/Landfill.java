package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 垃圾填埋场
 * @ClassName :DomesticWasteIncinerator
 * @createTime : 2022/3/20 10:24
 * @updateTime : 2022/3/20 10:24
 * @updateRemark : [说明本次修改内容]
 */
public class Landfill {

    @Autowired
    private Integer id;
    private String landfillName;
    private String landfillAddress;
    private double landfillArea;
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

    public String getLandfillName() {
        return landfillName;
    }

    public void setLandfillName(String landfillName) {
        this.landfillName = landfillName;
    }

    public String getLandfillAddress() {
        return landfillAddress;
    }

    public void setLandfillAddress(String landfillAddress) {
        this.landfillAddress = landfillAddress;
    }

    public double getLandfillArea() {
        return landfillArea;
    }

    public void setLandfillArea(double landfillArea) {
        this.landfillArea = landfillArea;
    }

    public List<SanitationCar> getCars() {
        return cars;
    }

    public void setCars(List<SanitationCar> cars) {
        this.cars = cars;
    }
}
