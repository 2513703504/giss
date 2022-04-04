package com.ctbu.service.impl;

import com.ctbu.entity.DomesticWasteIncinerator;
import com.ctbu.mapper.DomesticWasteIncineratorMapper;
import com.ctbu.service.DomesticWasteIncineratorService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :DomesticWasteIncineratorServiceImpl
 * @createTime : 2022/3/20 10:40
 * @updateTime : 2022/3/20 10:40
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class DomesticWasteIncineratorServiceImpl implements DomesticWasteIncineratorService {

    @Autowired
    private DomesticWasteIncineratorMapper domesticWasteIncineratorMapper;
    /**
     * 查询所有垃圾焚烧场
     *
     * @return
     */
    public List<DomesticWasteIncinerator> getAllDwiService() {
        return domesticWasteIncineratorMapper.getAllDwi();
    }

    /**
     * 分页查询垃圾焚烧厂
     *
     * @return
     */
    public List<DomesticWasteIncinerator> getDwiByPageService(int currPage) {
        PageHelper.startPage(currPage,7);
        return domesticWasteIncineratorMapper.getDwiByPage();
    }

    /**
     * 查询垃圾焚烧厂详细信息
     *
     * @param id
     * @return
     */
    public DomesticWasteIncinerator getDwiDetailService(int id) {
        return domesticWasteIncineratorMapper.getDwiDetail(id);
    }
}
