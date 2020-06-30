package com.iot.acs.service.impl;

import com.iot.acs.entity.RecordReq;
import com.iot.acs.entity.RecordResp;
import com.iot.acs.feign.StudentServiceFeign;
import com.iot.acs.service.IRecordService;
import com.iot.basic.entity.StudentReq;
import com.iot.basic.entity.StudentResp;
import com.iot.common.constants.Constants;
import com.iot.common.resp.ApiResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 17:17:42
 */
@RestController
public class RecordServiceImpl implements IRecordService {

    @Autowired
    private StudentServiceFeign studentFeign;

    @Override
    public ApiResult<RecordResp> generateRecord(@Valid RecordReq param) {
        ApiResult<RecordResp> res = new ApiResult();

        // 获取对应学生人员信息
        StudentReq query = new StudentReq();
        query.setStudentNo(param.getStudentNo());
        ApiResult<StudentResp> studentRes = studentFeign.queryStudent(query);
        if(!"0".equals(studentRes.getCode())) {
            // 获取学生信息失败
            res.setCode(studentRes.getCode());
            res.setMsg(studentRes.getMsg());
        } else {
            // 模拟生成门禁刷卡记录
            RecordResp recordResp = new RecordResp();
            recordResp.setDevName(param.getDevName());
            recordResp.setStudentName("name." + studentRes.getData().getStudentName());
            recordResp.setStudentNo(studentRes.getData().getStudentNo());
            res.setData(recordResp);
        }
        return res;
    }

    @Override
    @HystrixCommand(fallbackMethod = "queryRecordFallback",
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value ="30000"),
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value ="60")
            })
    public ApiResult<RecordResp> queryRecord() {
        ApiResult<RecordResp> res = new ApiResult();

        // 模拟查询门禁刷卡记录
        RecordResp recordResp = new RecordResp();
        recordResp.setDevName("test");
        recordResp.setStudentName("name.test");
        recordResp.setStudentNo("test");

        res.setData(recordResp);
        return res;
    }

    public ApiResult<RecordResp> queryRecordFallback() {
        ApiResult<RecordResp> res = new ApiResult();
        res.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
        res.setMsg("查询门禁记录接口发生熔断！");
        return res;
    }
}
