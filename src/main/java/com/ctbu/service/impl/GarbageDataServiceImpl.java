package com.ctbu.service.impl;

import com.ctbu.entity.GarbageData;
import com.ctbu.mapper.GarbageDataMapper;
import com.ctbu.service.GarbageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : TangHao
 * @description :
 * @ClassName :GarbageDataServiceImpl
 * @createTime : 2022/4/14 9:34
 * @updateTime : 2022/4/14 9:34
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class GarbageDataServiceImpl implements GarbageDataService {

    @Autowired
    private GarbageDataMapper garbageDataMapper;
    /**
     * 获取数据
     *
     * @return
     */
    public GarbageData getDataService() {
        return garbageDataMapper.getData();
    }
}
