package com.mq.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 用户实体类
 */
@Data
public class User {
    /**
     * `id` int(11)
     * `username` varchar(40)
     * `password` varchar(40)
     * `age` int(3)
     * `balance` decimal(10,2)
     * `address` varchar(80)
     */
    //id
    private Integer id;
    //用户名
    private String username;
    //密码
    private String password;
    //年龄
    private Integer age;
    //余额
    private BigDecimal balance;
    //地址
    private String address;
}
