package com.seantong.springbootmall.service.impl;

import com.seantong.springbootmall.dao.UserDao;
import com.seantong.springbootmall.dto.UserRegisterRequest;
import com.seantong.springbootmall.model.User;
import com.seantong.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId){
       return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest){
        return userDao.createUser(userRegisterRequest);
    }

}