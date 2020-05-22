package com.iot.test;

import java.math.BigInteger;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-21 20:20:02
 */
public class Test {

    private static BigInteger fab(Integer n) {
        if(n == 1) {
            BigInteger tmp = BigInteger.valueOf(1);
            return tmp;
        }
        return fab(n-1).multiply(BigInteger.valueOf(n));
    }

    private static BigInteger treeN(Integer n) {
        return fab(2*n).divide((fab(n).multiply(fab(n+1))));
    }

    public static void main(String[] args) {
        // 最多 16 个节点
        BigInteger num = treeN(16);
        System.out.println(num.intValue());
//        System.out.println(0x7fffffff);
    }

}
