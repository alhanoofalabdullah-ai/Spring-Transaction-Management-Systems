package com.banking.controller;

import com.banking.dto.TransferRequest;
import com.banking.service.TransferService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfer")
public class TransferController {

    private final TransferService transferService;

    public TransferController(
            TransferService transferService
    ) {
        this.transferService = transferService;
    }

    @PostMapping
    public String transferMoney(
            @RequestBody TransferRequest request
    ) {
        return transferService.transfer(request);
    }
}
