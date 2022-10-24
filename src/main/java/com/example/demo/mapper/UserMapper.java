package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface UserMapper extends BaseMapper<User> {
//    查询所有用户
//    @Select("select * from user")
//    public List<User> find();
//
//    @Insert("insert into user values (#{id},#{username},#{password},#{birthday})")
//    public int insert(User user);

}
