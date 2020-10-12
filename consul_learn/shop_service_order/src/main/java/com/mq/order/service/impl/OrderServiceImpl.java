package com.mq.order.service.impl;

import com.mq.order.dao.IOrderDao;
import com.mq.order.service.IOrderService;
import com.mq.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单的业务层方法
 */
@Service
public class OrderServiceImpl implements IOrderService {
    /*注入dao*/
    @Autowired
    private IOrderDao orderDao;

    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public Order findById(Integer id) {
        return orderDao.findById(id);
    }

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    public void update(Order order) {
        orderDao.update(order);
    }

    @Override
    public void delete(Integer id) {
        orderDao.delete(id);
    }
}
