package com.ctbu.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : TangHao
 * @description : 垃圾箱
 * @ClassName :bin
 * @createTime : 2022/3/20 14:23
 * @updateTime : 2022/3/20 14:23
 * @updateRemark : [说明本次修改内容]
 */
public class Bin {

    @Autowired
    private Integer id;
    private String binNumber;
    private String binAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    public String getBinAddress() {
        return binAddress;
    }

    public void setBinAddress(String binAddress) {
        this.binAddress = binAddress;
    }

}
