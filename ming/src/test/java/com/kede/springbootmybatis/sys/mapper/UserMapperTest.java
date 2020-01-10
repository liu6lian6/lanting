package com.kede.springbootmybatis.sys.mapper;

import com.kede.springbootmybatis.sys.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
//启动Spring
@SpringBootTest
public  class UserMapperTest {
    @Autowired
    private  UserMapper userMapper;

    @Test
    public void Test () {
        List<User> mylist = userMapper.mylist();
//        List<User> users = userMapper.userList();
//        Assert.assertEquals(mylist.size(),users.size());
    }


}
