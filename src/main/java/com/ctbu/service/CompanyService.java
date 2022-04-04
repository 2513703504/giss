package com.ctbu.service;

import com.ctbu.entity.Company;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :CompanyService
 * @createTime : 2022/3/20 9:44
 */
public interface CompanyService {
    /**
     * 业务层 展示所有环卫公司
     * @return
     */
    List<Company> getAllCompanyService();

    /**
     * 分页查询所有环卫
     * @param currPage
     * @return
     */
    List<Company> getCompanyByPageService(int currPage);

    /**
     * 按条件查询环卫公司
     * @param company
     * @return
     */
    List<Company> getCompanyByConditionService(Company company);

    /**
     * 添加环卫公司
     * @param company
     * @return
     */
    int addCompanyService(Company company);

    /**
     * 删除环卫公司
     * @param id
     * @return
     */
    int deleteCompanyService(int id);

    /**
     * 修改环卫公司
     * @param company
     * @return
     */
    int updateCompanyService(Company company);
}
