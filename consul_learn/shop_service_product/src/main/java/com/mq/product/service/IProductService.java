package com.mq.product.service;

import com.mq.domain.Product;

import java.util.List;

public interface IProductService {
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
