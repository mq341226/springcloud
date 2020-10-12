package com.mq.user.service.impl;

import com.mq.domain.Order;
import com.mq.domain.User;
import com.mq.user.dao.IUsrerDao;
import com.mq.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务层类
 */
@Service
public class UserServiceImpl implements IUserService{
    /*注入dao*/
    @Autowired
    private IUsrerDao usrerDao;

    @Override
    public List<User> findAll() {
        return usrerDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }
}
