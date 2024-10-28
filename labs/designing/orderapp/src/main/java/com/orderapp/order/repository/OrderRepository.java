package com.orderapp.order.repository;

import com.orderapp.order.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
  public Order save(Order order) {
    return order;
  }
}
