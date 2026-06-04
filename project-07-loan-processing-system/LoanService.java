package com.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LoanService {

    private final LoanRepository repository;

    public LoanService(LoanRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Loan processLoan(LoanRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getMonthlyIncome() == null || request.getMonthlyIncome() <= 0) {
            throw new RuntimeException("Monthly income must be greater than zero");
        }

        if (request.getLoanAmount() == null || request.getLoanAmount() <= 0) {
            throw new RuntimeException("Loan amount must be greater than zero");
        }

        String status;

        if (request.getMonthlyIncome() * 5 >= request.getLoanAmount()) {
            status = "APPROVED";
        } else {
            status = "REJECTED";
        }

        Loan loan = new Loan(
                request.getCustomerName(),
                request.getMonthlyIncome(),
                request.getLoanAmount(),
                status
        );

        return repository.save(loan);
    }

    public List<Loan> getAllLoans() {
        return repository.findAll();
    }
}
