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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProduct_desc() {
        return product_desc;
    }

    public void setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
}
