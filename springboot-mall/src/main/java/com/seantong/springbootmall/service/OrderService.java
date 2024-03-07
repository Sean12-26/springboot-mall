package com.seantong.springbootmall.service;

import com.seantong.springbootmall.dto.CreateOrderRequest;
import com.seantong.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}

