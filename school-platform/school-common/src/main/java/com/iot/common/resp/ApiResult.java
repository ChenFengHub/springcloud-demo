package com.iot.common.resp;

import com.iot.common.constants.Constants;
import lombok.Data;

/**
 *@Author cf
 *@Date 2018/5/29 6:54
 *@Description 该类用于同一封装api的返回结果
 */
@Data
public class ApiResult<T> {

    /** 结果返回码：0-成功；400-请求参数不正确；401-用户未授权；403-用户授权，但是缺少对应接口的权限；500-后端服务报错 **/
    private String code = Constants.RESP_STATUS_OK;

    /** 结果信息提示 **/
    private String msg;

    /** 返回的数据 **/
    private T data;

    public ApiResult(){}

    public ApiResult(String code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
