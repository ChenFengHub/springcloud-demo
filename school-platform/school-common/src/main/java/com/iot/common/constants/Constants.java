package com.iot.common.constants;

/**
 * 用于放置常用的常量
 * Created by cf on 2018/5/29.
 */
public class Constants {
    /** ------------ 自定义状态码 start ---------- **/

    /** 服务码 **/
    public static String SERVER_CODE = "";

    /** 参数错误码 **/
    public static String PARAM_ERR_CODE = "";

    /** 调用接口成功 **/
    public static final String RESP_STATUS_OK = "0";

    /** 用户请求参数错误，取值范围、类型、格式等错误。（原意：url 不存在） **/
    public static final String RESP_STATUS_BADREQUEST = SERVER_CODE + "400" + PARAM_ERR_CODE;

    /** 用户/服务未授权 **/
    public static final String RESP_STATUS_NOAUTH = SERVER_CODE + "401" + PARAM_ERR_CODE;

    /** 用户得到授权，但是缺少接口权限，被禁止调用该接口 **/
    public static final String RESP_STATUS_FORBIDDEN = SERVER_CODE + "403" + PARAM_ERR_CODE;

    /** 后端服务代码错误 **/
    public static final String RESP_STATUS_INTERNAL_ERROR = SERVER_CODE + "500" + PARAM_ERR_CODE;

    /** ------------ 自定义状态码 end ---------- **/

}
