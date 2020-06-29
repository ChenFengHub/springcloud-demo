package com.iot.acs.feign;

import com.iot.basic.entity.StudentReq;
import com.iot.basic.entity.StudentResp;
import com.iot.common.constants.Constants;
import com.iot.common.resp.ApiResult;

import javax.validation.Valid;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 20:20:21
 */
public class StudentFallback implements StudentFeign {
    @Override
    public ApiResult<StudentResp> queryStudent(@Valid StudentReq param) {
        ApiResult res = new ApiResult();
        res.setCode(Constants.RESP_STATUS_INTERNAL_ERROR);
        res.setMsg("获取学生信息失败！");
        return res;
    }
}
