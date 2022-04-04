package com.ctbu.service;

import com.ctbu.entity.Landfill;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :LandfillService
 * @createTime : 2022/3/20 11:04
 */
public interface LandfillService {

    /**
     * 查询所有垃圾填埋场
     * @return
     */
    List<Landfill> getAllLandfillService();

    /**
     * 显示垃圾填埋场详细信息
     * @param id
     * @return
     */
    Landfill getLandfillDetailService(int id);
}
