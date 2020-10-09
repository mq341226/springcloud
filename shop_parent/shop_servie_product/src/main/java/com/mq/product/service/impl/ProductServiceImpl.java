package com.mq.product.service.impl;

import com.mq.domain.Product;
import com.mq.product.dao.IProductDao;
import com.mq.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品的业务层实现类
 */

@Service
public class ProductServiceImpl implements IProductService {
    /*注入dao*/
    @Autowired
    private IProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productDao.findById(id);
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void update(Product product) {
        productDao.update(product);
    }

    @Override
    public void delete(Integer id) {
        productDao.delete(id);
    }
}
