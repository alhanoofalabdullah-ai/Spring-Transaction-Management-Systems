package com.enterprise;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EnterpriseTransactionService {

    private final EnterpriseTransactionRepository repository;

    public EnterpriseTransactionService(EnterpriseTransactionRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public EnterpriseTransaction processTransaction(EnterpriseTransactionRequest request) {

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

        if (
                !transactionType.equals("PAYMENT") &&
                !transactionType.equals("TRANSFER") &&
                !transactionType.equals("REFUND") &&
                !transactionType.equals("BILLING") &&
                !transactionType.equals("PAYROLL") &&
                !transactionType.equals("PROCUREMENT") &&
                !transactionType.equals("HEALTHCARE_BILLING")
        ) {
            throw new RuntimeException("Unsupported transaction type");
        }

        EnterpriseTransaction transaction = new EnterpriseTransaction(
                request.getCustomerName(),
                transactionType,
                request.getAmount(),
                request.getReferenceNumber(),
                "SUCCESS"
        );

        return repository.save(transaction);
    }

    public List<EnterpriseTransaction> getAllTransactions() {
        return repository.findAll();
    }
}
