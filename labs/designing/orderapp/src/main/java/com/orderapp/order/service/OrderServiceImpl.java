package com.orderapp.order.service;

import com.orderapp.notification.service.NotificationService;
import com.orderapp.order.dto.OrderRequestDTO;
import com.orderapp.order.model.Order;
import com.orderapp.payment.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
  @Autowired
  private PaymentService paymentService;

  @Autowired
  private NotificationService notificationService;

  // @Overrcfjde
  // public void placeOrder(Order order) {
  // if (paymentService.validatePayment(order.getPaymentInfo())) {
  // order.setStatus("Placed");
  // notificationService.sendOrderConfirmation(order);
  // } else {
  // order.setStatus("Payment Failed");
  // }
  // }

  @Override
  public void placeOrder(OrderRequestDTO orderRequest) {
    if (paymentService.validatePayment(order.getPaymentInfo())) {
      order.setStatus("Placed");
      notificationService.sendOrderConfirmation(order);
    } else {
      order.setStatus("Payment Failed");
    }
  }

  @Override
  public String getOrderStatus(Long orderId) {
    return "Order Status for " + orderId;
  }

  @Override
  public void updateOrderStatus(Long orderId, String status) {
    // update logic here
  }

}
