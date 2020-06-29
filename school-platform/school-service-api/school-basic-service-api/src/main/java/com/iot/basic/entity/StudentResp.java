package com.iot.basic.entity;

import lombok.Data;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 16:16:51
 */
@Data
public class StudentResp {

    /** 主键编号 **/
    private String id;

    /** 学生姓名 **/
    private String studentName;

    /** 学号 **/
    private String studentNo;

}
