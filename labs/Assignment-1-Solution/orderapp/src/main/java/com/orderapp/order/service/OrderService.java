package com.orderapp.order.service;

import java.util.UUID;

import com.orderapp.order.dto.OrderRequestDTO;
import com.orderapp.order.model.Order;

public interface OrderService {

  Order placeOrder(OrderRequestDTO orderRequest);

  String getOrderStatus(UUID orderId);

  void updateOrderStatus(UUID orderId, String status);
}
