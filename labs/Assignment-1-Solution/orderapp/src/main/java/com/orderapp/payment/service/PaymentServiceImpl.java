package com.orderapp.payment.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.orderapp.payment.model.Payment;
import com.orderapp.payment.strategy.PaymentStrategy;

@Service
public class PaymentServiceImpl implements PaymentService {

  private final PaymentStrategy paymentStrategy;

  public PaymentServiceImpl(@Qualifier("creditCardPayment") PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  @Override
  public boolean validatePayment(Payment payment) {
    return paymentStrategy.validate(payment);
  }

  @Override
  public boolean processTransaction(Payment payment) {
    return paymentStrategy.pay(payment);
  }
}
