package com.ctbu.mapper;

import com.ctbu.entity.Worker;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @InterfaceName :WorkerMapper
 * @createTime : 2022/3/20 15:45
 */
public interface WorkerMapper {

    /**
     * 查询所有环卫工人
     * @return
     */
    List<Worker> getAllWorkers();

    /**
     * 分页查询环卫工人
     * @return
     */
    List<Worker> getWorkerByPage();

    /**
     * 条件查询环卫工人
     * @param worker
     * @return
     */
    List<Worker> getWorkerByCondition(Worker worker);
}
