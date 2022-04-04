package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 公共厕所
 * @ClassName :PublicLavatory
 * @createTime : 2022/3/20 13:53
 * @updateTime : 2022/3/20 13:53
 * @updateRemark : [说明本次修改内容]
 */
public class PublicLavatory {

    @Autowired
    private Integer id;
    private String plName;
    private String plAddress;
    private Double plArea;
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

    public String getPlName() {
        return plName;
    }

    public void setPlName(String plName) {
        this.plName = plName;
    }

    public String getPlAddress() {
        return plAddress;
    }

    public void setPlAddress(String plAddress) {
        this.plAddress = plAddress;
    }

    public Double getPlArea() {
        return plArea;
    }

    public void setPlArea(Double plArea) {
        this.plArea = plArea;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "PublicLavatory{" +
                "id=" + id +
                ", plName='" + plName + '\'' +
                ", plAddress='" + plAddress + '\'' +
                ", plArea=" + plArea +
                ", workers=" + workers +
                ", lng='" + lng + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
