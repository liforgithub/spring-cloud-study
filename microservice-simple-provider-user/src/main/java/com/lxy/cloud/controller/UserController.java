package com.lxy.cloud.controller;

import com.lxy.cloud.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class UserController {

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = new User();
        if (1 == id) {
            user.setId(1L);
            user.setUsername("account1");
            user.setName("张三");
            user.setAge(20);
            user.setBalance(new BigDecimal(100.00));
        } else if (2 == id) {
            user.setId(2L);
            user.setUsername("account2");
            user.setName("李四");
            user.setAge(28);
            user.setBalance(new BigDecimal(180.00));
        } else {
            user.setId(3L);
            user.setUsername("account3");
            user.setName("王五");
            user.setAge(32);
            user.setBalance(new BigDecimal(280.00));
        }

        return user;
    }
}
