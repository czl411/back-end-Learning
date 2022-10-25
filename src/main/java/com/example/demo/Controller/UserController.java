package com.example.demo.Controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/findAll")
    public List<User> query(){
        return userMapper.selectAllUserAndOrders();
    }

    @PostMapping("/user")
    public String save(User user){
        int i = userMapper.insert(user);
        if (i > 0){
            return "succed";
        }
        return "failed";
    }

    @GetMapping("/user/findByPage")
    public IPage findByPage(){
        Page<User> page = new Page<>(0,2);
        IPage iPage = userMapper.selectPage(page,null);
        return iPage;
    }

}
