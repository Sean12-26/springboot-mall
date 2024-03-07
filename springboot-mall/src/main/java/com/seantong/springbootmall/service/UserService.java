package com.seantong.springbootmall.service;

import com.seantong.springbootmall.dto.OrderQueryParams;
import com.seantong.springbootmall.dto.UserLoginRequest;
import com.seantong.springbootmall.dto.UserRegisterRequest;
import com.seantong.springbootmall.model.Order;
import com.seantong.springbootmall.model.User;

import java.util.List;

public interface UserService {


    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
    User login(UserLoginRequest userLoginRequest);
}
