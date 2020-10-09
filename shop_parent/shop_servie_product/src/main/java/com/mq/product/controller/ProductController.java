package com.mq.product.controller;

import com.mq.domain.Product;
import com.mq.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    /*注入service*/
    @Autowired
    private IProductService productService;

    /**
     * 查询所有方法
     */
    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    /**
     * 根据id进行查询
     */
    @GetMapping("/{id}")
    public Product findById(@PathVariable Integer id){
        return productService.findById(id);
    }

    /**
     * 保存
     */
    @PostMapping
    public String save(@RequestBody Product product){
        productService.save(product);
        return "保存成功";
    }

    /**
     * 更新
     */
    @PutMapping
    public String update(@RequestBody Product product) {
        productService.update(product);
        return "更新成功";
    }

    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        productService.delete(id);
        return "删除成功";
    }
}
