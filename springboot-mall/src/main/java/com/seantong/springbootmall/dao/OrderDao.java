package com.seantong.springbootmall.dao;

import com.seantong.springbootmall.dto.OrderQueryParams;
import com.seantong.springbootmall.model.Order;
import com.seantong.springbootmall.model.OrderItem;

import java.net.Inet4Address;
import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);


}
