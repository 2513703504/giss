package com.ctbu.mapper;

import com.ctbu.entity.DomesticWasteIncinerator;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :DomesticWasteIncineratorMapper
 * @createTime : 2022/3/20 10:28
 */
public interface DomesticWasteIncineratorMapper {
    /**
     * 查询所有垃圾焚烧厂
     * @return
     */
    List<DomesticWasteIncinerator> getAllDwi();

    /**
     * 分页查询垃圾焚烧厂
     * @return
     */
    List<DomesticWasteIncinerator> getDwiByPage();

    /**
     * 查询垃圾焚烧厂详细信息
     * @param id
     * @return
     */
    DomesticWasteIncinerator getDwiDetail(int id);
}
