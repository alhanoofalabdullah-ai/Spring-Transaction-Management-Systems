package com.payroll;

public class PayrollRequest {

    private String employeeName;

    private String department;

    private Double salaryAmount;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalaryAmount() {
        return salaryAmount;
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
}
