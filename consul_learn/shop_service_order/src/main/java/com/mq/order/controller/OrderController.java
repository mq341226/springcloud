package com.mq.order.controller;

import com.mq.domain.Product;
import com.mq.order.service.IOrderService;
import com.mq.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 订单的控制类
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    /*注入servie*/
    @Autowired
    private IOrderService orderService;

    /*注入RestTemplate*/
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;



    /**
     * 查询所有方法
     */
    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }

    /**
     * 根据id进行查询
     */
    @GetMapping("/{id}")
    public Order findById(@PathVariable Integer id){
        return orderService.findById(id);
    }

    /**
     * 保存
     */
    @PostMapping
    public String save(@RequestBody Order order){
        orderService.save(order);
        return "保存成功";
    }

    /**
     * 更新
     */
    @PutMapping
    public String update(@RequestBody Order order) {
        orderService.update(order);
        return "更新成功";
    }

    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        orderService.delete(id);
        return "删除成功";
    }

    /**
     * 下订单
     */
    @GetMapping("buy/{id}")
    public Product order(@PathVariable Integer id){
        Product product = restTemplate.getForObject("http://shop-service-product/product/" + id, Product.class);
        return product;
    }
}
