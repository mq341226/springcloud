package com.mq.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * 商品的实体类
 */
@Data
public class Product {
    /*
     `id` int(11)
     `product_name` varchar(40)
     `status` int(2)
     `price` decimal(10,2)
     `product_desc` varchar(255)
     `caption` varchar(255)
     `inventory` int(11)
     */
    //id
    private Integer id;
    //名称
    private String product_name;
    //状态
    private Integer status;
    //价格
    private BigDecimal price;
    //描述
    private String product_desc;
    //说明
    private String caption;
    //存货
    private String inventory;

}
