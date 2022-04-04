package com.ctbu.mapper;

import com.ctbu.entity.RubbishTransferStation;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :RubbishTransferStationMapper
 * @createTime : 2022/3/20 15:41
 */
public interface RubbishTransferStationMapper {

    /**
     * 查询所有垃圾中转站
     * @return
     */
    List<RubbishTransferStation> getAllRts();

    /**
     * 分页显示垃圾中转站
     * @return
     */
    List<RubbishTransferStation> getRtsByPage();

    /**
     * 条件查询
     * @return
     * @param rubbishTransferStation
     */
    List<RubbishTransferStation> getRtsByCondition(RubbishTransferStation rubbishTransferStation);

    /**
     * 查询垃圾转运站详细信息
     * @param id
     * @return
     */
    RubbishTransferStation getRtsDetail(int id);

    /**
     * 添加垃圾转运站
     * @param rts
     * @return
     */
    int addRts(RubbishTransferStation rts);

    /**
     * 删除垃圾转运站
     * @param id
     * @return
     */
    int deleteRts(int id);
}
