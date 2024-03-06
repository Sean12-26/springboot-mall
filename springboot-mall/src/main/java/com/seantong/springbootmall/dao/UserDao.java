package com.seantong.springbootmall.dao;

import com.seantong.springbootmall.dto.UserRegisterRequest;
import com.seantong.springbootmall.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
