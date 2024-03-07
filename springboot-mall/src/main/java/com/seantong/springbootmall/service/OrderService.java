package com.seantong.springbootmall.service;

import com.seantong.springbootmall.dto.CreateOrderRequest;
import com.seantong.springbootmall.dto.OrderQueryParams;
import com.seantong.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}

