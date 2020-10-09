package com.mq.user.dao;

import com.mq.domain.Order;
import com.mq.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户的持久层接口
 */
@Mapper
public interface IUsrerDao {
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
