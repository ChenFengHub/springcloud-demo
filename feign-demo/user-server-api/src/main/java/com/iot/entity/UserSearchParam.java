package com.iot.entity;

import java.io.Serializable;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-09 14:14:25
 */
public class UserSearchParam implements Serializable {

    private static final long serialVersionUID = 8454365467827854231L;

    /** 用户昵称查询条件 **/
    private String nickName;

    /** 电话查询条件 **/
    private String telephone;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
