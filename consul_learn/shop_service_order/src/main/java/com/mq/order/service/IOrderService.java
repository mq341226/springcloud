package com.mq.order.service;

import com.mq.domain.Order;

import java.util.List;

public interface IOrderService {
    /**
     * 查询所有
     */
    List<Order> findAll();

    /**
     * 根据id进行查询
     */
    Order findById(Integer id);

    /**
     * 保存
     */
    void save(Order order);

    /**
     * 更新
     */
    void update(Order order);

    /**
     * 删除
     */
    void delete(Integer id);
}
