
package com.orderapp.payment.service;

import com.orderapp.payment.model.Payment;

public interface PaymentService {
  boolean validatePayment(Payment payment);

  boolean processTransaction(Payment payment);
}
