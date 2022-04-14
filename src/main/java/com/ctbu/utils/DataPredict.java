package com.ctbu.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :DataPredict
 * @createTime : 2022/4/14 9:48
 * @updateTime : 2022/4/14 9:48
 * @updateRemark : [说明本次修改内容]
 */
public class DataPredict {

    public static int[] predict(List<Integer> numbers,List<Integer> years){
        double m=0;
        double n=0;
        double x=0;
        double y=0;
        int length=numbers.size();

        for (int i = 0; i < length; i++) {
            m += numbers.get(i)*years.get(i);
            x += years.get(i);
            y += numbers.get(i);
            n += years.get(i)*years.get(i);
        }

        double b=(length*m-(x*y))/((length*n)-x*x);
        double a=(y-b*x)/length;

        double result = a+b*(years.get(length-1)+1);

        return new int[] {(int) Math.round(result),years.get(length-1)+1};
    }

//    public static void main(String[] args) {
//        List<Integer> number=new ArrayList<Integer>();
//        number.add(200);
//        number.add(225);
//        number.add(224);
//        number.add(256);
//        List<Integer> year=new ArrayList<Integer>();
//        year.add(2007);
//        year.add(2008);
//        year.add(2009);
//        year.add(2010);
//
//        int[] result=predictWater(number,year);
//
//        System.out.println(Arrays.toString(result));
//    }

}
