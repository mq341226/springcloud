package com.mq.order.dao;

import com.mq.domain.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 订单的持久层接口
 */
@Mapper
public interface IOrderDao {
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
