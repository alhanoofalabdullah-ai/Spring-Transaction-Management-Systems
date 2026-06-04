package com.distributed;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DistributedTransactionController {

    private final DistributedTransactionService service;

    public DistributedTransactionController(DistributedTransactionService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Distributed Transaction Demo Running";
    }

    @PostMapping("/distributed-transactions")
    public DistributedTransaction processTransaction(
            @RequestBody DistributedTransactionRequest request
    ) {
        return service.processTransaction(request);
    }

    @GetMapping("/distributed-transactions")
    public List<DistributedTransaction> getAllTransactions() {
        return service.getAllTransactions();
    }
}
