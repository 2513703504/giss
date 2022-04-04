package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : TangHao
 * @description : 环卫工人
 * @ClassName :Worker
 * @createTime : 2022/3/20 13:56
 * @updateTime : 2022/3/20 13:56
 * @updateRemark : [说明本次修改内容]
 */
public class Worker {

    @Autowired
    private Integer id;
    private String workerName;
    private String idNumber;
    private Integer age;
    private String address;
    private Company company;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}