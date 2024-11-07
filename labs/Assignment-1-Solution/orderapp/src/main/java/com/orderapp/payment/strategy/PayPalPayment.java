// PayPalPayment.java
package com.orderapp.payment.strategy;

import com.orderapp.payment.model.Payment;
import org.springframework.stereotype.Component;

@Component
public class PayPalPayment implements PaymentStrategy {
  @Override
  public boolean validate(Payment payment) {
    // validation logic
    return true;
  }

  @Override
  public boolean pay(Payment payment) {
    // payment processing logic
    return true;
  }
}
