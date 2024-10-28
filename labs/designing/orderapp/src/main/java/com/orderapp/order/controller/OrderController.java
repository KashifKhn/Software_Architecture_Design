package com.orderapp.order.controller;

import com.orderapp.order.dto.OrderRequestDTO;
import com.orderapp.order.model.Order;
import com.orderapp.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
  @Autowired
  private OrderService orderService;

  @PostMapping("/place")
  public Order placeOrder(@RequestBody OrderRequestDTO orderRequest) {
    return orderService.placeOrder(orderRequest);
  }
}
