package com.ctbu.entity;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :WaterData
 * @createTime : 2022/4/14 9:23
 * @updateTime : 2022/4/14 9:23
 * @updateRemark : [说明本次修改内容]
 */
public class WaterData {

    private List<Integer> numbers;
    private List<Integer> years;

    public List<Integer> getNumber() {
        return numbers;
    }

    public void setNumber(List<Integer> number) {
        this.numbers = number;
    }

    public List<Integer> getYear() {
        return years;
    }

    public void setYear(List<Integer> year) {
        this.years = year;
    }
}
