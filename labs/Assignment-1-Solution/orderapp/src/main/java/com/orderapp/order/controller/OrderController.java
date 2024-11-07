package com.orderapp.order.controller;

import com.orderapp.order.dto.OrderRequestDTO;
import com.orderapp.order.model.Order;
import com.orderapp.order.service.OrderService;

import java.util.UUID;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping("/place")
  public Order placeOrder(@RequestBody OrderRequestDTO orderRequest) {
    return orderService.placeOrder(orderRequest);
  }

  @GetMapping("/{orderId}/status")
  public String getOrderStatus(@PathVariable UUID orderId) {
    return orderService.getOrderStatus(orderId);
  }

  @PutMapping("/{orderId}/status")
  public void updateOrderStatus(@PathVariable UUID orderId, @RequestParam String status) {
    orderService.updateOrderStatus(orderId, status);
  }
}
