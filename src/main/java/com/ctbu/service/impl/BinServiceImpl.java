package com.ctbu.service.impl;

import com.ctbu.entity.Bin;
import com.ctbu.mapper.BinMapper;
import com.ctbu.service.BinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :BinServiceImpl
 * @createTime : 2022/3/20 15:52
 * @updateTime : 2022/3/20 15:52
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class BinServiceImpl implements BinService {

    @Autowired
    private BinMapper binMapper;

    /**
     * 查询所有的垃圾箱
     *
     * @return
     */
    public List<Bin> getAllBinsService() {
        return binMapper.getAllBins();
    }
}
