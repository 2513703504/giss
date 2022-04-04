package com.ctbu.mapper;

import com.ctbu.entity.Street;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :StreetMapper
 * @createTime : 2022/3/20 15:43
 */
public interface StreetMapper {

    /**
     * 查询所有街道信息
     * @return
     */
    List<Street> getAllStreet();

    /**
     * 分页显示街道信息
     * @return
     */
    List<Street> getStreetByPage();

    /**
     * 条件查询街道信息
     * @param street
     * @return
     */
    List<Street> getStreetByCondition(Street street);

    /**
     * 查询街道详细信息
     * @param id
     * @return
     */
    Street getStreetDetail(int id);
}
