package com.ctbu.service;

import com.ctbu.entity.Street;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :StreetService
 * @createTime : 2022/3/20 15:49
 */
public interface StreetService {

    /**
     * 查询所有街道信息
     * @return
     */
    List<Street> getAllStreetService();

    /**
     * 分页显示街道信息
     * @param currPage
     * @return
     */
    List<Street> getStreetByPageService(int currPage);

    /**
     * 条件查询街道
     * @param street
     * @return
     */
    List<Street> getStreetByConditionService(Street street);

    /**
     * 查询街道信息
     * @param id
     * @return
     */
    Street getStreetDetailService(int id);
}
