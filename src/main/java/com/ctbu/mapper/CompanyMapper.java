package com.ctbu.mapper;

import com.ctbu.entity.Company;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :CompanyMapper
 * @createTime : 2022/3/20 9:37
 */
public interface CompanyMapper {
    /**
     * 显示所有环卫公司
     * @return
     */
    List<Company> getAllCompany();

    /**
     * 分页查询
     * @return
     */
    List<Company> getCompanyByPage();

    /**
     * 条件查询环卫公司
     * @param company
     * @return
     */
    List<Company> getCompanyByCondition(Company company);

    /**
     * 添加环卫公司
     * @param company
     * @return
     */
    int addCompany(Company company);

    /**
     * 删除环卫公司
     * @param id
     * @return
     */
    int deleteCompany(int id);

    /**
     * 修改环卫公司
     * @param company
     * @return
     */
    int updateCompany(Company company);
}
