package com.orderapp.payment.dto;

public class PaymentResponseDTO {

  private String status;
  private String transactionId;

  public PaymentResponseDTO(String status, String transactionId) {
    this.status = status;
    this.transactionId = transactionId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

}
