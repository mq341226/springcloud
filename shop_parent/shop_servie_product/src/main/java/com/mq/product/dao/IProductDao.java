package com.mq.product.dao;

import com.mq.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品的持久层接口
 */

@Mapper
public interface IProductDao {
    /**
     * 查询所有
     */
    List<Product> findAll();

    /**
     * 根据id进行查询
     */
    Product findById(Integer id);

    /**
     * 保存
     */
    void save(Product product);

    /**
     * 更新
     */
    void update(Product product);

    /**
     * 删除
     */
    void delete(Integer id);
}
