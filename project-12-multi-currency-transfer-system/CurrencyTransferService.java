package com.currency;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CurrencyTransferService {

    private final CurrencyTransferRepository repository;

    public CurrencyTransferService(CurrencyTransferRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public CurrencyTransfer processTransfer(CurrencyTransferRequest request) {

        if (request.getSenderName() == null || request.getSenderName().isBlank()) {
            throw new RuntimeException("Sender name is required");
        }

        if (request.getReceiverName() == null || request.getReceiverName().isBlank()) {
            throw new RuntimeException("Receiver name is required");
        }

        if (request.getSourceCurrency() == null || request.getSourceCurrency().isBlank()) {
            throw new RuntimeException("Source currency is required");
        }

        if (request.getTargetCurrency() == null || request.getTargetCurrency().isBlank()) {
            throw new RuntimeException("Target currency is required");
        }

        if (request.getAmount() == null || request.getAmount() <= 0) {
            throw new RuntimeException("Transfer amount must be greater than zero");
        }

        if (request.getExchangeRate() == null || request.getExchangeRate() <= 0) {
            throw new RuntimeException("Exchange rate must be greater than zero");
        }

        Double convertedAmount = request.getAmount() * request.getExchangeRate();

        CurrencyTransfer transfer = new CurrencyTransfer(
                request.getSenderName(),
                request.getReceiverName(),
                request.getSourceCurrency(),
                request.getTargetCurrency(),
                request.getAmount(),
                request.getExchangeRate(),
                convertedAmount,
                "COMPLETED"
        );

        return repository.save(transfer);
    }

    public List<CurrencyTransfer> getAllTransfers() {
        return repository.findAll();
    }
}
