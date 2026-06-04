package com.financial;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FinancialTransactionController {

    private final FinancialTransactionService service;

    public FinancialTransactionController(FinancialTransactionService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Enterprise Financial Platform Running";
    }

    @PostMapping("/transactions")
    public FinancialTransaction createTransaction(
            @RequestBody TransactionRequest request
    ) {
        return service.processTransaction(request);
    }

    @GetMapping("/transactions")
    public List<FinancialTransaction> getAllTransactions() {
        return service.getAllTransactions();
    }
}
