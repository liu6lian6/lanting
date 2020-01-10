package com.kede.springbootmybatis.sys.mapper;

import com.kede.springbootmybatis.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-01-09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

@Select("select * from user")
List<User> mylist();
//List<User> userList();
}
