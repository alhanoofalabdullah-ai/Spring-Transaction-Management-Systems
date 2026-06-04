package com.financial;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FinancialTransactionService {

    private final FinancialTransactionRepository repository;

    public FinancialTransactionService(FinancialTransactionRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public FinancialTransaction processTransaction(TransactionRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getTransactionType() == null || request.getTransactionType().isBlank()) {
            throw new RuntimeException("Transaction type is required");
        }

        if (request.getAmount() == null || request.getAmount() <= 0) {
            throw new RuntimeException("Transaction amount must be greater than zero");
        }

        if (request.getReferenceNumber() == null || request.getReferenceNumber().isBlank()) {
            throw new RuntimeException("Reference number is required");
        }

        String transactionType = request.getTransactionType().toUpperCase();

        String status;

        if (
                transactionType.equals("DEPOSIT") ||
                transactionType.equals("WITHDRAWAL") ||
                transactionType.equals("PAYMENT") ||
                transactionType.equals("TRANSFER")
        ) {
            status = "SUCCESS";
        } else {
            status = "FAILED";
        }

        FinancialTransaction transaction = new FinancialTransaction(
                request.getCustomerName(),
                transactionType,
                request.getAmount(),
                request.getReferenceNumber(),
                status
        );

        return repository.save(transaction);
    }

    public List<FinancialTransaction> getAllTransactions() {
        return repository.findAll();
    }
}
