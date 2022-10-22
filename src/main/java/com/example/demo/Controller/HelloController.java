package com.example.demo.Controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "你好阿21！";
    }
    @RequestMapping(value = "/login1",method = RequestMethod.POST)
    public String login1(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "login成功！";
    }

    @RequestMapping(value = "/login2",method = RequestMethod.POST)
    public String login2(User user){
        return user.getPassword();
    }

    @RequestMapping(value = "/login3",method = RequestMethod.POST)
    public String login3(@RequestBody User user){
        return user.getPassword();
    }
}
