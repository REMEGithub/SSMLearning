package com.xia.dao;

import com.xia.pojo.User;
import com.xia.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UsermapperTest {
    @Test
    public void getUserTest(){
        SqlSession sqlSession=MyBatisUtils.getSqlSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        /*List<User> user=mapper.getUsers();
        for (User user1 : user) {
            System.out.println(user1.toString());
        }*/
        mapper.addUser(new User(4,"xx","1212321"));
        sqlSession.commit();
        sqlSession.close();
    }
}
