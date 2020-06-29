package com.iot.acs.service;

import com.iot.acs.entity.RecordReq;
import com.iot.acs.entity.RecordResp;
import com.iot.common.resp.ApiResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 19:19:20
 */
public interface IRecordService {

    @PostMapping(value = "/record/generate")
    ApiResult<RecordResp> generateRecord(@RequestBody @Valid RecordReq param);

    @PostMapping(value = "/record/query")
    ApiResult<RecordResp> queryRecord();

}
