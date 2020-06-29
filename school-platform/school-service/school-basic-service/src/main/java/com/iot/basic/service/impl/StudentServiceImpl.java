package com.iot.basic.service.impl;

import com.iot.basic.entity.StudentReq;
import com.iot.basic.entity.StudentResp;
import com.iot.basic.service.IStudentService;
import com.iot.common.resp.ApiResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Random;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 17:17:42
 */
@RestController
public class StudentServiceImpl implements IStudentService {
    @Override
    public ApiResult<StudentResp> queryStudent(StudentReq param) {
        ApiResult res = new ApiResult();

        // 模拟查询操作
        StudentResp studentResp = new StudentResp();
        studentResp.setId("id." + param.getStudentNo());
        studentResp.setStudentName("name." + param.getStudentNo());
        studentResp.setStudentNo(param.getStudentNo());

        res.setData(studentResp);
        return res;
    }
}
