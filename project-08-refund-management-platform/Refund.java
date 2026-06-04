package com.refund;

import jakarta.persistence.*;

@Entity
@Table(name = "refunds")
public class Refund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private Double refundAmount;

    private String reason;

    private String status;

    public Refund() {
    }

    public Refund(String customerName,
                  Double refundAmount,
                  String reason,
                  String status) {
        this.customerName = customerName;
        this.refundAmount = refundAmount;
        this.reason = reason;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
