package com.mq.user.controller;


import com.mq.domain.User;
import com.mq.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户的控制层
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /*注入servie*/
    @Autowired
    private IUserService userService;

    /**
     * 查询所有方法
     */
    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 根据id进行查询
     */
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }

    /**
     * 保存
     */
    @PostMapping
    public String save(@RequestBody User user){
        userService.save(user);
        return "保存成功";
    }

    /**
     * 更新
     */
    @PutMapping
    public String update(@RequestBody User user) {
        userService.update(user);
        return "更新成功";
    }

    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        userService.delete(id);
        return "删除成功";
    }
}
