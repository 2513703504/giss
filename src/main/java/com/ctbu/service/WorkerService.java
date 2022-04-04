package com.ctbu.service;

import com.ctbu.entity.Worker;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :WorkerService
 * @createTime : 2022/3/20 15:51
 */
public interface WorkerService {

    /**
     * 查询所有环卫工人
     * @return
     */
    List<Worker> getAllWorkersService();

    /**
     * 分页查询所有环卫工人
     * @param currPage
     * @return
     */
    List<Worker> getWorkerByPageService(int currPage);

    /**
     * 条件查询环卫工人
     * @param worker
     * @return
     */
    List<Worker> getWorkerByConditionService(Worker worker);
}
