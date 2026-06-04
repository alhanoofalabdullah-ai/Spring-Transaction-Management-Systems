package com.distributed;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DistributedTransactionService {

    private final DistributedTransactionRepository repository;

    public DistributedTransactionService(DistributedTransactionRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public DistributedTransaction processTransaction(DistributedTransactionRequest request) {

        if (request.getCustomerName() == null || request.getCustomerName().isBlank()) {
            throw new RuntimeException("Customer name is required");
        }

        if (request.getTransactionType() == null || request.getTransactionType().isBlank()) {
            throw new RuntimeException("Transaction type is required");
        }

        if (request.getAmount() == null || request.getAmount() <= 0) {
            throw new RuntimeException("Transaction amount must be greater than zero");
        }

        if (request.getSourceSystem() == null || request.getSourceSystem().isBlank()) {
            throw new RuntimeException("Source system is required");
        }

        if (request.getTargetSystem() == null || request.getTargetSystem().isBlank()) {
            throw new RuntimeException("Target system is required");
        }

        DistributedTransaction transaction = new DistributedTransaction(
                request.getCustomerName(),
                request.getTransactionType(),
                request.getAmount(),
                request.getSourceSystem(),
                request.getTargetSystem(),
                "COMPLETED"
        );

        return repository.save(transaction);
    }

    public List<DistributedTransaction> getAllTransactions() {
        return repository.findAll();
    }
}
