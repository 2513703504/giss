package com.ctbu.service.impl;

import com.ctbu.entity.Street;
import com.ctbu.mapper.StreetMapper;
import com.ctbu.service.StreetService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :StreetServiceImpl
 * @createTime : 2022/3/20 15:56
 * @updateTime : 2022/3/20 15:56
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class StreetServiceImpl implements StreetService {

    @Autowired
    private StreetMapper streetMapper;

    /**
     * 查询所有街道信息
     *
     * @return
     */
    public List<Street> getAllStreetService() {
        return streetMapper.getAllStreet();
    }

    /**
     * 分页显示街道信息
     *
     * @param currPage
     * @return
     */
    public List<Street> getStreetByPageService(int currPage) {

        PageHelper.startPage(currPage,8);
        return streetMapper.getStreetByPage();
    }

    /**
     * 条件查询街道
     *
     * @param street
     * @return
     */
    public List<Street> getStreetByConditionService(Street street) {
        return streetMapper.getStreetByCondition(street);
    }

    /**
     * 查询街道信息
     *
     * @param id
     * @return
     */
    public Street getStreetDetailService(int id) {
        return streetMapper.getStreetDetail(id);
    }
}
