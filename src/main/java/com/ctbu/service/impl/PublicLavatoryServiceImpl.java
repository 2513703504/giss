package com.ctbu.service.impl;

import com.ctbu.entity.PublicLavatory;
import com.ctbu.mapper.PublicLavatoryMapper;
import com.ctbu.service.PublicLavatoryService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :PublicLavatoryServiceImpl
 * @createTime : 2022/3/20 15:52
 * @updateTime : 2022/3/20 15:52
 * @updateRemark : [说明本次修改内容]
 */@Service
public class PublicLavatoryServiceImpl implements PublicLavatoryService {

     @Autowired
    private PublicLavatoryMapper publicLavatoryMapper;

    /**
     * 查询所有公厕
     *
     * @return
     */
    public List<PublicLavatory> getPlService() {
        return publicLavatoryMapper.getAllPl();
    }

    /**
     * 分页查询公厕
     *
     * @param currPage
     * @return
     */
    public List<PublicLavatory> getPlByPageService(int currPage) {

        PageHelper.startPage(currPage,8);

        return publicLavatoryMapper.getPlByPage();
    }

    /**
     * 条件查询
     *
     * @param plAddress
     * @return
     */
    public List<PublicLavatory> getPlByConditionService(String plAddress) {
        PublicLavatory publicLavatory=new PublicLavatory();
        if(!plAddress.equals("")){
            publicLavatory.setPlAddress(plAddress);
        }
        return publicLavatoryMapper.getPlByCondition(publicLavatory);
    }

    /**
     * 显示公厕详细信息
     *
     * @param id
     * @return
     */
    public PublicLavatory getPlDetailService(int id) {
        return publicLavatoryMapper.getPlDetail(id);
    }

    /**
     * 删除一个公厕
     *
     * @param id
     * @return
     */
    public int deleteOnePlService(int id) {
        return publicLavatoryMapper.deleteOnePl(id);
    }

    /**
     * 添加公厕
     *
     * @param publicLavatory
     * @return
     */
    public int insertPlService(PublicLavatory publicLavatory) {
        return publicLavatoryMapper.insertPl(publicLavatory);
    }
}
