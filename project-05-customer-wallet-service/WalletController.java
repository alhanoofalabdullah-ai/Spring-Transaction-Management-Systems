package com.wallet;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(
            WalletService walletService
    ) {
        this.walletService = walletService;
    }

    @GetMapping("/")
    public String home() {
        return "Customer Wallet Service Running";
    }

    @PostMapping("/wallet/deposit")
    public Wallet deposit(
            @RequestBody WalletRequest request
    ) {
        return walletService.deposit(request);
    }

    @PostMapping("/wallet/withdraw")
    public Wallet withdraw(
            @RequestBody WalletRequest request
    ) {
        return walletService.withdraw(request);
    }

    @GetMapping("/wallets")
    public List<Wallet> getWallets() {
        return walletService.getWallets();
    }
}
