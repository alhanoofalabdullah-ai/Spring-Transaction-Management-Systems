package com.loan;

public class LoanRequest {

    private String customerName;

    private Double monthlyIncome;

    private Double loanAmount;

    public String getCustomerName() {
        return customerName;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }
}
