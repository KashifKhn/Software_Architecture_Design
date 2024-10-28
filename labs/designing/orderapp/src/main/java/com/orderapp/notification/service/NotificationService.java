
package com.orderapp.notification.service;

import com.orderapp.order.model.Order;

public interface NotificationService {
  void sendNotification(String message, String recipient);

  void sendOrderConfirmation(Order order);
}
