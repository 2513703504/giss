package com.ctbu.mapper;

import com.ctbu.entity.PublicLavatory;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :PublicLavatoryMapper
 * @createTime : 2022/3/20 15:40
 */
public interface PublicLavatoryMapper {

    /**
     * 查询所有公测 地图展示
     * @return
     */
    List<PublicLavatory> getAllPl();

    /**
     * 分页查询所有公厕
     * @return
     */
    List<PublicLavatory> getPlByPage();

    /**
     * 条件查询
     * @param publicLavatory
     * @return
     */
    List<PublicLavatory> getPlByCondition(PublicLavatory publicLavatory);

    /**
     * 查询公厕详细信息
     * @param id
     * @return
     */
    PublicLavatory getPlDetail(int id);

    /**
     * 删除一个公厕信息
     * @param id
     * @return
     */
    int deleteOnePl(int id);

    /**
     * 添加公厕
     * @param publicLavatory
     * @return
     */
    int insertPl(PublicLavatory publicLavatory);
}
