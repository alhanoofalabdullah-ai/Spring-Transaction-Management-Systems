package com.wallet;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WalletService {

    private final WalletRepository repository;

    public WalletService(WalletRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Wallet deposit(WalletRequest request) {

        Wallet wallet = repository.findById(
                request.getWalletId()
        ).orElseThrow();

        wallet.setBalance(
                wallet.getBalance() + request.getAmount()
        );

        return repository.save(wallet);
    }

    @Transactional
    public Wallet withdraw(WalletRequest request) {

        Wallet wallet = repository.findById(
                request.getWalletId()
        ).orElseThrow();

        if(wallet.getBalance() < request.getAmount()) {
            throw new RuntimeException("Insufficient balance");
        }

        wallet.setBalance(
                wallet.getBalance() - request.getAmount()
        );

        return repository.save(wallet);
    }

    public List<Wallet> getWallets() {
        return repository.findAll();
    }
}
