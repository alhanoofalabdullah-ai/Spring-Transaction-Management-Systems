package com.claims;

public class InsuranceClaimRequest {

    private String customerName;

    private String policyNumber;

    private Double claimAmount;

    private String claimReason;

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
}
