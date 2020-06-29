package com.iot.service;

import com.iot.common.resp.ApiResult;
import com.iot.entity.StudentReq;
import com.iot.entity.StudentResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 16:16:40
 */
public interface IStudentService {

    @PostMapping(value = "/student/query")
    ApiResult<StudentResp> queryStudent(@RequestBody @Valid StudentReq param);

}
