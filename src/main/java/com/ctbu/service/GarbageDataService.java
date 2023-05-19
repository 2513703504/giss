package com.ctbu.service;

import com.ctbu.entity.GarbageData;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :GarbageDataService
 * @createTime : 2022/4/14 9:34
 */
public interface GarbageDataService {
    /**
     * 获取数据
     * @return
     */
    List<GarbageData> getDataService();
}
