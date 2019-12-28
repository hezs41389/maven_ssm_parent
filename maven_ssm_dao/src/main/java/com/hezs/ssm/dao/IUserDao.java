package com.hezs.ssm.dao;

import com.hezs.ssm.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {

    //查询所以用户
    @Select("select * from user")
    public List<User> findAll() throws Exception;
}
