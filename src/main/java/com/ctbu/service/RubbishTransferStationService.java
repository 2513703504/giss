package com.ctbu.service;

import com.ctbu.entity.RubbishTransferStation;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :RubbishTransferStationService
 * @createTime : 2022/3/20 15:48
 */
public interface RubbishTransferStationService {

    /**
     * 查询所有垃圾中转战
     * @return
     */
    List<RubbishTransferStation> getAllRtsService();

    /**
     * 分页显示所有垃圾中转站
     * @param currPage
     * @return
     */
    List<RubbishTransferStation> getRtsByPageService(int currPage);

    /**
     * 条件查询
     * @param rubbishTransferStation
     * @return
     */
    List<RubbishTransferStation> getRtsByConditionService(RubbishTransferStation rubbishTransferStation);

    /**
     * 查询垃圾转运站详细信息
     * @param id
     * @return
     */
    RubbishTransferStation getRtsDetailService(int id);

    /**
     * 添加垃圾转运站
     * @param rts
     * @return
     */
    int addRtsService(RubbishTransferStation rts);

    /**
     * 删除垃圾转运站
     * @param id
     * @return
     */
    int deleteRtsService(int id);
}
