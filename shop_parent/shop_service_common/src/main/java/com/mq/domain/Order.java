package com.mq.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单的实体类
 */
@Data
public class Order {
    /**
     * `id` int(11)
     * `user_id` int(11)
     * `product_id` int(11)
     * `number` int(11)
     * `price` decimal(10,2)
     * `amount` decimal(10,2)
     * `product_name` varchar(40)
     * `username` varchar(40)
     */
    //id
    private Integer id;
    //用户id
    private Integer user_id;
    //商品id
    private Integer product_id;
    //数量
    private Integer number;
    //价格
    private BigDecimal price;
    //合计
    private BigDecimal amount;
    //商品名称
    private String product_name;
    //用户名称
    private String username;

}
