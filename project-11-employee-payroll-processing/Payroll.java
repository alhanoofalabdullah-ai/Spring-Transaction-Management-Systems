package com.payroll;

import jakarta.persistence.*;

@Entity
@Table(name = "payroll_records")
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeName;

    private String department;

    private Double salaryAmount;

    private String status;

    public Payroll() {
    }

    public Payroll(String employeeName,
                   String department,
                   Double salaryAmount,
                   String status) {
        this.employeeName = employeeName;
        this.department = department;
        this.salaryAmount = salaryAmount;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalaryAmount() {
        return salaryAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalaryAmount(Double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
