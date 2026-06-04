package com.reservation;

import jakarta.persistence.*;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String serviceName;

    private Integer numberOfDays;

    private Double dailyRate;

    private Double totalAmount;

    private String status;

    public Reservation() {
    }

    public Reservation(String customerName,
                       String serviceName,
                       Integer numberOfDays,
                       Double dailyRate,
                       Double totalAmount,
                       String status) {
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public Double getDailyRate() {
        return dailyRate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setDailyRate(Double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
