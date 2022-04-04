package com.ctbu.mapper;

import com.ctbu.entity.DomesticWasteIncinerator;
import com.ctbu.entity.Landfill;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :DomesticWasteIncineratorMapper
 * @createTime : 2022/3/20 10:28
 */
public interface LandfillMapper {
    /**
     * 查询所有垃圾填埋厂
     * @return
     */
    List<Landfill> getAllLandfills();

    /**
     * 显示垃圾填埋场详细信息
     * @param id
     * @return
     */
    Landfill getLandfillDetail(int id);
}
