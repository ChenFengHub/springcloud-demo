package com.iot.acs.entity;

import lombok.Data;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 19:19:23
 */
@Data
public class RecordResp {

    /** 设备名称 **/
    private String devName;

    /** 学生编号 **/
    private String studentNo;

    /** 学生姓名 **/
    private String studentName;

}
