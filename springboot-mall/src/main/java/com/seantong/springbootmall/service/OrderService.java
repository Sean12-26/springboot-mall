package com.seantong.springbootmall.service;

import com.seantong.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}

