package com.hezs.ssm.service;

import com.hezs.ssm.domain.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll() throws Exception;
}
