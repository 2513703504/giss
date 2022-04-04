package com.ctbu.service.impl;

import com.ctbu.entity.Company;
import com.ctbu.mapper.CompanyMapper;
import com.ctbu.mapper.UserMapper;
import com.ctbu.service.CompanyService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :CompanyServiceImpl
 * @createTime : 2022/3/20 9:45
 * @updateTime : 2022/3/20 9:45
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    /**
     * 业务层 展示所有环卫公司
     *
     * @return
     */
    public List<Company> getAllCompanyService() {
        return companyMapper.getAllCompany();
    }

    /**
     * 分页查询所有环卫
     *
     * @return
     */
    public List<Company> getCompanyByPageService(int currPage) {
        PageHelper.startPage(currPage,8);
        return companyMapper.getCompanyByPage();
    }

    /**
     * 按条件查询环卫公司
     *
     * @param company
     * @return
     */
    public List<Company> getCompanyByConditionService(Company company) {
        return companyMapper.getCompanyByCondition(company);
    }

    /**
     * 添加环卫公司
     *
     * @param company
     * @return
     */
    public int addCompanyService(Company company) {
        return companyMapper.addCompany(company);
    }

    /**
     * 删除环卫公司
     *
     * @param id
     * @return
     */
    public int deleteCompanyService(int id) {
        return companyMapper.deleteCompany(id);
    }

    /**
     * 修改环卫公司
     *
     * @param company
     * @return
     */
    public int updateCompanyService(Company company) {
        return companyMapper.updateCompany(company);
    }

}
