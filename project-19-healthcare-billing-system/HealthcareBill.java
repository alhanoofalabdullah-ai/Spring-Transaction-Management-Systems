package com.healthcare;

import jakarta.persistence.*;

@Entity
@Table(name = "healthcare_bills")
public class HealthcareBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;

    private String serviceName;

    private Double serviceCost;

    private Double insuranceCoverage;

    private Double finalAmount;

    private String status;

    public HealthcareBill() {
    }

    public HealthcareBill(String patientName,
                          String serviceName,
                          Double serviceCost,
                          Double insuranceCoverage,
                          Double finalAmount,
                          String status) {
        this.patientName = patientName;
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
        this.insuranceCoverage = insuranceCoverage;
        this.finalAmount = finalAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Double getServiceCost() {
        return serviceCost;
    }

    public Double getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public Double getFinalAmount() {
        return finalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceCost(Double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public void setInsuranceCoverage(Double insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }

    public void setFinalAmount(Double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
