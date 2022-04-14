package com.ctbu.entity;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :GarbageData
 * @createTime : 2022/4/14 9:24
 * @updateTime : 2022/4/14 9:24
 * @updateRemark : [说明本次修改内容]
 */
public class GarbageData {

    private List<Integer> numbers;
    private List<Integer> years;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getYears() {
        return years;
    }

    public void setYears(List<Integer> years) {
        this.years = years;
    }
}
