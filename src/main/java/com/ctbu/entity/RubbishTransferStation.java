package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 垃圾转运站
 * @ClassName :RubbishTransferStation
 * @createTime : 2022/3/20 14:00
 * @updateTime : 2022/3/20 14:00
 * @updateRemark : [说明本次修改内容]
 */
public class RubbishTransferStation {

    @Autowired
    private Integer id;
    private String rtsName;
    private String rtsAddress;
    private Double rtsArea;
    private List<SanitationCar> sanitationCars;
    private List<Worker> workers;

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

    public String getRtsName() {
        return rtsName;
    }

    public void setRtsName(String rtsName) {
        this.rtsName = rtsName;
    }

    public String getRtsAddress() {
        return rtsAddress;
    }

    public void setRtsAddress(String rtsAddress) {
        this.rtsAddress = rtsAddress;
    }

    public Double getRtsArea() {
        return rtsArea;
    }

    public void setRtsArea(Double rtsArea) {
        this.rtsArea = rtsArea;
    }

    public List<SanitationCar> getSanitationCars() {
        return sanitationCars;
    }

    public void setSanitationCars(List<SanitationCar> sanitationCars) {
        this.sanitationCars = sanitationCars;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
