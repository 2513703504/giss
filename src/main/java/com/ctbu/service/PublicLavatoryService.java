package com.ctbu.service;

import com.ctbu.entity.PublicLavatory;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :PublicLavatoryService
 * @createTime : 2022/3/20 15:47
 */
public interface PublicLavatoryService {

    /**
     * 查询所有公厕
     * @return
     */
    List<PublicLavatory> getPlService();

    /**
     * 分页查询公厕
     * @param currPage
     * @return
     */
    List<PublicLavatory> getPlByPageService(int currPage);

    /**
     * 条件查询
     * @param plAddress
     * @return
     */
    List<PublicLavatory> getPlByConditionService(String plAddress);

    /**
     * 显示公厕详细信息
     * @param id
     * @return
     */
    PublicLavatory getPlDetailService(int id);

    /**
     * 删除一个公厕
     * @param id
     * @return
     */
    int deleteOnePlService(int id);

    /**
     * 添加公厕
     * @param publicLavatory
     * @return
     */
    int insertPlService(PublicLavatory publicLavatory);
}
