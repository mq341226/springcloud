package com.mq.user.service;

import com.mq.domain.User;
import java.util.List;

public interface IUserService {
    /**
     * 查询所有
     */
    List<User> findAll();

    /**
     * 根据id进行查询
     */
    User findById(Integer id);

    /**
     * 保存
     */
    void save(User user);

    /**
     * 更新
     */
    void update(User user);

    /**
     * 删除
     */
    void delete(Integer id);
}
