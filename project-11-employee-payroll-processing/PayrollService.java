package com.payroll;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PayrollService {

    private final PayrollRepository repository;

    public PayrollService(PayrollRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Payroll processPayroll(PayrollRequest request) {

        if (request.getEmployeeName() == null || request.getEmployeeName().isBlank()) {
            throw new RuntimeException("Employee name is required");
        }

        if (request.getDepartment() == null || request.getDepartment().isBlank()) {
            throw new RuntimeException("Department is required");
        }

        if (request.getSalaryAmount() == null || request.getSalaryAmount() <= 0) {
            throw new RuntimeException("Salary amount must be greater than zero");
        }

        Payroll payroll = new Payroll(
                request.getEmployeeName(),
                request.getDepartment(),
                request.getSalaryAmount(),
                "PROCESSED"
        );

        return repository.save(payroll);
    }

    public List<Payroll> getAllPayrollRecords() {
        return repository.findAll();
    }
}
