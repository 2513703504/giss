package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 街道
 * @ClassName :Street
 * @createTime : 2022/3/20 14:15
 * @updateTime : 2022/3/20 14:15
 * @updateRemark : [说明本次修改内容]
 */
public class Street {
    @Autowired
    private Integer id;
    private String streetName;
    private String streetAddress;
    private List<Bin> bins;
    private List<SanitationCar> cars;

    public List<SanitationCar> getCars() {
        return cars;
    }

    public void setCars(List<SanitationCar> cars) {
        this.cars = cars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public List<Bin> getBins() {
        return bins;
    }

    public void setBins(List<Bin> bins) {
        this.bins = bins;
    }

}
