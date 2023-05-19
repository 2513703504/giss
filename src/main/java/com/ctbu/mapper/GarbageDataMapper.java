package com.ctbu.mapper;

import com.ctbu.entity.GarbageData;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :GarbageDataMapper
 * @createTime : 2022/4/14 9:31
 */
public interface GarbageDataMapper {
    /**
     * 获取数据
     * @return
     */
    List<GarbageData> getData();
}
