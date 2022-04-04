package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : TangHao
 * @description : 环卫车辆
 * @ClassName :SanitationCar
 * @createTime : 2022/3/20 14:05
 * @updateTime : 2022/3/20 14:05
 * @updateRemark : [说明本次修改内容]
 */
public class SanitationCar {

    @Autowired
    private Integer id;
    private String scNumber;
    private String scType;
    private List<Worker> workers;
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScNumber() {
        return scNumber;
    }

    public void setScNumber(String scNumber) {
        this.scNumber = scNumber;
    }

    public String getScType() {
        return scType;
    }

    public void setScType(String scType) {
        this.scType = scType;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
