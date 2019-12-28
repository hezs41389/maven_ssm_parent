package com.hezs.ssm.service.impl;

import com.hezs.ssm.dao.IUserDao;
import com.hezs.ssm.domain.User;
import com.hezs.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() throws Exception {
        return userDao.findAll();
    }
}
