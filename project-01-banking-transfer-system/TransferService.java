package com.banking.service;

import com.banking.dto.TransferRequest;
import com.banking.model.Account;
import com.banking.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransferService {

    private final AccountRepository accountRepository;

    public TransferService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public String transfer(TransferRequest request) {

        Account sender = accountRepository.findById(
                request.getFromAccount()
        ).orElseThrow();

        Account receiver = accountRepository.findById(
                request.getToAccount()
        ).orElseThrow();

        if (sender.getBalance() < request.getAmount()) {
            throw new RuntimeException("Insufficient balance");
        }

        sender.setBalance(
                sender.getBalance() - request.getAmount()
        );

        receiver.setBalance(
                receiver.getBalance() + request.getAmount()
        );

        accountRepository.save(sender);
        accountRepository.save(receiver);

        return "Transfer completed successfully";
    }
}
