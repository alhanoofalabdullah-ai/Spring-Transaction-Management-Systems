package com.reservation;

public class ReservationRequest {

    private String customerName;

    private String serviceName;

    private Integer numberOfDays;

    private Double dailyRate;

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
}
