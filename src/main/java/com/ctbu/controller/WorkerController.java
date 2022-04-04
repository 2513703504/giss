package com.ctbu.controller;

import com.ctbu.entity.Worker;
import com.ctbu.service.WorkerService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : TangHao
 * @description :
 * @ClassName :WorkerController
 * @createTime : 2022/3/20 16:13
 * @updateTime : 2022/3/20 16:13
 * @updateRemark : [说明本次修改内容]
 */
@RestController
@CrossOrigin
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @RequestMapping("listWorkers")
    @ResponseBody
    public List<Worker> getAllWorkers(){
        return workerService.getAllWorkersService();
    }

    @RequestMapping("/listWorkerByPage")
    @ResponseBody
    public Map<Object,Object> getWorkerByPage(int currPage){
        Map<Object,Object> map=new HashMap<Object, Object>();

        List<Worker> workers=workerService.getWorkerByPageService(currPage);
        if(workers.size()==0){
            workers=workerService.getWorkerByPageService(currPage-1);
        }

        PageInfo pageInfo=new PageInfo(workers);
        map.put("workers",workers);
        map.put("pageInfo",pageInfo);
        map.put("status",true);
        return map;
    }

    @RequestMapping("/listWorkerByCondition")
    @ResponseBody
    public Map<Object,Object> getWorkerByCondition(String workerName,String idNumber,String address){
        Worker worker=new Worker();
        if(!"".equals(workerName)){
            worker.setWorkerName(workerName);
        }
        if(!"".equals(idNumber)){
            worker.setIdNumber(idNumber);
        }
        if(!"".equals(address)){
            worker.setAddress(address);
        }
        Map<Object,Object> map=new HashMap<Object, Object>();
        List<Worker> workers=workerService.getWorkerByConditionService(worker);
        map.put("workers",workers);
        map.put("status",false);
        return map;
    }

}
