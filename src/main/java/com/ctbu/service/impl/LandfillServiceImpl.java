package com.ctbu.service.impl;

import com.ctbu.entity.Landfill;
import com.ctbu.mapper.LandfillMapper;
import com.ctbu.service.LandfillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :LandfillServiceImpl
 * @createTime : 2022/3/20 11:04
 * @updateTime : 2022/3/20 11:04
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class LandfillServiceImpl implements LandfillService {

    @Autowired
    private LandfillMapper landfillMapper;

    public List<Landfill> getAllLandfillService(){
        return landfillMapper.getAllLandfills();
    }

    /**
     * 显示垃圾填埋场详细信息
     *
     * @param id
     * @return
     */
    public Landfill getLandfillDetailService(int id) {
        return landfillMapper.getLandfillDetail(id);
    }
}
