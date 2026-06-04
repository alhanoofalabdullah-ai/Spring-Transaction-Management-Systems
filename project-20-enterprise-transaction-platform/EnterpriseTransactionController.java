package com.enterprise;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseTransactionController {

    private final EnterpriseTransactionService service;

    public EnterpriseTransactionController(EnterpriseTransactionService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Enterprise Transaction Platform Running";
    }

    @PostMapping("/enterprise-transactions")
    public EnterpriseTransaction createTransaction(
            @RequestBody EnterpriseTransactionRequest request
    ) {
        return service.processTransaction(request);
    }

    @GetMapping("/enterprise-transactions")
    public List<EnterpriseTransaction> getAllTransactions() {
        return service.getAllTransactions();
    }
}
