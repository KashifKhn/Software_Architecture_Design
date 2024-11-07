package com.orderapp.notification.service;

import org.springframework.stereotype.Service;

import com.orderapp.order.model.Order;

@Service
public class NotificationServiceImpl implements NotificationService {
  @Override
  public void sendNotification(String message, String recipient) {
    System.out.println("Notification sent to " + recipient + ": " + message);
  }

  @Override
  public void sendOrderConfirmation(Order order) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sendOrderConfirmation'");
  }
}
