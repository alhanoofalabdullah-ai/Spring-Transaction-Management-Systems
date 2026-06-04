package com.loan;

import jakarta.persistence.*;

@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private Double monthlyIncome;

    private Double loanAmount;

    private String status;

    public Loan() {
    }

    public Loan(String customerName, Double monthlyIncome, Double loanAmount, String status) {
        this.customerName = customerName;
        this.monthlyIncome = monthlyIncome;
        this.loanAmount = loanAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public String getStatus() {
        return status;
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

    public void setStatus(String status) {
        this.status = status;
    }
}
