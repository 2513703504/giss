package com.ctbu.mapper;

import com.ctbu.entity.Bin;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :BinMapper
 * @createTime : 2022/3/20 15:39
 */
public interface BinMapper {

    /**
     * 查询所有垃圾箱
     * @return
     */
    List<Bin> getAllBins();
}
