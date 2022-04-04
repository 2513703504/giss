package com.ctbu.service.impl;

import com.ctbu.entity.RubbishTransferStation;
import com.ctbu.mapper.RubbishTransferStationMapper;
import com.ctbu.service.RubbishTransferStationService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :RubbishTransferStationServiceImpl
 * @createTime : 2022/3/20 15:53
 * @updateTime : 2022/3/20 15:53
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class RubbishTransferStationServiceImpl implements RubbishTransferStationService {

    @Autowired
    private RubbishTransferStationMapper rubbishTransferStationMapper;


    /**
     * 查询所有垃圾中转战
     *
     * @return
     */
    public List<RubbishTransferStation> getAllRtsService() {
        return rubbishTransferStationMapper.getAllRts();
    }

    /**
     * 分页显示所有垃圾中转站
     *
     * @param currPage
     * @return
     */
    public List<RubbishTransferStation> getRtsByPageService(int currPage) {
        PageHelper.startPage(currPage,7);

        return rubbishTransferStationMapper.getRtsByPage();
    }

    /**
     * 条件查询
     *
     * @param rubbishTransferStation
     * @return
     */
    public List<RubbishTransferStation> getRtsByConditionService(RubbishTransferStation rubbishTransferStation) {

        return rubbishTransferStationMapper.getRtsByCondition(rubbishTransferStation);
    }

    /**
     * 查询垃圾转运站详细信息
     *
     * @param id
     * @return
     */
    public RubbishTransferStation getRtsDetailService(int id) {
        return rubbishTransferStationMapper.getRtsDetail(id);
    }

    /**
     * 添加垃圾转运站
     *
     * @param rts
     * @return
     */
    public int addRtsService(RubbishTransferStation rts) {
        return rubbishTransferStationMapper.addRts(rts);
    }

    /**
     * 删除垃圾转运站
     *
     * @param id
     * @return
     */
    public int deleteRtsService(int id) {
        return rubbishTransferStationMapper.deleteRts(id);
    }
}
