package com.example.demo.Controller;

import com.example.demo.entity.Order;
import com.example.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order/findAll")
    public List<Order> findAll(){
        List<Order> orders= orderMapper.selectAllOrdersAndUser();
        return orders;
    }

}
