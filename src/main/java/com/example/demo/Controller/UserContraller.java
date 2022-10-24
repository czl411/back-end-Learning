package com.example.demo.Controller;

import com.example.demo.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 * restful 风格
 */
@RestController
public class UserContraller {
    @ApiOperation("获取用户信息by ID")    //方法注释，用于swagger显示
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id){
        System.out.println(id);
        return "get user by ID";
    }

    @PostMapping("/user")
    public String save(User user){
        return "添加用户";
    }

    @PutMapping("/user")
    public String update(User user){
        return "用户更新";
    }

    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable int id){
        System.out.println(id);
        return "根据ID删除用户";
    }

}
