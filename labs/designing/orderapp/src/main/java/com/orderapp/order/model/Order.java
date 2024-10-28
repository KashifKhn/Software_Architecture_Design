package com.orderapp.order.model;

import java.util.UUID;

import com.orderapp.payment.model.Payment;

public class Order {
  private UUID id;
  private String status;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Payment getPaymentInfo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPaymentInfo'");
  }

}
