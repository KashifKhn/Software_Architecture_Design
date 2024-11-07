package com.orderapp.order.service;

import com.orderapp.notification.service.NotificationService;
import com.orderapp.order.dto.OrderRequestDTO;
import com.orderapp.order.model.Order;
import com.orderapp.payment.service.PaymentService;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  private final PaymentService paymentService;
  private final NotificationService notificationService;

  public OrderServiceImpl(PaymentService paymentService, NotificationService notificationService) {
    this.paymentService = paymentService;
    this.notificationService = notificationService;
  }

  @Override
  public Order placeOrder(OrderRequestDTO orderRequest) {
    Order order = new Order();
    order.getPaymentInfo();

    if (paymentService.validatePayment(order.getPaymentInfo())) {
      order.setStatus("Placed");
      notificationService.sendOrderConfirmation(order);
    } else {
      order.setStatus("Payment Failed");
    }

    return order;
  }

  @Override
  public String getOrderStatus(UUID orderId) {
    return "Order Status for ID " + orderId + ": [status]";
  }

  @Override
  public void updateOrderStatus(UUID orderId, String status) {
    System.out.println("Updating order ID " + orderId + " to status: " + status);
  }
}
