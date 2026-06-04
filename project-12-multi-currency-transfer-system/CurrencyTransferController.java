package com.currency;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurrencyTransferController {

    private final CurrencyTransferService service;

    public CurrencyTransferController(CurrencyTransferService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Multi-Currency Transfer System Running";
    }

    @PostMapping("/currency-transfers")
    public CurrencyTransfer createTransfer(
            @RequestBody CurrencyTransferRequest request
    ) {
        return service.processTransfer(request);
    }

    @GetMapping("/currency-transfers")
    public List<CurrencyTransfer> getAllTransfers() {
        return service.getAllTransfers();
    }
}
