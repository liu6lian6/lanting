package com.kede.springbootmybatis.sys.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kede.springbootmybatis.sys.entity.User;
import com.kede.springbootmybatis.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-09
 */
@RestController

@RequestMapping("/")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping(value = "/add")
    public String addMulQuestion(@RequestParam(value = "books[]", required = false) ArrayList<String> books) {
        System.out.println("账号为：" + books.get(0) + "密码为：" + books.get(1));
        QueryWrapper<User> eq = new QueryWrapper<>();
        User user = iUserService.getOne(eq.eq("username", books.get(0)));
        User pas = iUserService.getOne(eq.eq("password", books.get(1)));
        if (user == null) {
            System.out.println("账号不存在");
            return "账号不存在";
        } else {
            System.out.println("账号正确");
            if (pas != null) {
                System.out.println("登陆成功");
                return "登陆成功";
            } else {
                System.out.println("密码错误");
                return "密码错误";
            }
        }
    }

    @PostMapping(value = "/login")
    public String login(String username, String password, User user111) {
        System.out.println("账号为：" + username + "密码为：" + password);
        QueryWrapper<User> eq = new QueryWrapper<>();
        User user = iUserService.getOne(eq.eq("username", username).eq("password",password));

        if (user!=null) {
            System.out.println("登陆成功");
            return "登陆成功";
        }
        else {
            System.out.println(username + password);
            System.out.println(user);
            return "用户名或密码错误";
        }

//        User pas = iUserService.getOne(eq.eq("password", password));

//        if ((user != null) & (pas!=null)) {
//            System.out.println("登陆成功");
//            return "登陆成功";
//
//        } else if ((pas == null)) {
//            System.out.println("密码错误");
//            return "密码错误";
//        } else if (user == null) {
//
//            System.out.println("账号不存在");
//            return "账号不存在";
//        } else {
//            System.out.println(username + password);
//            return "登陆失败";
//        }
    }

}
