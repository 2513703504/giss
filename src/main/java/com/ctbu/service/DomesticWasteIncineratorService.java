package com.ctbu.service;

import com.ctbu.entity.DomesticWasteIncinerator;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :DomesticWasteIncineratorService
 * @createTime : 2022/3/20 10:37
 */
public interface DomesticWasteIncineratorService {
    /**
     * 查询所有垃圾焚烧场
     * @return
     */
    List<DomesticWasteIncinerator> getAllDwiService();

    /**
     * 分页查询垃圾焚烧厂
     * @return
     * @param currPage
     */
    List<DomesticWasteIncinerator> getDwiByPageService(int currPage);

    /**
     * 查询垃圾焚烧厂详细信息
     * @param id
     * @return
     */
    DomesticWasteIncinerator getDwiDetailService(int id);
}
