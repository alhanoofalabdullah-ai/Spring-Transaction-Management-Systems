package com.refund;

public class RefundRequest {

    private String customerName;

    private Double refundAmount;

    private String reason;

    public String getCustomerName() {
        return customerName;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public String getReason() {
        return reason;
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
}
