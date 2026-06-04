package com.claims;

import jakarta.persistence.*;

@Entity
@Table(name = "insurance_claims")
public class InsuranceClaim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String policyNumber;

    private Double claimAmount;

    private String claimReason;

    private String status;

    public InsuranceClaim() {
    }

    public InsuranceClaim(String customerName,
                          String policyNumber,
                          Double claimAmount,
                          String claimReason,
                          String status) {
        this.customerName = customerName;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimReason = claimReason;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public String getClaimReason() {
        return claimReason;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public void setClaimReason(String claimReason) {
        this.claimReason = claimReason;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
