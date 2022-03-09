package com.xia.dao;

import com.xia.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    @Insert("insert into user values(#{id},#{name},#{pwd})")
    int addUser(User user);
}
