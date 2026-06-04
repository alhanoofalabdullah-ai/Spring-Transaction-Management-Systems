package com.healthcare;

public class HealthcareBillRequest {

    private String patientName;

    private String serviceName;

    private Double serviceCost;

    private Double insuranceCoverage;

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
}
