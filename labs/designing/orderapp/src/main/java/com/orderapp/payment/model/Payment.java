package com.orderapp.payment.model;

import java.util.UUID;

public class Payment {
  private UUID id;
  private String method;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

}
