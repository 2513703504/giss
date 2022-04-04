package com.ctbu.service;

import com.ctbu.entity.Bin;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :BinService
 * @createTime : 2022/3/20 15:47
 */
public interface BinService {

    /**
     * 查询所有的垃圾箱
     * @return
     */
    List<Bin> getAllBinsService();
}
