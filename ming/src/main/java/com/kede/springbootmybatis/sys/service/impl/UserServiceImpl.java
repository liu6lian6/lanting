package com.kede.springbootmybatis.sys.service.impl;

import com.kede.springbootmybatis.sys.entity.User;
import com.kede.springbootmybatis.sys.mapper.UserMapper;
import com.kede.springbootmybatis.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
