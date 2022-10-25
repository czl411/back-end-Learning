package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@MapperScan
public interface UserMapper extends BaseMapper<User> {
//    查询所有用户
//    @Select("select * from user")
//    public List<User> find();
//
//    @Insert("insert into user values (#{id},#{username},#{password},#{birthday})")
//    public int insert(User user);
    @Select("select * from user")
    @Results(
            {
                    @Result(column = "id",property = "id"),
                    @Result(column = "username",property = "username"),
                    @Result(column = "password",property = "password"),
                    @Result(column = "birthday",property = "birthday"),
                    @Result(column = "id",property = "orders",javaType = List.class,
                            many = @Many(select = "com.example.demo.mapper.OrderMapper.selectByUid")
                    )
            }
    )
    List<User> selectAllUserAndOrders();
}
