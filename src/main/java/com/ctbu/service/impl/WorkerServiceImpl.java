package com.ctbu.service.impl;

import com.ctbu.entity.Worker;
import com.ctbu.mapper.WorkerMapper;
import com.ctbu.service.WorkerService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : TangHao
 * @description :
 * @ClassName :WorkerServiceImpl
 * @createTime : 2022/3/20 15:58
 * @updateTime : 2022/3/20 15:58
 * @updateRemark : [说明本次修改内容]
 */
@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerMapper workerMapper;

    /**
     * 查询所有环卫工人
     *
     * @return
     */
    public List<Worker> getAllWorkersService() {
        return workerMapper.getAllWorkers();
    }

    /**
     * 分页查询所有环卫工人
     *
     * @param currPage
     * @return
     */
    public List<Worker> getWorkerByPageService(int currPage) {

        PageHelper.startPage(currPage,8);

        return workerMapper.getWorkerByPage();
    }

    /**
     * 条件查询环卫工人
     *
     * @param worker
     * @return
     */
    public List<Worker> getWorkerByConditionService(Worker worker) {

        return workerMapper.getWorkerByCondition(worker);
    }
}
