package com.orderapp.payment.strategy;

import com.orderapp.payment.model.Payment;

public interface PaymentStrategy {
  boolean validate(Payment payment);

  boolean pay(Payment payment);
}
