package com.subscription;

import jakarta.persistence.*;

@Entity
@Table(name = "subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String planName;

    private Double monthlyFee;

    private String status;

    public Subscription() {
    }

    public Subscription(String customerName,
                        String planName,
                        Double monthlyFee,
                        String status) {
        this.customerName = customerName;
        this.planName = planName;
        this.monthlyFee = monthlyFee;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPlanName() {
        return planName;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public String getStatus() {
        return status;
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

    public void setStatus(String status) {
        this.status = status;
    }
}
