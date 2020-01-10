package com.kede.springbootmybatis.sys.entity;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
//启动Spring
@SpringBootTest
public class UserTest {
    @Test
    public void getHello() throws Exception {
//        IPage<User> page=new Page();
//        page.setPages(5);
//        page.setCurrent(2);
//        QueryWrapper<User> userQueryWrapper =new QueryWrapper<>();
//        IPage<User> userIPage= new User().selectPage(page,userQueryWrapper);
////        List<User> users= new User().selectAll(page);
//        Assert.assertEquals(0, userIPage.getRecords().size());
    }


}
