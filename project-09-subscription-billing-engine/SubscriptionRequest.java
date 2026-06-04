package com.subscription;

public class SubscriptionRequest {

    private String customerName;

    private String planName;

    private Double monthlyFee;

    public String getCustomerName() {
        return customerName;
    }

    public String getPlanName() {
        return planName;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
