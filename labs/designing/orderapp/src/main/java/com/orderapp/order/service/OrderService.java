package com.orderapp.order.service;

import com.orderapp.order.model.Order;
import com.orderapp.order.dto.OrderRequestDTO;

public interface OrderService {
  void placeOrder(OrderRequestDTO orderRequest);

  String getOrderStatus(Long orderId);

  void updateOrderStatus(Long orderId, String status);
}
